#include <stdio.h>
#include <stdlib.h>

#define MAX 20
int vertices = 0;
int matrix[MAX][MAX];
int seen[MAX];

struct ListNode {
    int val;
    struct ListNode *next;
};

struct ListNode* adjList[MAX];

struct ListNode* makeNode(int v) {
    struct ListNode* temp = malloc(sizeof(struct ListNode));
    temp->val = v;
    temp->next = NULL;
    return temp;
}

void addVertex() {
    vertices++;
    for (int i=0;i<vertices;i++) {
        adjList[i]=NULL;
        for (int j=0;j<vertices;j++) matrix[i][j]=0;
    }
    printf("vertex inserted\n");
}

void removeVertex() {
    if(vertices>0) {
        for(int i=0;i<vertices;i++){
            struct ListNode *curr=adjList[i],*prev=NULL;
            while(curr){
                if(curr->val==vertices-1){
                    if(prev==NULL) adjList[i]=curr->next;
                    else prev->next=curr->next;
                    free(curr);
                    break;
                }
                prev=curr;
                curr=curr->next;
            }
        }
        struct ListNode *curr=adjList[vertices-1];
        while(curr){
            struct ListNode *t=curr;
            curr=curr->next;
            free(t);
        }
        adjList[vertices-1]=NULL;
        vertices--;
        printf("vertex deleted\n");
    } else printf("no vertices to delete\n");
}

void addEdge(int u,int v) {
    struct ListNode* temp = makeNode(v);
    temp->next = adjList[u];
    adjList[u] = temp;
    matrix[u][v]=1;
}

void dfsVisit(int v) {
    seen[v]=1;
    printf("%d ",v);
    struct ListNode* t=adjList[v];
    while(t){
        if(!seen[t->val]) dfsVisit(t->val);
        t=t->next;
    }
}

void dfsTraverse() {
    for(int i=0;i<vertices;i++) seen[i]=0;
    int s;
    printf("enter start vertex: ");
    scanf("%d",&s);
    dfsVisit(s);
    printf("\n");
}

void primAlgo() {
    int cost[MAX][MAX],dist[MAX],parent[MAX],used[MAX];
    int u,v,n,e=0,min,sum=0;
    printf("enter number of vertices: ");
    scanf("%d",&n);
    printf("enter adjacency matrix:\n");
    for(int i=0;i<n;i++)
        for(int j=0;j<n;j++){
            scanf("%d",&cost[i][j]);
            if(cost[i][j]==0) cost[i][j]=9999;
        }
    for(int i=1;i<n;i++){
        dist[i]=cost[0][i];
        parent[i]=0;
        used[i]=0;
    }
    used[0]=1;
    while(e<n-1){
        min=9999;
        for(int i=1;i<n;i++)
            if(!used[i] && dist[i]<min){
                min=dist[i];
                v=i;
            }
        u=parent[v];
        printf("edge %d: (%d %d) cost:%d\n",e+1,u,v,dist[v]);
        sum+=dist[v];
        used[v]=1;
        for(int i=1;i<n;i++)
            if(!used[i] && cost[v][i]<dist[i]){
                dist[i]=cost[v][i];
                parent[i]=v;
            }
        e++;
    }
    printf("total cost=%d\n",sum);
}

int main() {
    int c,u,v;
    while(1) {
        printf("1 insert vertex\n2 delete vertex\n3 add edge\n4 dfs\n5 prims\n6 exit\n");
        scanf("%d",&c);
        if(c==1) addVertex();
        else if(c==2) removeVertex();
        else if(c==3){
            printf("enter edge u v: ");
            scanf("%d%d",&u,&v);
            addEdge(u,v);
        }
        else if(c==4) dfsTraverse();
        else if(c==5) primAlgo();
        else if(c==6) break;
        else printf("invalid\n");
    }
    return 0;
}
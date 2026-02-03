public class Area {
    public static void main(String args[]){
        //area of rectangle 
        int length = 4;
        int width = 6;
        int area;

        area = length*width;

        System.out.println("area of rectangle: "+area);

        //area of circle
        int r = 4;
        final float pi = 3.14f;
        float areaC;

        areaC = pi*r*r;

        System.out.println("area of circle: "+areaC);
    }
}
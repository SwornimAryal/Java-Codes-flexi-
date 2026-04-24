package rmi;
import java.rmi.*;

public interface AddInterface extends Remote {
    int add(int a, int b) throws RemoteException;
}

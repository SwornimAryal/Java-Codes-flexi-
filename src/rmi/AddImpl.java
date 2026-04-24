package rmi;
import java.rmi.*;
import java.rmi.server.*;

public class AddImpl extends UnicastRemoteObject implements AddInterface {

    public AddImpl() throws RemoteException { }   // constructor must throw

    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
}
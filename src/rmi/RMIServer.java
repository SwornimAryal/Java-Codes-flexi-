package rmi;

import java.rmi.*;

import java.rmi.registry.*;

import rmi.AddImpl;
public class RMIServer {
    public static void main(String[] args) throws Exception {
        AddImpl obj = new AddImpl();

        // Create RMI registry on port 1099 and bind the object
        LocateRegistry.createRegistry(1099);
        Naming.rebind("rmi://localhost/AddService", obj);

        System.out.println("RMI Server is ready...");
    }
}

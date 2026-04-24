package rmi;
import java.rmi.*;

import rmi.AddInterface;

public class RMIClient {
    public static void main(String[] args) throws Exception {
        // Look up the remote object
        AddInterface obj =
            (AddInterface) Naming.lookup("rmi://localhost/AddService");

        int result = obj.add(15, 25);    // call remote method
        System.out.println("Sum from RMI Server: " + result);
    }
}

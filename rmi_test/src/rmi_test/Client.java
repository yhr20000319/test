package rmi_test;

import java.net.MalformedURLException;
import java.rmi.registry.*;
import java.rmi.*;

public class Client {
    private Client() {
    }

    public static void main(String[] args) throws RemoteException, MalformedURLException,NotBoundException {
        String host = (args.length < 1) ? "localhost" : args[0];
        String name = (args.length == 2) ? args[1] : "World";

            String urlo = "rmi://" + host + ":3333/Hello";
            SendMessage stub = (SendMessage) Naming.lookup(urlo);
            System.out.println("link to the server: \n" + urlo);
            Registry registry = LocateRegistry.getRegistry(host);
            //Hello stub = (Hello)registry.lookup("Hello");
            String response = stub.sendMessage("Hello! everyone!");
            System.out.println("Response: " + response);

    }
}
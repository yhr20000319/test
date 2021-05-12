package rmi_test;

import java.rmi.*;

public interface SendMessage extends java.rmi.Remote{
    String sendMessage(String msg) throws java.rmi.RemoteException;
}

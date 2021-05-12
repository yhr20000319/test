package rmi_test;

//import com.sun.xml.internal.ws.resources.SenderMessages;

import java.rmi.*;
import java.rmi.server.*;

public class SendMessageImpl implements SendMessage {
    public SendMessageImpl(){}
    public String sendMessage(String msg){


        return "Send:"+msg+" successfully";
    }
}

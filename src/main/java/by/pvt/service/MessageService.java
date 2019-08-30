package by.pvt.service;


import by.pvt.cmd.SendMessageCmd;
import by.pvt.component.EmailSender;
import by.pvt.pojo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MessageService {

    public final static String FROM_EMAIL = "info@it-academy.by";

    @Autowired
    EmailSender emailSender;

    public  void executeCommand( SendMessageCmd sendMessageCmd){

        Message message = new Message ();
        message.setFrom (FROM_EMAIL);
        message.setBody (sendMessageCmd.messageType.getBody());
        message.setId (new Random ().nextLong ());
        message.setSubject (sendMessageCmd.messageType.getSubject());
        message.setTo (sendMessageCmd.reciverName);
        emailSender.send (message);
    }
}

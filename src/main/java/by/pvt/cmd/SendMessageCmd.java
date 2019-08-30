package by.pvt.cmd;

import by.pvt.service.MessageType;

public class SendMessageCmd {



    public final String reciverName;

    public final MessageType messageType;


    public final String chanel;

    public SendMessageCmd ( String reciverName, MessageType messageType, String chanel){

        this.reciverName = reciverName;
        this.messageType = messageType;
        this.chanel = chanel;
    }

}

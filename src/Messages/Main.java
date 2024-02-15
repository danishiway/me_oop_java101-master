package src.Messages;

import src.Messages.MessageType.AudioMessage;
import src.Messages.MessageType.EmailMessage;
import src.Messages.MessageType.ImageMessage;
import src.Messages.MessageType.TextMessage;

public class Main {
    public static void main(String[] args){
        TextMessage msg1 = new TextMessage();
        msg1.setSender("Sam");
        
        ImageMessage msg2 = new ImageMessage();
        msg2.setSender("John");

        AudioMessage msg3 = new AudioMessage();
        msg3.setSender("Arya");

        EmailMessage msg4 = new EmailMessage();
        msg4.setSender("Sansa");

        System.out.println("Sender of msg1: " + msg1.getSender());
        System.out.println("Sender of msg2: " + msg2.getSender());
        System.out.println("Sender of msg3: " + msg3.getSender());
        System.out.println("Sender of msg4: " + msg4.getSender());

    }
}

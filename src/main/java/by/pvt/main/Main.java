package by.pvt.main;

import by.pvt.cmd.SendMessageCmd;
import by.pvt.cmd.SendMessageCmd;
import by.pvt.component.EmailSender;
import by.pvt.service.MessageType;
import by.pvt.service.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("by.pvt.service")
public class Main {

    public static void main ( String[] args ){

        ApplicationContext contest = new AnnotationConfigApplicationContext (Main.class);
        MessageService messageService = contest.getBean (MessageService.class);

       // MessageService messageService = new MessageService ();
        messageService.executeCommand (
                new SendMessageCmd (
                        "rser@mail.ru",
                        MessageType.INVITATION_MESSAGE,
                        EmailSender.EMAIL_CHANNEL
                )
        );
    }
}

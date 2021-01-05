package by.anton;

import by.anton.model.MessageSender;
import by.anton.model.SenderImp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(ConfigSpring.class);
//        MessageSender mes=context.getBean("messageSend",MessageSender.class);

//        System.out.println(mes.getMessage());

        SenderImp send=context.getBean("senderBean",SenderImp.class);
        System.out.println(send.getMessageSender().getMessage());
        System.out.println(send.getName());
        send.putAllThings("hello");
        context.close();

    }
}

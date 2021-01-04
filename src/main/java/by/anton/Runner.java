package by.anton;

import by.anton.model.SenderImp;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Runner {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("application-xml-config.xml");
        SenderImp send=context.getBean("sender",SenderImp.class);
        System.out.println(send.getMessageSender().getMessage());;
        context.close();

    }

}

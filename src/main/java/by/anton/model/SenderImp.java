package by.anton.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component("senderBean")
public class SenderImp{
    @Getter
    private MessageSender messageSender;
//    @Autowired
//    public void myMessageSender(@Qualifier("messageBean")MessageSender messageSender) {
//        this.messageSender=messageSender;
//    }
//    public void myMessageSender(MessageSender messageSender) {
//        this.messageSender=messageSender;
//    }
    @PostConstruct
    public void init(){
        System.out.println("Init");
    }
    @PreDestroy
    public void Destroy(){
        System.out.println("Destroy");
    }

    @Value("${myname}")
    private String name;

    public String getName() {
        return name;
    }
    public void putAllThings(String a){
        System.out.println("put this" +a);
    }

    public void setName(String name) {
        this.name = name;
    }
    @Autowired
    public SenderImp(@Qualifier("messageBean")MessageSender messageSender) {
        this.messageSender = messageSender;
    }


}

package by.anton.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component("messageBean")
public class MessageSender {
    @Getter
    @Setter
    private String message="Hi";



}

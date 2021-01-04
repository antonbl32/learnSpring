package by.anton;

import org.springframework.context.annotation.*;

@Configuration //файл конфигурации
@PropertySource("app.property") //путь к проперти файлу
@EnableAspectJAutoProxy //включить АОП
@ComponentScan("by.anton.model")//указать пакет для скана бинов и компонентов
public class ConfigSpring {

//
//    @Bean
//    public MessageSender messageSender(){
//        return new MessageSender();
//    }
//    @Bean
//    public SenderImp senderImp(){
//        return new SenderImp(messageSender());
//    }
//

}

package by.ant.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("by.ant")
@EnableAspectJAutoProxy
@PropertySource("classpath:app.property")
public class SpringConfigFile {

}

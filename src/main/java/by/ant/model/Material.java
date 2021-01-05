package by.ant.model;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("materialBean")
public class Material {
    @Value("${material}")
    @Getter
    private String name;


}

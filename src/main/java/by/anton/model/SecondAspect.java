package by.anton.model;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SecondAspect {

    @Pointcut("execution(* *(..))") //можно сделать шаблон pointcut и везде использовать или после @before самому указать шаблон
    public void allMethods() {
    }

    @Pointcut("execution(* put*(..))")
    public void allMethodsWithPut(){

    }


}

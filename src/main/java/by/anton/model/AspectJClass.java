package by.anton.model;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectJClass {
    @Pointcut("execution(* *(..))") //можно сделать шаблон pointcut и везде использовать или после @before самому указать шаблон
    private void allMethods() {
    }

    @Before("allMethods()")
    public void beforeLogAdvice() {
        System.out.println("записываем действие");
    }
// шаблон Pointcut модификатор_доступа(private, public)-необящательный параметр потом возвращаемый тип(String, или класс может
    //любым надо поставить * потом следует название метода или часть названия метода+* (get*) и затем аргументы
    // аргументы (String, ..) ..-любое количество любых аргументов
}
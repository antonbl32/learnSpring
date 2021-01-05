package by.ant.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AllAspect {
    @Pointcut("execution(* *(..))")
    public void allMethodAdvice(){

    }

    @Pointcut("execution(* put*())")
    public void allMethodPutAdvice(){

    }
    @Pointcut("execution(* get*(..))")
    public void allMethodGetAdvice(){

    }
}

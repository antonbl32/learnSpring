package by.ant.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PutAspect {

    @Before("by.ant.aspect.AllAspect.allMethodAdvice() && !by.ant.aspect.AllAspect.allMethodPutAdvice()")
    public void doPutMethodAdvice(){
        System.out.println("Do this method without put");
    }
//    @Before("by.anton.model.SecondAspect.allMethods()")
//    public void doAllMethods(){
//        System.out.println("Do all methods GOGO");
//    }



}

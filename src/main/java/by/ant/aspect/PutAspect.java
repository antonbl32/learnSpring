package by.ant.aspect;
import by.ant.model.Item;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PutAspect {

    @Before("by.ant.aspect.AllAspect.allMethodAdvice() && !by.ant.aspect.AllAspect.allMethodPutAdvice()")
    public void doPutMethodAdvice(JoinPoint joinPoint){
        System.out.println("Do this method without put");
        MethodSignature methodSignature=(MethodSignature) joinPoint.getSignature();
        if(methodSignature.getName().equals("tryMe")){
            Object[] obj=joinPoint.getArgs();
            for (Object ob:obj){
                if(ob instanceof Item){
                    System.out.println("Передан итем");
                }else if(ob instanceof String){
                    System.out.println("Передан String");
                }


            }

        }

    }
//    @Before("by.anton.model.SecondAspect.allMethods()")
//    public void doAllMethods(){
//        System.out.println("Do all methods GOGO");
//    }



}

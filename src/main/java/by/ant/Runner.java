package by.ant;

import by.ant.model.Item;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(by.ant.config.SpringConfigFile.class);
        Item myItem= (Item) context.getBean("itemBean");
        myItem.getMaterialMe();
        myItem.putMaterialMe();
        System.out.println(myItem.tryMe("Go-Go",myItem));
        System.out.println("----------------------------------------");
        System.out.println(myItem.getMaterial().getName());
        System.out.println(myItem.getName() + " "+myItem.isElectric());
        context.close();
    }
}

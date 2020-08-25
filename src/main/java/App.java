import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import models.Cat;
import models.HelloWorld;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        
        new AnnotationConfigApplicationContext(Cat.class);
        
        Cat cat = (Cat) applicationContext.getBean("cat");
        cat.meow();
        
        applicationContext.getBean("cat");
        cat.meow();
    }
}
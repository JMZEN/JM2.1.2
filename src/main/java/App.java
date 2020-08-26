import interfaces.ISpringBean;
import models.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import models.Cat;
import org.springframework.context.annotation.Import;


public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = applicationContext.getBean(HelloWorld.class);
        System.out.println(bean.getMessage());

        HelloWorld bean1 = applicationContext.getBean(HelloWorld.class);
        System.out.println(bean1.getMessage());

        Cat cat = applicationContext.getBean(Cat.class);
        cat.meow();

        Cat cat1 = applicationContext.getBean(Cat.class);
        cat.meow();

        System.out.println(checkEquityOfBean(bean, bean1));
        System.out.println(checkEquityOfBean(cat, cat1));
    }

    private static boolean checkEquityOfBean(ISpringBean bean, ISpringBean bean1) {
        return bean == bean1;
    }

}
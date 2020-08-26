import models.HelloWorld;
import org.springframework.context.annotation.*;

import models.Cat;
import models.HelloWorld;

@Configuration
public class AppConfig {

    @Bean(name = "helloworld")
    @Lazy
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name = "cat")
    @Scope("prototype")
    @Lazy
    public Cat getCat() {
        return new Cat();
    }
}
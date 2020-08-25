package models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Cat {
	public void meow() {
		System.out.println("Meow");
	}
}

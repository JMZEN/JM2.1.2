package models;

import interfaces.ISpringBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Cat implements ISpringBean {
	public void meow() {
		System.out.println("Meow");
	}
}

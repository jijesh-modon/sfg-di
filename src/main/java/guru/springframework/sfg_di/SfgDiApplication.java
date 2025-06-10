package guru.springframework.sfg_di;

import guru.springframework.sfg_di.controllers.ConstructorInjectorController;
import guru.springframework.sfg_di.controllers.MyController;
import guru.springframework.sfg_di.controllers.PropertyInjectorController;
import guru.springframework.sfg_di.controllers.SetterInjectorController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) context.getBean("myController");
		System.out.println(myController.sayHello());

		System.out.println("--------Property Injector---------");
		System.out.println("-------This is the most commonly used DI, but not recommended for unit testing -------");
		PropertyInjectorController propertyInjectorController = (PropertyInjectorController) context
				.getBean("propertyInjectorController");
		System.out.println(propertyInjectorController.getGreeting());

		System.out.println("--------Setter Injector--------");
		SetterInjectorController setterInjectorController = (SetterInjectorController) context
				.getBean("setterInjectorController");
		System.out.println(setterInjectorController.getGreeting());

		System.out.println("-------Constructor Injector--------");
		System.out.println("-------This is the Most Recommended DI-------");
		ConstructorInjectorController constructorInjectorController = (ConstructorInjectorController) context
				.getBean("constructorInjectorController");
		System.out.println(constructorInjectorController.getGreeting());
	}

}

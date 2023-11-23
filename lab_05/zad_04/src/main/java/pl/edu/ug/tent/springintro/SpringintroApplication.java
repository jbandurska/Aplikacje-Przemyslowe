package pl.edu.ug.tent.springintro;

import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import pl.edu.ug.tent.springintro.domain.Person;
import pl.edu.ug.tent.springintro.service.PersonService;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class SpringintroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringintroApplication.class, args);
	}

	@Bean
	public CommandLineRunner PrintBeans(ApplicationContext ctx, PersonService personService) {
		return args -> {
			Map<String, Person> allPersonBeans = ctx.getBeansOfType(Person.class);
			for (String beanName : allPersonBeans.keySet()) {

				Person person = allPersonBeans.get(beanName);
				Person newPerson = personService.newPerson(person);
				System.out.println(newPerson);
			}
		};
	}

}

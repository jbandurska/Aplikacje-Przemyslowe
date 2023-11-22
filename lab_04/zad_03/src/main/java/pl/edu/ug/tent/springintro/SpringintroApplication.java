package pl.edu.ug.tent.springintro;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class SpringintroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringintroApplication.class, args);
	}

	@Bean
	public CommandLineRunner PrintBeans(ApplicationContext ctx) {
		return args -> {
			String[] allBeanNames = ctx.getBeanDefinitionNames();
			for (String beanName : allBeanNames) {
				System.out.println(beanName);
			}
		};
	}

}

package br.com.zagwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;


@SpringBootApplication
@ComponentScan({"br.com.zagwork.*"})
@EntityScan("br.com.zagwork.*")
public class Main extends SpringBootServletInitializer{
	
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
	
	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:br/com/zagwork/locale/messages");
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}
}

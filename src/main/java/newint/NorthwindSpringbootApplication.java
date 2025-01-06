package newint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NorthwindSpringbootApplication {

	public static void main(String[] args) {
	  System.setProperty("server.servlet.context-path", "/northwind");
	  SpringApplication.run(NorthwindSpringbootApplication.class, args);
	}

}

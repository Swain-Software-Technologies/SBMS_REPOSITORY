package som.sstech.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//		System.out.println("Environment is :: "+args);
		SpringApplication.run(Application.class, args);
	}

}

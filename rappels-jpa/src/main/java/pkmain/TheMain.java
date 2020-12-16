package pkmain;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TheMain implements CommandLineRunner {

	public static void main(String[] args) {
		
		SpringApplication.run(TheMain.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}

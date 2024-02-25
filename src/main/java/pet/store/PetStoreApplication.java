package pet.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //runs springboot application using the pet store application class below
public class PetStoreApplication {

	public static void main(String[] args) {
		//start springboot application using the arguments that are passed in
		SpringApplication.run(PetStoreApplication.class, args);
	}

}

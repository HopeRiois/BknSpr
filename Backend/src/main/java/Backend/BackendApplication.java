package Backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
		Personas p = new Personas();
	}
	
	@GetMapping("/add")
	public void hello(@RequestParam(value = "ID") int id,
	@RequestParam(value = "name") String name, 
	@RequestParam(value = "apellidos", defaultValue = "user") String apellidos,
	@RequestParam(value = "edad", defaultValue = "user") int edad) 
	{
		Persona person = new Persona(id,name,apellidos,edad);
		p.add(person);
	}

	
}

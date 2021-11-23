package Backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
	
	@GetMapping("/add")
	public void hello(@RequestParam(value = "ID") int id,
	@RequestParam(value = "name") String name, 
	@RequestParam(value = "apellidos") String apellidos,
	@RequestParam(value = "edad") int edad) 
	{
		Personas p = new Personas();
		Persona person = new Persona(id,name,apellidos,edad);
		p.agregarPersona(person);
		p.listar();
	}

}

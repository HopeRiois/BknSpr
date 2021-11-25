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
	public String hello(@RequestParam(value = "ID") int id,
	@RequestParam(value = "name") String name, 
	@RequestParam(value = "apellidos") String apellidos,
	@RequestParam(value = "edad") int edad)
	{
		Personas p = new Personas();
		Persona person = new Persona(id,name,apellidos,edad);
		p.agregarPersona(person);
		return String.format(p.listar());
	}

	@GetMapping("/getAll")
	public String hello()
	{
		Personas p = new Personas();
		Persona person = new Persona(1, "Macta", "Llega", 19);
		Persona person1 = new Persona(2, "No señor", "Repete", 30);
		p.agregarPersona(person);
		p.agregarPersona(person1);
		return String.format(p.listar());
	}

	@GetMapping("/getOne")
	public String hello(@RequestParam(value = "ID") int id)
	{
		Personas p = new Personas();
		Persona person = new Persona(1, "Macta", "Llega", 19);
		Persona person1 = new Persona(1, "No señor", "Repete", 30);
		p.agregarPersona(person);
		p.agregarPersona(person1);
		return String.format(p.getPersona(id));
	}
}

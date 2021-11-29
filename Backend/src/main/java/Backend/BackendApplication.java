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
	public String Agregar(@RequestParam(value = "name") String name, 
	@RequestParam(value = "apellidos") String apellidos,
	@RequestParam(value = "edad") int edad)
	{
		Personas p = new Personas();
		String prueba = "datos antes: " + p.listar();
		Persona person2 = new Persona(4,name,apellidos,edad);
		p.agregarPersona(person2);
		prueba = prueba + "\n" + " datos después: " + p.listar();
		return String.format(prueba);
	}

	@GetMapping("/getAll")
	public String Listar()
	{
		Personas p = new Personas();
		return String.format(p.listar());
	}

	@GetMapping("/getOne")
	public String GetPersona(@RequestParam(value = "ID") int id)
	{
		Personas p = new Personas();
		return String.format(p.getPersona(id));
	}

	@GetMapping("/edit")
	public String EditPersona(@RequestParam(value = "ID") int id,
								@RequestParam(value = "nombre") String nombre,
								@RequestParam(value = "apellidos") String apellidos,
								@RequestParam(value = "edad") int edad)
	{
		Personas p = new Personas();
		String prueba = "datos antes: " + p.listar();
		p.editarApellidos(id, apellidos);
		p.editarNombre(id, nombre);
		p.editarEdad(id, edad);

		prueba = prueba + "\n" + " datos después: " + p.listar();
		return String.format(prueba);
	}

	@GetMapping("/delete")
	public String DeletePersona(@RequestParam(value = "ID") int id)
	{
		Personas p = new Personas();
		String prueba = "datos antes: " + p.listar();
		p.removerPersona(id);
		prueba = prueba + "\n" + " datos después: " + p.listar();
		return String.format(prueba);
	}
}

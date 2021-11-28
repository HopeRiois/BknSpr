package Backend;

import java.util.*;

public class Personas {
	private ArrayList<Persona> personas;
	public Personas() {
		this.personas= new ArrayList();
        Persona p = new Persona(1,"XX","YY",100);
        this.personas.add(p);
	}
	
	public boolean agregarPersona(Persona persona){
        return personas.add(persona);
    }

    public void removerPersona(int id){
        personas.remove(id);
    }

    public void editarNombre(int id, String nombre){
        personas.get(id).setNombre(nombre);
    }

    public void editarApellidos(int id, String apellidos){
        personas.get(id).setApellidos(apellidos);
    }

    public void editarEdad(int id, int edad){
        personas.get(id).setEdad(edad);
    }

    public String getPersona(int id){
        String dato ="";
        dato= dato + personas.get(id).nombre + " " + personas.get(id).apellidos + " " + personas.get(id).edad + "\n";
        return dato;
    }

    public String listar(){
        String datos ="";
        for(Persona i : personas)
        {
            datos= datos + i.getNombre() + " " + i.getApellidos() + " " + i.getEdad() + "\n";
        }
        return datos;
    }
}

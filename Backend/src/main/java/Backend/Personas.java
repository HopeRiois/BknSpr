package Backend;

import java.util.*;

public class Personas {
	private ArrayList<Persona> personas;
	public Personas() {
		this.personas= new ArrayList();
        Persona p = new Persona(1,"Andres","Rojas",100);
        Persona person1 = new Persona(2, "Marta", "Alvarez", 19);
		Persona person2 = new Persona(3, "Rosa", "Meza", 30);
        this.personas.add(p);
		this.personas.add(person1);
		this.personas.add(person2);
	}
	
	public boolean agregarPersona(Persona persona){
        return personas.add(persona);
    }

    public void removerPersona(int id){
        for(Persona i : personas){
            if(i.getId() == id){
                personas.remove(i);
            }
        }
    }

    public void editarNombre(int id, String nombre){
        int j = 0;
        for(Persona i : personas){
            if(i.getId() == id){
                personas.get(j).setNombre(nombre);
            }
            j++;
        }
    }

    public void editarApellidos(int id, String apellidos){
        int j = 0;
        for(Persona i : personas){
            if(i.getId() == id){
                personas.get(j).setApellidos(apellidos);
            }
            j++;
        }
    }

    public void editarEdad(int id, int edad){
        int j = 0;
        for(Persona i : personas){
            if(i.getId() == id){
                personas.get(j).setEdad(edad);
            }
            j++;
        }
    }

    public String getPersona(int id){
        String dato ="";
        for (Persona i : personas){
            if (i.getId() == id){
                dato= dato + i.getNombre() + " " + i.getApellidos() + " " + i.getEdad() + "\n";
            }
        }
        if (dato == ""){
            dato = "No se pudo encontrar la persona indicada";
        }
        return dato;
    }

    public String listar(){
        String datos ="";
        for(Persona i : personas)
        {
            datos = datos + i.getNombre() + " " + i.getApellidos() + " " + i.getEdad() + " | ";
        }
        return datos;
    }
}

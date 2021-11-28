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
        for(Persona i : personas){
            if(i.getId == id){
                personas.remove(i);
            }
        }
    }

    public void editarNombre(int id, String nombre){
        for(Persona i : personas){
            if(i.getId == id){
                personas.get(i).setNombre(nombre);
            }
        }
    }

    public void editarApellidos(int id, String apellidos){
        for(Persona i : personas){
            if(i.getId == id){
                personas.get(i).setApellidos(apellidos);
            }
        }
    }

    public void editarEdad(int id, int edad){
        for(Persona i : personas){
            if(i.getId == id){
                personas.get(id).setEdad(edad);
            }
        }
    }

    public String getPersona(int id){
        String dato ="";
        for (Persona i : personas){
            if (i.getId == id){
                dato= dato + i.getNombre + " " + i.getApellidos + " " + i.getEdad + "\n";
            }
        }
        if (dato == ""){
            dato = "No se pudo encontrar la persona indicada"
        }
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

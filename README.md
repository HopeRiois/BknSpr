# BknSpr

El programa corre con 5 mapeos: 
/add Ejemplo: http://localhost:8090/add?name=XX&apellidos=YY&edad=22
/getAll Ejemplo: http://localhost:8090/getAll
/getOne Ejemplo: http://localhost:8090/getOne?ID=1
/edit Ejemplo: http://localhost:8090/edit?ID=1&name=WW&apellidos=ZZ&edad=11
/delete Ejemplo: http://localhost:8090/delete?ID=1

Todos se apoyan en la clase Personas que consiste en un arrayList de Persona
add llama al metodo agregarPersona pide nombre, apellido y edad. Luego las lista
getAll llama al metodo listar 
getOne llama al metodo getPersona pide el ID de la persona a modificar
edit llama 3 metodos editarApellidos, editarNombre, editarEdad cada una pide el ID de la persona y el nuevo parametro para el metodo especificado
delete llama al metodo removerPersona pide como parametro el ID de la persona a eliminar

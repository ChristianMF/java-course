package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {
    
    public static void main(String[] args) {
         
        //Seleccionar
//        PersonaDAO personaDao = new PersonaDAO();
//        List<Persona> personas = personaDao.seleccionar();
//        personas.forEach(persona -> {
//            System.out.println("persona = " + persona);
//        });
        
        //Insertar
//        Persona personaNueva= new Persona("Carlos","Esperza","cesparza@mail.com","1181818");
//        PersonaDAO personaDao = new PersonaDAO();
//        personaDao.insertar(personaNueva);
//        
//        List<Persona> personas = personaDao.seleccionar();
//        
//        personas.forEach(persona -> {
//            System.out.println("persona = " + persona);
//        });

        //Actualizar
//        Persona personaNueva= new Persona(4,"Carlos","Sperza","cesparza@mail.com","1181818");
//        PersonaDAO personaDao = new PersonaDAO();
//        personaDao.actualizar(personaNueva);

        Persona personaNueva= new Persona(4);
        PersonaDAO personaDao = new PersonaDAO();
        personaDao.eliminar(personaNueva);

        List<Persona> personas = personaDao.seleccionar();
        
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
        
        
    }
    
}

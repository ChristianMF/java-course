package test;

import datos.*;
import domain.Persona;
import java.sql.*;
import java.util.List;

public class TestManejoPersonas {
    
    public static void main(String[] args) {
        
        Connection conexion = null;
        
        try {
            
            conexion = Conexion.getConnexion();
            
            if(conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            } 
            
            PersonaDAO personaDAO = new PersonaDAO(conexion);
            
            Persona cambioPersona = new Persona(2,"Karla Ivonne","Gomez","kgomez@mail.com","5544669944");
            
            personaDAO.actualizar(cambioPersona);
            
            Persona insertarPersona = new Persona();
            insertarPersona.setNombre("Carlos");
            //insertarPersona.setApellido("Ramirez114343434343443432424424242424442442424244242");
            insertarPersona.setApellido("Ramirez");
                    
            personaDAO.insertar(insertarPersona);
            
            conexion.commit();
            
            System.out.println("Se ha hecho commit");

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
                
    }
    
}

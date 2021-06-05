package test;

import datos.*;
import domain.PersonaDTO;
import java.sql.*;
import java.util.List;

public class TestManejoPersonas  {
    
    public static void main(String[] args) {
        
        Connection conexion = null;
        
        try {
            
            conexion = Conexion.getConnexion();
            
            if(conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            } 
            
            PersonaDAO personaDAO = new PersonaDAOJDBC(conexion);
            
            List<PersonaDTO> personas = personaDAO.seleccionar();
            
            personas.forEach(persona -> {
                System.out.println("persona = " + persona);
            });
            
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

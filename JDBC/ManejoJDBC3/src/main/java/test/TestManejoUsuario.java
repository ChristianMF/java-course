package test;

import datos.*;
import domain.UsuarioDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestManejoUsuario {

    public static void main(String[] args) throws SQLException {

        Connection conexion = null;

        try {
            conexion = Conexion.getConnexion();

            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            UsuarioDAO usuarioDAO = new UsuarioDAOJDBC(conexion);
            
            List<UsuarioDTO> usuarios = usuarioDAO.seleccionar();
            
            usuarios.forEach(usuario -> {
                System.out.println("usuario = " + usuario);
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

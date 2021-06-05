package test;

import datos.*;
import domain.Usuario;
import java.sql.Connection;
import java.sql.SQLException;

public class TestManejoUsuario {

    public static void main(String[] args) throws SQLException {

        Connection conexion = null;

        try {
            conexion = Conexion.getConnexion();

            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            UsuarioDAO usuarioDAO = new UsuarioDAO(conexion);

            Usuario usuarioInsertar = new Usuario("root", "admin");

            usuarioDAO.insertar(usuarioInsertar);
            
            Usuario usuarioActualizar = new Usuario();
            usuarioActualizar.setIdUsuario(6);
            //usuarioActualizar.setUsuario("RobertoRobertoRobertoRobertoRobertoRobertoRobertoRobertoRobertoRobertoRobertoRobertoRobertoRoberto");
            usuarioActualizar.setUsuario("Robert");
            usuarioActualizar.setPassword("123");

            usuarioDAO.actulizar(usuarioActualizar);

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

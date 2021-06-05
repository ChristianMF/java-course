package test;

import datos.*;
import domain.Usuario;
import java.sql.SQLException;
import java.util.List;

public class TestManejoUsuario {
    
    public static void main(String[] args) throws SQLException {
        
        UsuarioDAO usuarioDao = new UsuarioDAO();
        
        //Usuario usuarioInsertar = new Usuario("root","admin");
        //Usuario usuarioActualizar = new Usuario(1,"roota","admin");
        Usuario usuarioEliminar = new Usuario(1);
        
        //usuarioDao.insertar(usuarioInsertar);
        //usuarioDao.actulizar(usuarioActualizar);
        usuarioDao.eliminar(usuarioEliminar);
        
        List<Usuario> usuarios = usuarioDao.seleccionar();
        
        usuarios.forEach(usuarioLista -> {
            System.out.println("usuarioLista = " + usuarioLista);
        });
        
        
        
    }
    
}

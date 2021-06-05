package accesodatos;

public class ImplementacionMySql implements IAccesoDatos {

    //Methods
    @Override
    public void incertar() {
        System.out.println("Incertar desde MySQL");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde MySQL");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde MySQL");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde MySQL");
    }
    
}

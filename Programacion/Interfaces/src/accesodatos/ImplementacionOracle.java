package accesodatos;

public class ImplementacionOracle implements IAccesoDatos{

    //Methods
    @Override
    public void incertar() {
        System.out.println("Incertar desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Oracle");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde Oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde Oracle");
    }
    
}

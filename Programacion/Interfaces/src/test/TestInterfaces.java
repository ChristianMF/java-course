package test;

import accesodatos.*;

public class TestInterfaces {
    
    public static void main(String[] args) {
        
        IAccesoDatos datos1 = new ImplementacionMySql();
        IAccesoDatos datos2 = new ImplementacionOracle();
        
        imprimir(datos2);
        
    }
    
    public static void imprimir(IAccesoDatos datos) {
        datos.listar();
    }
    
}

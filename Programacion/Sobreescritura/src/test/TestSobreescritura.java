package test;

import domain.*;

public class TestSobreescritura {
    
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Juan", 5000);
        //System.out.println("empleado1 = " + empleado1.obtenerDetalles());
        imprimir(empleado1);
        
        Gerente gerente1 = new Gerente("Carla", 10000, "Contabilidad");
        //System.out.println("gerente1 = " + gerente1.obtenerDetalles());
        imprimir(gerente1);
        
        
    }
    
    public static void imprimir(Empleado empleado) {
        String detalles = empleado.obtenerDetalles();
        System.out.println("Empleado = " + detalles);
    
    }
    
}

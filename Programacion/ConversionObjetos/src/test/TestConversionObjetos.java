package test;

import domain.*;

public class TestConversionObjetos {
    
    public static void main(String[] args) {
        
        Empleado empleado;
        
        empleado = new Escritor("Jean", 5000, TipoEscritura.CLASICO);
//        System.out.println("empleado = " + empleado);

        //System.out.println(empleado.obtenerDetalles());
        
        //Downcasting
        //System.out.println(((Escritor )empleado).getTipoEscritura());
        
        //Downcasting
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
        
        //Upcasting
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
        
        
    }
    
}

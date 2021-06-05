package test;

import domain.*;

public class TestInstanceOf {
    
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Juan", 5000);
        determinarTipo(empleado1);
        
        empleado1 = new Gerente("Carla", 10000, "Contabilidad");
        determinarTipo(empleado1);
    }
    
    public static void determinarTipo(Empleado empleado) {
        
        if(empleado instanceof Gerente) {
            System.out.println("Es de tipo Generente");
            Gerente gerente = (Gerente )empleado;
            gerente.getDepatamento();
            System.out.println("gerente = " + gerente.getDepatamento());
        } else if(empleado instanceof Empleado) {
            System.out.println("Es de tipo Empleado");
        } else if(empleado instanceof Object) {
            System.out.println("Es de tipo Object");
        }
    
    }
    
}

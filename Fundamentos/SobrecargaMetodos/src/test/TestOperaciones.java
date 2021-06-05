
package test;

import operaciones.Operaciones;

public class TestOperaciones {
    
    public static void main(String[] args) {
        
        var resultado = Operaciones.sumar(1, 2);
        
        System.out.println("resultado = " + resultado);
        
        var resultado2 = Operaciones.sumar(5, 3L);
        System.out.println("resultado = " + resultado);
        
    }
    
}

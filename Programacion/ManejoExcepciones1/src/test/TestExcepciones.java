package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

public class TestExcepciones {
    
    public static void main(String[] args) {
        
        int resultado = 0;
        
        try {
            resultado = division(10, 0);
        } catch(OperacionExcepcion e) {
            System.out.println("Ocurio un error de tipo Operacion Excepcion");
        } catch (Exception e){
            System.out.println("Occurrio un error de tipo Exception:");
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Se reviso la division entre cero");
        }
        
        System.out.println("resultado = " + resultado);
        
    }
    
}

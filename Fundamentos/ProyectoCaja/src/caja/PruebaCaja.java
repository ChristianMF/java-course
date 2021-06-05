
package caja;

public class PruebaCaja {
    
    public static void main(String[] args) {
        
        Caja caja1 = new Caja();
        caja1.alto = 3;
        caja1.ancho = 6;
        caja1.profundo = 12;
        var resultado = caja1.calcularVolum();
        System.out.println("resultado = " + resultado);
        
        Caja caja2 = new Caja(2,4,6);
        resultado = caja2.calcularVolum();
        System.out.println("resultado = " + resultado);
        
        
    }
    
}


package com.gm.mundopc;

public class Orden {
    
    //Atributs
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private final static int MAX_COMPUTADORAS = 10;
    
    //Constructors
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    //Methods
    public void agregarComputadora(Computadora computadora) {
        
        if (Orden.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.computadoras[Orden.contadorComputadoras++] = computadora;
        } else {
            System.out.println("La orden se llenó");
        }
        
    }
    
    public void mostrarOrden() {
        System.out.println("Id Orden: " + this.idOrden);
        System.out.println("La orden incluye los siguientes productos: ");
        for (int i = 0; i < Orden.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
        }
    
    }
    
    
}

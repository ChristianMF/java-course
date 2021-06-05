
package com.gm.ventas;

public class Orden {
    
    //Atributs
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private final static int MAX_PRODUCTOS = 10;
    
    //Constructor
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }
    
    //Methods
    public void agregarProducto(Producto producto) {
        
        if(this.contadorProductos < Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el máximo de productos" + Orden.MAX_PRODUCTOS);
        }
    
    }
    
    public double calcularTotal() {
        
        double total = 0;
        
        for (int i = 0; i < this.contadorProductos; i++) {
            total += productos[i].getPrecio();
        }
        
        return total;
        
    }
    
    public void mostrarOrden() {
        System.out.println("Id Orden: " + this.idOrden);
        double total = this.calcularTotal();
        System.out.println("Total: $" + total);
        System.out.println("Productos de la Orden:");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
    }
    
}

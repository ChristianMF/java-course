
package com.gm.mundopc;

public class Computadora {
    
    //Atributs
    private int idComutadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorComputadoras;
    
    //Constructors
    private Computadora() {
        this.idComutadora = ++Computadora.contadorComputadoras;
    }
    
    public Computadora(String nombre, String marcaMonitor, double tamanoMonitor, 
            String tipoEntradaTeclado, String marcaTeclado, String tipoEntradaRaton, 
            String marcaRaton) {
        this();
        this.nombre = nombre;
        monitor = new Monitor(marcaMonitor, tamanoMonitor);
        teclado = new Teclado(tipoEntradaTeclado, marcaTeclado);
        raton = new Raton(tipoEntradaRaton, marcaRaton);
        
    }
    
    //Getters and Setters

    public int getIdComutadora() {
        return this.idComutadora;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return this.monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return this.teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return this.raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }
    
    //toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computadora{idComutadora=").append(this.idComutadora);
        sb.append(", nombre=").append(this.nombre);
        sb.append(", ").append(this.monitor);
        sb.append(", ").append(this.teclado);
        sb.append(", ").append(this.raton);
        sb.append('}');
        return sb.toString();
    }
    
}

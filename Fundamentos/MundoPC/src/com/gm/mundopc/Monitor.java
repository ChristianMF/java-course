
package com.gm.mundopc;

public class Monitor {
    
    //Atributs
    private int idMonitor;
    private String marca;
    private double tamano;
    private static int contadorMonitores;
    
    //Constructors
    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    
    public Monitor(String marca, double tamano) {
        this();
        this.marca = marca;
        this.tamano = tamano;
    }
    
    //Getters and Setters

    public int getIdMonitor() {
        return this.idMonitor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return this.tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }
    
    //toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor{idMonitor=").append(this.idMonitor);
        sb.append(", marca=").append(this.marca);
        sb.append(", tamano=").append(this.tamano);
        sb.append('}');
        return sb.toString();
    }
    
}

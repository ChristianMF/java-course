
package com.gm.mundopc;

public class Teclado extends DispositivoEntrada{
    
    //Atributs
    private int idTeclado;
    private static int contadorTeclados;
    
    //Constructors
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    //Getters and Setters
    public int getIdTeclado() {
        return this.idTeclado;
    }
    
    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado{idTeclado=").append(this.idTeclado);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}

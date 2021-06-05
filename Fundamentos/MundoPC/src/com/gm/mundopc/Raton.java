
package com.gm.mundopc;

public class Raton extends DispositivoEntrada{
    
    //Atributs
    private int idRaton;
    private static int contadorRatones;
    
    //Constructors
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    //Getters and Setters
    public int getIdRaton() {
        return this.idRaton;
    }
    
    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raton{idRaton=").append(this.idRaton);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}

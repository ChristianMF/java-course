package domain;

public class Escritor extends Empleado{
    
    //Atributs
    final TipoEscritura tipoEscritura;
    
    //Constructos
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    
    //Methods
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", Tipo Escritura: " + this.tipoEscritura.getDescripcion();
    }

    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Escritor{tipoEscritura: ").append(tipoEscritura);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    //Methods
    public TipoEscritura getTipoEscritura() {
        return this.tipoEscritura;
    }
    
}

package domain;

public class Gerente extends Empleado {

    //Atributs
    private String depatamento;

    //Constructor
    public Gerente(String nombre, double sueldo, String depatamento) {
        super(nombre, sueldo);
        this.depatamento = depatamento;
    }

    //Methods
    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", Departamento: " + this.depatamento;
    }
    
    //Getters and Setters
    public String getDepatamento() {
        return this.depatamento;
    }

    public void setDepatamento(String depatamento) {
        this.depatamento = depatamento;
    }
    
    
}

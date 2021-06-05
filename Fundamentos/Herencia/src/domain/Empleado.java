package domain;

public class Empleado extends Persona {

    //Atributs
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    //Constructors
    public Empleado() {
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }
    
    public Empleado(String nombre, double sueldo) {
        //super(nombre);
        this();
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    //Getters and Setters
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}

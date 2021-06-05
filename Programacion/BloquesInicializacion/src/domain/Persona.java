package domain;

public class Persona {
    
    private final int idPersona;
    private static int contadorPersonas;
    
    static {
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
    }
    
    {
        System.out.println("Ejecicion de bloque no estatico");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    public Persona() {
        System.out.println("Constructor de la clase");
    }
    
    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{idPersona=").append(this.idPersona);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}

package beans.model;

import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Named
@RequestScoped
public class Candidato {

    //Atributs
    private String nombre;
    private String apellido;
    private int salarioDeseado;
    private Date fechaNacimeinto;
    Logger log = LogManager.getRootLogger();

    //Constructors
    public Candidato() {
        log.info("Creando el objeto candidato");
        this.setNombre("Introduce tu nombre");
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        log.info("Modificando la propiedad de nombre: " + this.nombre);
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
        log.info("Modificando la propiedad de apellido: " + this.apellido);
    }

    public int getSalarioDeseado() {
        return this.salarioDeseado;
    }

    public void setSalarioDeseado(int salarioDeseado) {
        this.salarioDeseado = salarioDeseado;
        log.info("Modificando la propiedad de salarioDeseado: " + this.salarioDeseado);
    }

    public Date getFechaNacimeinto() {
        return this.fechaNacimeinto;
    }

    public void setFechaNacimeinto(Date fechaNacimeinto) {
        this.fechaNacimeinto = fechaNacimeinto;
    }

}

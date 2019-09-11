package cr.ac.una.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="persona")
public class Persona implements Serializable {
    @Id
    private int id_persona;//hola
    private String nombre;
    private String correo;
    private String telefono;
    private String centro_trabajo;

    public Persona(int id_perosna, String nombre, String correo, String telefono, String centro_trabajo) {
        this.id_persona = id_perosna;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.centro_trabajo = centro_trabajo;
    }

    public Persona() {
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCentro_trabajo() {
        return centro_trabajo;
    }

    public void setCentro_trabajo(String centro_trabajo) {
        this.centro_trabajo = centro_trabajo;
    }
}

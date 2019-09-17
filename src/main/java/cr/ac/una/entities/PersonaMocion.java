package cr.ac.una.entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="persona_mocion")
public class PersonaMocion implements Serializable {
    @Id
    private int id_persona_mocion;
    @OneToOne @JoinColumn(name="persona", nullable = false)
    private Persona persona;
    @OneToOne @JoinColumn(name="mocion", nullable = false)
    private Mocion mocion;

    public PersonaMocion() {
    }

    public PersonaMocion(int id_persona_mocion, Persona persona, Mocion mocion) {
        this.id_persona_mocion = id_persona_mocion;
        this.persona = persona;
        this.mocion = mocion;
    }

    public int getId_persona_mocion() {
        return id_persona_mocion;
    }

    public void setId_persona_mocion(int id_persona_mocion) {
        this.id_persona_mocion = id_persona_mocion;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Mocion getMocion() {
        return mocion;
    }

    public void setMocion(Mocion mocion) {
        this.mocion = mocion;
    }

    @Override
    public String toString() {
        return "PersonaMocion{" +
                "id_persona_mocion=" + id_persona_mocion +
                ", persona=" + persona +
                ", mocion=" + mocion +
                '}';
    }
}


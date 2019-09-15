package cr.ac.una.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="persona_mocion")
public class PersonaMocion implements Serializable {
    @Id
    private int id_persona_mocion;
    private int persona;
    private int mocion;

    public PersonaMocion(int id_persona_mocion, int persona, int mocion) {
        this.id_persona_mocion = id_persona_mocion;
        this.persona = persona;
        this.mocion = mocion;
    }

    public PersonaMocion() {
    }

    public int getId_persona_mocion() {
        return id_persona_mocion;
    }

    public void setId_persona_mocion(int id_persona_mocion) {
        this.id_persona_mocion = id_persona_mocion;
    }

    public int getPersona() {
        return persona;
    }

    public void setPersona(int persona) {
        this.persona = persona;
    }

    public int getMocion() {
        return mocion;
    }

    public void setMocion(int mocion) {
        this.mocion = mocion;
    }
}


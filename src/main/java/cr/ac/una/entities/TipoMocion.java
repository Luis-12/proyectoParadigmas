package cr.ac.una.entities;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class TipoMocion implements Serializable {
    @Id
    private int id_tipo_mocion;
    private String descripcion;

    public TipoMocion(int id_tipo_mocion, String descripcion) {
        this.id_tipo_mocion = id_tipo_mocion;
        this.descripcion = descripcion;
    }

    public TipoMocion() { }

    public int getId_tipo_mocion() {
        return id_tipo_mocion;
    }

    public void setId_tipo_mocion(int id_tipo_mocion) {
        this.id_tipo_mocion = id_tipo_mocion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

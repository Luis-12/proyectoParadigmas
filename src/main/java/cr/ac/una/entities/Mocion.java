package cr.ac.una.entities;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="mocion")
public class Mocion {
    @Id
    private int id_mocion;
    private int tipo;
    private Date fecha;
    private String texto;
    @OneToOne @JoinColumn(name="tipo_mocion", nullable = false)
    private TipoMocion tipomocion;
    @OneToMany(mappedBy = "mocion")
    private Set<PersonaMocion> personaM;

    public Mocion() {
    }

    public Mocion(int id_mocion, int tipo, Date fecha, String texto, TipoMocion tipomocion) {
        this.id_mocion = id_mocion;
        this.tipo = tipo;
        this.fecha = fecha;
        this.texto = texto;
        this.tipomocion = tipomocion;
    }

    public int getId_mocion() {
        return id_mocion;
    }

    public void setId_mocion(int id_mocion) {
        this.id_mocion = id_mocion;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public TipoMocion getMocion() {
        return tipomocion;
    }

    public void setMocion(TipoMocion mocion) {
        this.tipomocion = mocion;
    }

    @Override
    public String toString() {
        return "Mocion{" +
                "id_mocion=" + id_mocion +
                ", tipo=" + tipo +
                ", fecha=" + fecha +
                ", texto='" + texto + '\'' +
                ", mocion=" + tipomocion +
                '}';
    }
}

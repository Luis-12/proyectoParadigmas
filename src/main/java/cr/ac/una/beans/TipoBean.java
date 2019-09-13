package cr.ac.una.beans;
import cr.ac.una.entities.TipoMocion;
import cr.ac.una.services.TipoService;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import java.util.List;

public class TipoBean {

    @Autowired
    TipoService tipoService;
    private TipoMocion tipo = new TipoMocion();
    private List<TipoMocion> tipos;

    @PostConstruct
    public void init() {
        tipos = tipoService.getAllTipos();

    }

    public TipoMocion getTipoMocion() {
        return tipo;
    }
    public void setTipoMocion(TipoMocion tipo) {
        this.tipo = tipo;
    }
    public List<TipoMocion> getTipos() {
        return tipos;
    }
    public void setTipos(List<TipoMocion> tipos) {
        this.tipos = tipos;
    }

    public void create() {
        tipoService.createTipoMocion(tipo);
        tipos = tipoService.getAllTipos();
    }

    public void delete()
    {
        Integer id=new Integer(FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("PersonaId"));
        tipoService.deleteTipoMocion(id);
        tipos=tipoService.getAllTipos();
    }

}

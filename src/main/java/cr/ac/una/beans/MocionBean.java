package cr.ac.una.beans;

import cr.ac.una.entities.Mocion;
import cr.ac.una.entities.Persona;
import cr.ac.una.entities.PersonaMocion;
import cr.ac.una.services.MocionService;
import cr.ac.una.services.PersonaMocionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import java.util.List;

@Component
public class MocionBean {

    @Autowired
    MocionService MocionService;
    private Mocion mocion=new Mocion();
    private List<Mocion> mociones;

    @PostConstruct
    public void init() {
        mociones = MocionService.getAllMociones();
    }

    public MocionService getMocionService() {
        return MocionService;
    }

    public void setMocionService(MocionService mocionService) {
        MocionService = mocionService;
    }

    public Mocion getMocion() {
        return mocion;
    }

    public void setMocion(Mocion mocion) {
        this.mocion = mocion;
    }

    public List<Mocion> getMociones() {
        return mociones;
    }

    public void setMociones(List<Mocion> mociones) {
        this.mociones = mociones;
    }

    public void create() {
        MocionService.createMocion(mocion);
        mociones = MocionService.getAllMociones();
        mociones=null;
    }

    public void delete()
    {
        Integer id=new Integer(FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("PersonaId"));
       MocionService.deleteMocion(id);
       mociones=MocionService.getAllMociones();
    }

    public Mocion obtieneMociones(Integer id)
    {
        if(id == null){
            throw new IllegalArgumentException("no se provee el id");
        }
        for (Mocion p : mociones){
            if(id.equals(p.getId_mocion())){
                return p;
            }
        }
        return null;
    }

}
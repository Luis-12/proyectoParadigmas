package cr.ac.una.beans;

import cr.ac.una.entities.PersonaMocion;
import cr.ac.una.services.PersonaMocionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import java.util.List;

@Component
public class PersonaMocionBean {

    @Autowired
    PersonaMocionService personaMocionService;
    private PersonaMocion personaMocion=new PersonaMocion();
    private List<PersonaMocion> personasMocion;

    @PostConstruct
    public void init() {
        personasMocion = personaMocionService.getAllPersonasMocion();
    }

    public PersonaMocionService getPersonaMocionService() {
        return personaMocionService;
    }

    public void setPersonaMocionService(PersonaMocionService personaMocionService) {
        this.personaMocionService = personaMocionService;
    }

    public PersonaMocion getPersonaMocion() {
        return personaMocion;
    }

    public void setPersonaMocion(PersonaMocion personaMocion) {
        this.personaMocion = personaMocion;
    }

    public List<PersonaMocion> getPersonasMocion() {
        return personasMocion;
    }

    public void setPersonasMocion(List<PersonaMocion> personasMocion) {
        this.personasMocion = personasMocion;
    }

    public void create() {
        personaMocionService.createPersonaMocion(personaMocion);
        personasMocion = personaMocionService.getAllPersonasMocion();
        personasMocion=null;
    }

    public void delete()
    {
        Integer id=new Integer(FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("PersonaId"));
        personaMocionService.deletePersonaMocion(id);
        personasMocion=personaMocionService.getAllPersonasMocion();
    }



}

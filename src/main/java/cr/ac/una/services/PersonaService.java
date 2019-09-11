package cr.ac.una.services;

import cr.ac.una.entities.Persona;
import cr.ac.una.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaService {
    @Autowired //se instancia el objeto
    private PersonaRepository repository;

    public void createPersona(Persona persona)
    {
        repository.save(persona);
    }

}

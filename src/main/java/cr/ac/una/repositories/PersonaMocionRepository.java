package cr.ac.una.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaMocionRepository extends CrudRepository<PersonaMocionRepository,Integer> {
}

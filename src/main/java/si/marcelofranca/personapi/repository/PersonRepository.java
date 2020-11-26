package si.marcelofranca.personapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import si.marcelofranca.personapi.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

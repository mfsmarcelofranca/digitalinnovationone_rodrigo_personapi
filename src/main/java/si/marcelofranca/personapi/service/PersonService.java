package si.marcelofranca.personapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import si.marcelofranca.personapi.dto.MessageResponseDTO;
import si.marcelofranca.personapi.dto.request.PersonDTO;
import si.marcelofranca.personapi.entity.Person;
import si.marcelofranca.personapi.mapper.PersonMapper;
import si.marcelofranca.personapi.repository.PersonRepository;

@Service
public class PersonService {

    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO) {
        Person personToSave = personMapper.toModel(personDTO);

        Person savedPerson = personRepository.save(personToSave);

        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }
}

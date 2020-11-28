package si.marcelofranca.personapi.utils;

import si.marcelofranca.personapi.dto.request.PersonDTO;
import si.marcelofranca.personapi.dto.request.PhoneDTO;
import si.marcelofranca.personapi.entity.Person;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class PersonUtils {

    private static final String FIRST_NAME = "Camilla";
    private static final String LAST_NAME = "Santos";
    private static final String CPF_NUMBER = "369.333.878-79";
    private static final Long PERSON_ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(2010,10,14);

    public static PersonDTO createFakeDTO() {
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate("04-04-2010")
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }

    public static Person createFakeEntity() {
        return Person.builder()
                .id(PERSON_ID)
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate(BIRTH_DATE)
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }
}

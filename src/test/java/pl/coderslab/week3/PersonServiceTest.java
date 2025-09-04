package pl.coderslab.week3;

import org.junit.jupiter.api.Test;
import pl.coderslab.week3.stub.PersonRepositoryStub;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class PersonServiceTest {

    @Test
    void testGetAdults(){
        PersonRepositoryStub personRepositoryStub = new PersonRepositoryStub();
        PersonService personService = new PersonService(personRepositoryStub);
        List<Person> adults = personService.getAdults();
        assertThat(adults).hasSize(3);
    }

}
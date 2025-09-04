package pl.coderslab.week3;

import java.util.List;

public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAdults() {
        return personRepository.getAllPeople().stream()
                .filter(p -> p.getAge() >= 18)
                .toList();
    }
}

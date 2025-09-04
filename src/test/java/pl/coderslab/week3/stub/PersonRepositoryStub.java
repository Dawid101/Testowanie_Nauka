package pl.coderslab.week3.stub;

import pl.coderslab.week3.Person;
import pl.coderslab.week3.PersonRepository;

import java.util.List;

public class PersonRepositoryStub implements PersonRepository {
    @Override
    public List<Person> getAllPeople() {
        return List.of(new Person("Dawid", "Tyrka", 27),
                new Person("Aleksandra", "Tyrka", 26),
                new Person("Łukasz", "Ogarek", 39),
                new Person("Joanna", "Mazur", 12)
        );
    }
}

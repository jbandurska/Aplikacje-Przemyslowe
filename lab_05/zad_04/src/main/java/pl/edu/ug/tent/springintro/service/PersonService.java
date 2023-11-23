package pl.edu.ug.tent.springintro.service;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Service;
import pl.edu.ug.tent.springintro.domain.Person;

@Service
public class PersonService {
    private ArrayList<Person> personList = new ArrayList<>();

    public ArrayList<Person> all() {

        return personList;
    }

    public Person one(String id) {

        for (Person person : personList) {
            if (person.getId().equals(id))
                return person;
        }

        return null;
    }

    public Person newPerson(Person newPerson) {

        newPerson.setId(UUID.randomUUID().toString());
        personList.add(newPerson);
        return newPerson;
    }

    public Person replacePerson(Person newPerson, String id) {

        for (int i = 0; i < personList.size(); i++) {

            Person person = personList.get(i);
            if (person.getId().equals(id)) {

                person.setFirstName(newPerson.getFirstName());
                person.setLastName(newPerson.getLastName());
                person.setEmail(newPerson.getEmail());
                person.setCompanyName(newPerson.getCompanyName());

                return person;
            }
        }

        return null;
    }

    public void deletePerson(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id))
                personList.remove(person);
        }
    }
}

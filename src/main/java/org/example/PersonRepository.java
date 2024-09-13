package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonRepository {
    private List<Person> people = new ArrayList<>();

    public PersonRepository(List<Person> people) {
        this.people = people;
    }
    public void setPerson(Person person) {
        people.add(person);
    }
    public List<Person> getPeople() {
        return people;
    }
    public PersonRepository() {
    }
    public Optional<Person> getPersonByID(int id) {
        for (Person person : people) {
            if (person.id() == id) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }
    public int countByGender(Gender gender) {
        int count = 0;
        for (Person person : people) {
            if(person.gender() == gender) {
                count++;
            }
        }
        return count;
    }
    public Optional<Person> getPersonByName(String name) {
        for (Person person : people) {
            if(person.name().equals(name)) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }
    public Optional<List<Person>> returnFavouriteDayOfTheWeek(DayOfTheWeek day) {
            List<Person> listToBeReturned = new ArrayList<>();
        for (Person person : people) {
            if (person.favoriteDay() == day) {
                listToBeReturned.add(person);
            }
        }
        if (listToBeReturned.isEmpty()) {
            return Optional.empty();  // Return empty Optional if no persons are found
        } else {
            return Optional.of(listToBeReturned);  // Return Optional containing the list if persons are found
        }
    }

    @Override
    public String toString() {
        return "PersonRepository{" +
                "people=" + people +
                '}';
    }
}

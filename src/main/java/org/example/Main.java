package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(1, "John Doe", DayOfTheWeek.FRIDAY, Gender.MALE);
        Person person4 = new Person(4, "John Jophn", DayOfTheWeek.SATURDAY, Gender.MALE);
        Person person2 = new Person(2, "Jessy Doe", DayOfTheWeek.FRIDAY, Gender.FEMALE);
        Person person3 = new Person(3, "Jack Doe", DayOfTheWeek.MONDAY, Gender.OTHER);

        PersonRepository personRepository = new PersonRepository();
        personRepository.setPerson(person1);
        personRepository.setPerson(person2);
        personRepository.setPerson(person3);
        personRepository.setPerson(person4);

        System.out.println("Printing the people: ");
        System.out.println("Person exists: " + personRepository.getPersonByID(1));
        System.out.println("Person does not exist: " + personRepository.getPersonByID(19));

        System.out.println("Checking for count of genders");
        System.out.println("Count of males: " + personRepository.countByGender(Gender.MALE));
        System.out.println("Count of females: " + personRepository.countByGender(Gender.FEMALE));

        System.out.println("look person by its name");
        System.out.println("Get an existing name: " + personRepository.getPersonByName("John Doe").toString());
        System.out.println("Try to get non existing name: " +personRepository.getPersonByName("Non Existing Name"));

        System.out.println("Favourite days: ");
        System.out.println("People with Friday as favourite day: " + personRepository.returnFavouriteDayOfTheWeek(DayOfTheWeek.FRIDAY));
        System.out.println("People with Tuesday as favourite day: " + personRepository.returnFavouriteDayOfTheWeek(DayOfTheWeek.TUESDAY));

    }
}
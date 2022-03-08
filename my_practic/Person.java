public class Person {

    String firstName;
    String lastName;

    Person() {
    }

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    PersonFactory<Person> personFactory = Person::new;
    Person person = personFactory.create("Peter", "Parker");
}

interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}
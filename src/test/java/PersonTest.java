import org.example.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    private String name = "John";
    private String surname = "Snow";
    private int age = 20;

    @Test
    public void checkPersonName() {
        Person person = new Person(name, surname, age);
        String actual = person.getName();
        String expected = "John";

        assertEquals(expected, actual);
    }

    @Test
    public void checkPersonSurname() {
        Person person = new Person(name, surname, age);
        String actual = person.getSurname();
        String expected = "Snow";

        assertEquals(expected, actual);
    }

    @Test
    public void checkPersonAge() {
        Person person = new Person(name, surname, age);
        int actual = person.getAge();
        int expected = 20;

        assertEquals(expected, actual);
    }
}

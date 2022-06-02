package creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testBuilderShouldReturnFullObject() {
        Person person = Person.builder()
                .setName("Alex")
                .setSurname("Doe")
                .setAge(18)
                .setHeight(175)
                .setWeight(76)
                .build();
        assertEquals("Alex", person.getName());
        assertEquals("Doe", person.getSurname());
        assertEquals(18, person.getAge());
        assertEquals(175, person.getHeight());
        assertEquals(76, person.getWeight());
    }

    @Test
    void testBuilderShouldReturnPartialObject() {
        Person person = Person.builder()
                .setName("Tom")
                .setSurname("Smith")
                .build();
        assertEquals("Tom", person.getName());
        assertEquals("Smith", person.getSurname());
    }

}
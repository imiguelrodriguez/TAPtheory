package introduction.comparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {
    private String name;
    private String surname;
    private Gender gender;
    private int age;

    public Person(String name, String surname, Gender gender, int age) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static List<Person> generateGroup() {
        return Arrays.asList(
                new Person("Lola", "Rodríguez", Gender.FEMALE, 23),
                new Person("Carlos", "Martínez", Gender.MALE, 19),
                new Person("Maria", "Lombarda", Gender.FEMALE, 45)
        );
    }
}

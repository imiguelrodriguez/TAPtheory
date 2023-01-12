package introduction.comparators;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Person> list = Person.generateGroup();

        // SORT
        // Also Collections.sort(list, comparator)
        list.sort(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        System.out.println("Print names ordered asc");
        for(Person p : list) {
            System.out.println(p.getName());
        }
        // Now the same but with lambda
        list.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));

        // Now the same but with method reference
        list.sort(Comparator.comparing(Person::getName));
    }
}

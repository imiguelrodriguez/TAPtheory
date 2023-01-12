package introduction.streams;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // There are different ways to initialize a Stream
        // One way is with Stream.of()

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        List<Integer> integerList = integerStream.toList();
        // Another way is using a collection, such as a List
        List<String> stringList = Arrays.asList("Claudia", "Maria Jesús", "Antonio");
        Stream<String> stringStream = stringList.stream();

        // The use of streams allows to do many operations
        // We can also filter, in this case the numbers grater than 3
        System.out.println(integerList.stream().filter(value -> value > 3).toList());

        // We can use map, which will apply a modification to each item
        integerStream = integerList.stream().map(value -> value*2);
        System.out.println(integerStream.toList());

        // We can count occurrences too
        System.out.println(stringList.stream().filter(s -> s.startsWith("M")).count());

        // A predicate establishes a boolean function
        Predicate<Integer> pred = a -> a>1;
        System.out.println(pred.test(5));

        // Functions can accept two types of parameters
        Function<Integer, Boolean> func = v -> v>3;
        Function<Integer, String> func2 = Object::toString;

        // Collections.sort();
        stringList.sort((o1, o2) -> o1.compareTo(o2));
        stringList.sort(Comparator.naturalOrder());
        Map<Integer, Integer> map = new HashMap<>();
    }


}

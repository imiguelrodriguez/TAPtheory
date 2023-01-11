package introduction.streams;

import java.util.Arrays;
import java.util.List;
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


    }


}

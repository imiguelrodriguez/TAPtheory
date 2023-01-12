package introduction.metaclasses;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class objectClass;
        Integer integer = 4;

        objectClass = integer.getClass();
        System.out.println(objectClass);
        System.out.println(Arrays.toString(objectClass.getMethods()));

    }
}

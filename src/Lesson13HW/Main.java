package Lesson13HW;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

  /*  public static void main(String[] args) {
        String arr[] = {"A", "B", "C"};
        replace(arr, 0, 1);
    }

    private static void replace(String @NotNull [] arr, int i, int i1) {
        Object repl = arr[i];
        arr[i] = arr[i1];
        arr[i1] = String.valueOf(repl);
        System.out.println(Arrays.toString(arr));
    }

        public static <T> void asList(T[] arr) {
        ArrayList<T> mass = new ArrayList<>(Arrays.asList(arr));
        System.out.println(mass);
    }*/

    public static void main (String[] args) {

        Box<Apple> apples = new Box<>();
        Box<Orange> oranges = new Box<>();
        for (int i = 0; i < 10; i++) {
            apples.addFruit(new Apple(Integer.toString(i), i, new Random().nextInt(10)));
            oranges.addFruit(new Orange(Integer.toString(i), i, new Random().nextInt(10)));
        }
        System.out.println(apples.getWeight(0.2f));
    }
}
package Lesson13HW;

import java.util.ArrayList;

public class Fruit {
    private final String name;
    private final float weight;

    public Fruit(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }


    public String getName() {
        return name;
    }


    private static Object replaceFruit() {
        Object repl = replaceFruit();
        Object[] fruits = new Object[0];
        fruits[0] = fruits[1];
        fruits[1] = Integer.parseInt(String.valueOf(repl));
        System.out.println(replaceFruit().toString());
        return repl;
    }
}

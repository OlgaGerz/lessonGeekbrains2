package Lesson13HW;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> implements Comparable<Fruit>{
    private List<T> fruits;
    private Box o;

    public List<T> getFruits() { return fruits; }

    public Box() {this.fruits = new ArrayList<>(); }

    public void addFruit(T fruit) { fruits.add(fruit); }

    public float getWeight(float v) {
        float weight = 0.0f;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    @Override
    public int compareTo(@NotNull Fruit o) {
        return 0;
    }
}

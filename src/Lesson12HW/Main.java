package Lesson12HW;

public class Main {


    private static Object Person;
    private static Object Cat;
    private static Object Robot;

    public interface Action {
        void run();

        void jump();


    }

    public static class Person implements Action {

        public void run() {
            System.out.println("Человек пробежал");
        }

        public void jump() {
            System.out.println("Человек прыгнул");
        }


    }

    public static class Cat implements Action {
        public void run() {
            System.out.println("Кошка пробежала");
        }

        public void jump() {
            System.out.println("Кошка прыгнула");
        }


    }

    public static class Robot implements Action {
        public void run() {
            System.out.println("Робот пробежал");
        }

        public void jump() {
            System.out.println("Робот прыгнул");
        }

    }

    public static class Racetrack {

        public void run() {

        }


    }

    public static class Wall {

        public void jump() {

        }
    }


    public static <Creation> void main(String args[]) {
        Action person1 = new Person();
        Action cat1 = new Cat();
        Action robot1 = new Robot();

   person1.run();
    cat1.run();
    robot1.run();

        person1.jump();
        cat1.jump();
        robot1.jump();

        Object[] creations = {Person, Cat, Robot};
        Object run = null;
        Object jump = null;
        Object[] actions = {run, jump};

for (Object creation : creations) {
    for (Object action : actions) {
        System.out.println("Человек пробежал и перепрыгнул. Кошка пробежала и перепрыгнула. Робот пробежал и перепрыгнул");
    }
}
    }
}

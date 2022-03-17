package by.itland.itjava.timshina.lesson17;

import java.util.ArrayList;
import java.util.List;

public class EqualsExamples {
    public static void main(String[] args) {
        Dog tuzik = new Dog("Тузик", 5);
        Dog bobik = new Dog("Бобик", 3);
        Dog rufus = new Dog("Руфус", 10);
        Dog tuzik2 = new Dog("Тузик", 5);

        System.out.println(5==3);
        System.out.println(tuzik.equals(tuzik2));
//        System.out.println(tuzik>bobik);
        List<Dog> dogs = new ArrayList<>(){{
            add(tuzik);
            add(bobik);
            add(rufus);
            add(tuzik2);
        }};
        System.out.println(dogs);
        dogs.sort(new DogComparator());
        System.out.println(dogs);
    }
}

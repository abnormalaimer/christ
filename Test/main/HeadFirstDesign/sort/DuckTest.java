package main.HeadFirstDesign.sort;


import HeadFirstDesign.sort.Duck;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class DuckTest {
    @Test
    void compareTo() {
        Duck[]ducks={
                new Duck("Daffy",8),
                new Duck("Dewey",2),
                new Duck("Howard",7),
                new Duck("Louie",2),
                new Duck("Donald",10),
                new Duck("Huey",2),

        };
        System.out.println("Before Sorting:");
        display(ducks);
        Arrays.sort(ducks);
        System.out.println("After Sorting:");
        display(ducks);

    }
    public static void display(Duck[] ducks){
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    }
}
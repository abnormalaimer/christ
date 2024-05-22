package HeadFirstDesign.sort;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

class DuckTest {
    @Test
    void compareTo() {
        Duck[]ducks={
                new Duck("Daffy",8),
                new Duck("dewey",2),
                new Duck("Howard",7),
                new Duck("Louie",2),
                new Duck("Donald",10),
                new Duck("Huey",2),

        };
        System.out.println("beforesorting:");
        Arrays.sort(ducks);
    }
}
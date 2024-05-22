package HeadFirstDesign.sort;

import java.util.Arrays;

public class DuckSortTest {
    public static void main(String[] args) {
        Duck[]ducks={
                new Duck("Daffy",8),
                new Duck("dewey",2),
                new Duck("Howard",7),
                new Duck("Louie",2),
                new Duck("Donald",10),
                new Duck("Huey",2),

        };
        System.out.println("Before Sorting:");

        Arrays.sort(ducks);
    }
}

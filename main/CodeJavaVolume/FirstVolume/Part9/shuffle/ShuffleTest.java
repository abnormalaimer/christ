package CodeJavaVolume.FirstVolume.Part9.shuffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleTest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 49; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
        System.out.println("-----------------------");
        Collections.shuffle(numbers);
        System.out.println(numbers);
        System.out.println("-----------------------");
        List<Integer> winner = numbers.subList(0, 6);
        System.out.println(winner);
        System.out.println("-----------------------");
        Collections.sort(winner);
        System.out.println(winner);
    }
}

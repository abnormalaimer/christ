package CodeJavaVolume.Part9.set;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {



        Set<String> words = new HashSet<>();
        long totaltime = 0;
        File inputFile = new File("C:\\Users\\25149\\OneDrive\\书籍\\文学\\绿野仙踪\\绿野仙踪.txt");
        try (Scanner in = new Scanner(inputFile)) {
            while (in.hasNext()) {
                String word = in.next();
                long calllTime = System.currentTimeMillis();
                words.add(word);
                calllTime = System.currentTimeMillis() - calllTime;
                totaltime += calllTime;
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Iterator<String> iter = words.iterator();
        for (int i = 1; i <= 20 && iter.hasNext(); i++) {
            System.out.println(iter.next());
        }
        System.out.println(". . .");
        System.out.println(words.size()+" distinct words. " + totaltime + " milliseconds.");


    }
}

package collections;
import java.util.*;
import java.nio.file.*;
public class UniqueWords {
    public static void main(String[] args) throws Exception {
        List<String> lines=Files.readAllLines(Paths.get("collections/Stack/SetOperations.java"));
        Set<String> words=new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        for(String line :lines)
            for(String word:line.split("\\W+"))
                if(word.trim().length()>0)
                words.add(word);
        System.out.println(words);
    }
}

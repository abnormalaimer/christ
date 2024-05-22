package CodeJavaVolume.SecondVolume.Part1.collecting;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class CollectingResults {
    public static Stream noVowels() throws IOException{
        var contents = new String(Files.readAllBytes(Paths.get("E:\\Java\\2.txt")), StandardCharsets.UTF_8);
        List<String> wordList = List.of(contents.split("\\PL+"));
        Stream<String> words = wordList.stream();
        return words.map(s->s.replaceAll("[aeiouAEIOU]", ""));
    }
    public static <T> void show(String label, Set<T> set){
        System.out.println(label+":"+set.getClass());

    }
}

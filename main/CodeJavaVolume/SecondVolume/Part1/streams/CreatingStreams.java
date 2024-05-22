package CodeJavaVolume.SecondVolume.Part1.streams;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatingStreams {
    public static <T> void show(String title, Stream<T> stream) {
        final int SIZE = 10;
        List<T> firstElements = stream.limit(SIZE + 1).collect(Collectors.toList());
        System.out.println(title + ": ");
        for (int i = 0; i < firstElements.size(); i++) {
            if (i > 0) System.out.println(", ");
            if (i < SIZE) System.out.println(firstElements.get(i));
            else System.out.println("...");

        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("E:\\Java\\2.txt");
        var contents = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);

        Stream<String> words=Stream.of(contents.split("\\PL+"));

    }
}

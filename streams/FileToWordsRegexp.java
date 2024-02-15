package streams;
import java.io.*;
import java.nio.file.*;
import java.util.stream.*;
import java.util.regex.Pattern;
import java.util.regex.Pattern.*;
public class FileToWordsRegexp {
    private final String all;
    public FileToWordsRegexp(String filePath) throws Exception{
        all=Files.lines(Paths.get(filePath))
        .skip(1)
        .collect(Collectors.joining(" "));
    }
    public Stream<String> stream(){
        return Pattern
        .compile("[ .,?]+").splitAsStream(all);
    }
    public static void main(String[] args) throws Exception{
        FileToWordsRegexp fw=new FileToWordsRegexp("streams\\Cheese.dat");
        fw.stream()
        .limit(7)
        .map(w->w+" ")
        .forEach(System.out::print);
         fw.stream()
         .skip(7)
        .limit(2)
        .map(w->w+" ")
        .forEach(System.out::print);
        
    }
}

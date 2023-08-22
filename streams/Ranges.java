package streams;
import static java.util.stream.IntStream.*;
public class Ranges {
    public static void main(String[] args) {
        //传统
        int result=0;
        for(int i=10;i<20;i++)
        result+=i;
        System.out.println(result);
        //for_in
        result=0;
        for(int i:range(10,20).toArray())
        result+=i;
        System.out.println(result);
        //stream
        System.out.println(range(10, 20).sum());
    }
}

package functional;
import java.util.function.*;
interface Funcss extends Function<String,String>{}
public class ProduceFunction {
    static Funcss produce(){
        return s->s.toLowerCase();
    }  
    public static void main(String[] args) {
        Funcss f=produce();
        System.out.println(f.apply("YELLING"));
    }
}

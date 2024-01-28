package functional;
import java.util.function.*;
public class CurryingAndPartials {
    static String uncarried(String a,String b){
        return a+b;
    }
    public static void main(String[] args) {
      Function<String, Function<String,String>> sum=
      a->b->a+b;
      System.out.println(uncarried("Hi ", "Ho"));
      Function<String,String> hi=sum.apply("Hi ");
      System.out.println(hi.apply("Ho"));  
       Function<String,String> sumHi=sum.apply("Hup ");
      System.out.println(sumHi.apply("Ho"));  
      System.out.println(sumHi.apply("Hey"));  
    }
}

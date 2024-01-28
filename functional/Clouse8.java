package functional;
import java.util.*;
import java.util.function.Supplier;
public class Clouse8 {
    Supplier<List<Integer>> makefun(){
         List<Integer> ai=new ArrayList<>();
        ai.add(1);
        return()->ai;
    }
    public static void main(String[] args) {
        Clouse8 c7=new Clouse8();
        List<Integer>
        l1=c7.makefun().get(),
        l2=c7.makefun().get();
        System.out.println(l1);
        System.out.println(l2);
        l1.add(42);
        l2.add(96);
        System.out.println(l1);
        System.out.println(l2);
    }
}

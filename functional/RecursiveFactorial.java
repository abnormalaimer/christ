package functional;

public class RecursiveFactorial {
    static Intcall fact;
    public static void main(String[] args) {
        fact=n->n==0?1:n*fact.call(n-1);
        for(int i=0;i<=10;i++)
        System.out.println(fact.call(i));
    }
}

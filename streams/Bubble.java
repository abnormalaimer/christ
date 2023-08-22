package streams;

public class Bubble {
    public final int i;
    public Bubble(int n){
        i=n;
    }
    @Override
    public String toString(){
        return "Bubble("+i+")";
    }
    private static int count=0;
    public static Bubble bubble(){return new Bubble(count++);}
    
}

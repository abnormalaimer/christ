package ThinkingInJava;
class Sundae{
    private Sundae(){}
static Sundae makeSundae(){
    return new Sundae();
}}
public class IceCream {
    public static void main(String[] args) {
        Sundae x=Sundae.makeSundae();
    }
    
}

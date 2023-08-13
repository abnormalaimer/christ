package functional;
interface Description{
    String brief();
}
interface Body{
    String detailed(String head);
}
interface Multi{
    String twoArg(String head,Double d);
}
public class LambdaExpressions {
    static Body bod=h->h+"No Parens!";
    static Body bod2=(h)->h+"MOre details!";
    static Description desc=()->"Short info";
    static Multi mult=(h,n)->h+n;
    static Description moreLines=()->{
        System.out.println("moreLInes()");
        return"from moreLines()";
    };
    public static void main(String[] args) {
        System.out.println(bod.detailed("oh!"));
        System.out.println(bod2.detailed("hi!"));
        System.out.println(desc.brief());
        System.out.println(mult.twoArg("Pi!", 3.14159));
        System.out.println(moreLines.brief());
    }
}

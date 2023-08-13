package functional;

class Go {
    static void go(){
        System.out.println("Go::go()");
    }
}
public class RunnableMethodReference {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run(){
                System.out.println("annoymous");
            }
        }).start();
        new Thread(()->System.out.println("lambda")).start();
        new Thread(Go::go).start();
    }
}

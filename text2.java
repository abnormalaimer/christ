

public class text2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter an intreger for seconds:");
        int seconds=input.nextInt();
        int minutes=seconds/60;
        int remainingSeconds=seconds%60;
        System.out.println(seconds+" second is "+minutes+" minutes and "+remainingSeconds+" seconds");

    }
}
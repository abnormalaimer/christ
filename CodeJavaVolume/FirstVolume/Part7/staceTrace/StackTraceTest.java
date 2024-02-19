package CodeJavaVolume.FirstVolume.Part7.staceTrace;

import java.util.Scanner;

public class StackTraceTest {
    public static int facorial(int n){
        System.out.println("factorial("+n+"):");
        Throwable t = new Throwable();
        StackTraceElement[] frames = t.getStackTrace();
        for(StackTraceElement f : frames)
            System.out.println(f);
        int r;
        if(n<=1) r=1;
        else r=n*facorial(n-1);
        System.out.println("return "+r);
        return r;
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n:");
        int n=in.nextInt();
        facorial(n); // 调用递归函数


    }
}

package CodeJavaVolume.FirstVolume.Part6.lambda;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer; 


public class LambdaTest {
    public static void main(String[] args) {
        String[] planets=new String[]{"mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictonary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length:");
        Arrays.sort(planets, (first,second)->first.length()-second.length());
        System.out.println(Arrays.toString(planets));

        Timer t=new Timer(1000,event->
        System.out.println("the time is "+new Date()));
        t.start();

        JOptionPane.showMessageDialog(null,"quit program?");
        System.exit(0);
    }
    
}

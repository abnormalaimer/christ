package enums;
import java.util.*;

import jdk.internal.org.jline.terminal.Size;
public class EnumTest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter a size:(SMALL,MEDIUM,LARGE,EXTRA_LARGE)");
        String input =in.next().toUpperCase();
        Size size=Enum.valueOf(Size.class, input);
        
    }
    
}
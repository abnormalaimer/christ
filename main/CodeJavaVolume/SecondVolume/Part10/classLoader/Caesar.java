package CodeJavaVolume.SecondVolume.Part10.classLoader;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Caesar {
    public static void main(String[] args) throws Exception {
        System.out.println(args.length);
        for (String arg : args) {

            System.out.println(arg);

        }

        if (args.length!=3){
            System.out.println("............");
            System.out.println("Usage: java Caesar plainText key decrypt/encrypt");
            return;
        }
        try (var in=new FileInputStream(args[0]);var out=new FileOutputStream(args[1])){
            int key=Integer.parseInt(args[2]);
            int ch;
            while ((ch=in.read())!=-1){
                byte c=(byte) (ch+key);
                out.write(c);
            }

        }
    }
}

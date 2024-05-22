package CodeJavaVolume.SecondVolume.Part4.socket;

import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SocketTest {
    public static void main(String[] args) {
        try (var s = new Socket("time-a.nist.gov", 13);
             var in = new Scanner(s.getInputStream(), StandardCharsets.UTF_8)) {
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(line);
            }


        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}

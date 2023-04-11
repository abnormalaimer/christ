import java.util.Scanner;
public class text1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number for radius:");
        double radius=input.nextDouble();
        double area=radius*radius*3.1415926;
        System.out.println("the area for the circle of radius"+radius+"is"+area);
    }
    
}
package HeadFirstDesign.Duck;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("i cant fly");
    }
}

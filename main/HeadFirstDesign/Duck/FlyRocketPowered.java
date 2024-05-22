package HeadFirstDesign.Duck;

public class FlyRocketPowered implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("im flying with a rocket");
    }
}

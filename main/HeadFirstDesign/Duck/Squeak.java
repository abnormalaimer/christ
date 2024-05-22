package HeadFirstDesign.Duck;

public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("<<silence>>");
    }
}

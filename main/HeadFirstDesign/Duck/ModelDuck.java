package HeadFirstDesign.Duck;

public class ModelDuck extends Duck{
    @Override
    public void display() {

    }
    public ModelDuck(){
        flyBehavior=new FlyNoWay();
        quackBehavior=new Quack();
    }

    @Override
    public void quack() {

    }

    @Override
    public void fly() {

    }
}

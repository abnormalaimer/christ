package HeadFirstDesign.Duck;

public class MallardDuck extends Duck {

   public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior=new FlyWithWings();
   }

    @Override
    public void quack() {
        System.out.println("\n");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void display() {
        System.out.println("im a real mallard duck");
    }
}

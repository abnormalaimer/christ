package HeadFirstDesign.Duck;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){}

    public abstract void quack();

    public abstract void fly();

    public abstract void display();
    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("all ducks float,even decoys");
    }

    public void setFlyBehavior(FlyBehavior fb) {
       flyBehavior=fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior=qb;
    }
}

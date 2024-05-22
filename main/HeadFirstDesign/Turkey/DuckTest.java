package HeadFirstDesign.Turkey;

public class DuckTest {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);
        System.out.println("the  turkeys says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\nthe duck says...");
        testDuck(mallardDuck);

        System.out.println("\nthe turkey says...");
        testDuck(turkeyAdapter);
    }
    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}

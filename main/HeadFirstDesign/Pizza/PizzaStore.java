package HeadFirstDesign.Pizza;

public class PizzaStore{
    SimplePizzaFactory factory;

    public PizzaStore() {
        this.factory=factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }


    public static PizzaStore createPizzaStore() {
        return new PizzaStore();
    }
}

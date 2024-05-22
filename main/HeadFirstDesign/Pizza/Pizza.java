package HeadFirstDesign.Pizza;

import java.util.ArrayList;

public abstract class Pizza{


    String name;
    String dough;
    String sauce;
   ArrayList toppings=new ArrayList();
   void prepare(){
       System.out.println("Preparing"+name);
       System.out.println("tossing dough...");
       System.out.println("Adding sauce...");
       System.out.println("Adding toppings...");
       for (int i = 0; i < toppings.size(); i++) {
           System.out.println("  "+toppings.get(i));
       }
   }
   void bake(){
       System.out.println("bake for 25 minutes at 300");
   }
    void cut(){ System.out.println("cutting the pizza into diagonal slices");}
    void box(){ System.out.println("place pizza in official pizzaStore box");}
    public String getName() {
        return name;
    }

}

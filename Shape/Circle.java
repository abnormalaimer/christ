package Shape;

public class Circle extends shape {
    @Override
    public void draw(){
        System.out.println("Circle.draw");
    }
    @Override
    public void erase(){
        System.out.println("Circle.erase");
    }
}


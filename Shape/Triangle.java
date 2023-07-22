package Shape;

public class Triangle extends shape {
    @Override
    public void draw(){
        System.out.println("Triangle.draw");
    }
    @Override
    public void erase(){
        System.out.println("Triangle.erase");
    }
}


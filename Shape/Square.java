package Shape;

public class Square extends shape {
    @Override
    public void draw(){
        System.out.println("Square.draw");
    }
    @Override
    public void erase(){
        System.out.println("Square.erase");
    }
}


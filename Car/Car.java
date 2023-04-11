package Car;

// 定义一个名为 Car 的类，它有两个实例变量 color 和 speed，以及一个构造器和一个 drive 方法
public class Car {
  // color 是一个 public 的实例变量，它有类级作用域，可以被类内外的任何地方访问
  public String color;
  // speed 是一个 private 的实例变量，它也有类级作用域，但只能被类内部的方法访问
  private int speed;

  // Car 是一个 public 的构造器，它有方法级作用域，可以被类外部的其他类调用
  public Car(String color, int speed) {
    // color 和 speed 是构造器的参数，它们有方法级作用域，只能在构造器内部使用
    // this.color 和 this.speed 是实例变量，它们可以在构造器内部使用，因为构造器属于类的一部分
    this.color = color;
    this.speed = speed;
  }

  // drive 是一个 public 的方法，它有方法级作用域，可以被类外部的其他类调用
  public void drive(boolean fourWheel) {
    int a=1;
    // fourWheel 是方法的参数，它有方法级作用域，只能在方法内部使用
    // tires 是一个局部变量，它也有方法级作用域，只能在方法内部使用
    String tires = "wide";
    if(fourWheel==false)
    System.out.println("a");
    else
    System.out.println("b");
    // speed 是一个实例变量，它可以在方法内部使用，因为方法属于类的一部分
    System.out.println("The " + color + " car is driving at " + speed + " km/h with " + tires + " tires.");
  }
}
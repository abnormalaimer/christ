package Car;

public class TestCar {
    // main 是一个 public 的静态方法，它有方法级作用域，可以被 Java 虚拟机调用
    public static void main(String[] args) {
      // car1 和 car2 是两个局部变量，它们有方法级作用域，只能在 main 方法内部使用
      // 它们分别引用了两个 Car 类的对象
      Car car1 = new Car("red", 100);
      Car car2 = new Car("blue", 80);
  
      // 调用 car1 和 car2 的 drive 方法，并传入不同的参数
      car1.drive(true);
      car2.drive(false);
  
      // 访问 car1 和 car2 的 color 实例变量，并打印出来
      System.out.println("Car1's color is " + car1.color);
      System.out.println("Car2's color is " + car2.color);
  
      // 尝试访问 car1 和 car2 的 speed 实例变量，会报错，因为 speed 是 private 的
      // System.out.println("Car1's speed is " + car1.speed); // 编译错误：speed 在 Car 中是 private 访问控制
      // System.out.println("Car2's speed is " + car2.speed); // 编译错误：speed 在 Car 中是 private 访问控制
    }
  }
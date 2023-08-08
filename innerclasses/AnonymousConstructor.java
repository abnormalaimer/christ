package innerclasses;
abstract class Base{
    Base(int i){
        System.out.println("Base constructor,i="+i);
    }
    public abstract void f();
}

public class AnonymousConstructor {
    public static Base getBase(int i){
        return new Base(i) {{
            System.out.println("inside instance initializer");}
            @Override
            public void f(){
                System.out.println("in anonyous f()");
            }
            
        };
    }
    public static void main(String[] args) {
        Base base=getBase(47);
        base.f();
    }
}
v
package CodeJavaVolume.FirstVolume.Part6.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

public class ProxyTEst {
    public static void main(String[] args) {
        Object[] elements=new Object[1000];
        for (int i = 0; i <elements.length ; i++) {
            Integer value=i+1;
            InvocationHandler handler = new TraceHandler(value);
            Object proxy = Proxy.newProxyInstance(null, new Class[]{Comparable.class}, handler);
            elements[i]=proxy;
        }
        Integer key = new Random().nextInt(elements.length) + 1;

        int result = Arrays.binarySearch(elements, key);

        if (result >= 0) System.out.println(elements[result]);
    }

}
class TraceHandler implements InvocationHandler{
    private final Object target;
    public TraceHandler(Object t){
        target = t;
    }

    @Override
    public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
        System.out.print(target);

        System.out.print("."+ m.getName()+"(");

        if (args!=null){
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                if (i<args.length-1) System.out.print(",");

            }
        }
        System.out.println(")");

        return m.invoke(target, args);
    }
}

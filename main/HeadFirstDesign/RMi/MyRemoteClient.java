package HeadFirstDesign.RMi;

import java.rmi.Naming;

public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }
    public void go(){
        try {
            MyRemote serivice= (MyRemote) Naming.lookup("rmi://192.168.101.9/RemoteHello");
            String s=serivice.sayHello();
            System.out.println(s);

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

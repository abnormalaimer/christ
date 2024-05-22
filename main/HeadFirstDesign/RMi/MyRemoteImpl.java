package HeadFirstDesign.RMi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    public String sayHello() {
        return "server keys,'hey'";
    }

    public MyRemoteImpl() throws RemoteException {
    }

    public static void main(String[] args) {
        try {
            MyRemoteImpl service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }

}

package patterns.proxy.rmi.example;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    private void go() {

        try {
            final Registry registry = LocateRegistry.getRegistry(2712);
            MyRemote service = (MyRemote) registry.lookup("RemoteHello");

            String s = service.sayHello();

            System.out.println(s);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

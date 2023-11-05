package patterns.proxy.rmi.example;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    private static final long serialVersionUID = 1L;

    public MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello(){
        return "Server says, 'Hey'";
    }

    public static void main(String[] args) {

        try {
            MyRemote service = new MyRemoteImpl();
            final Registry registry = LocateRegistry.createRegistry(2712);
            registry.bind("RemoteHello", service);
//            Naming.bind("RemoteHello", service);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

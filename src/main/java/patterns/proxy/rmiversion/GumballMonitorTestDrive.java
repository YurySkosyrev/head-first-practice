package patterns.proxy.rmiversion;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String[] location = {"santafe gumballmachine",
                             "boulder gumballmachine",
                             "seattle gumballmachine"};

        GumballMonitor[] monitors = new GumballMonitor[location.length];

        try {
            for (int i = 0; i < location.length; i++) {
                final Registry registry = LocateRegistry.getRegistry(2712);
                GumballMachineRemote machine = (GumballMachineRemote) registry.lookup(location[i]);

                monitors[i] = new GumballMonitor(machine);
                System.out.println(monitors[i]);
            }
        } catch (RemoteException | NotBoundException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < location.length; i++) {
            monitors[i].report();
        }
    }
}

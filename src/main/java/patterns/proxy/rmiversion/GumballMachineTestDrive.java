package patterns.proxy.rmiversion;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class GumballMachineTestDrive {
    public static void main(String[] args) {

//        int count = 0;
//        if (args.length < 2) {
//            System.out.println("GumballMachine <name> <inventory>");
//            System.exit(1);
//        }

        try {
//            count = Integer.parseInt(args[1]);
            GumballMachine gumballMachine1 = new GumballMachine("seattle", 112);
            GumballMachine gumballMachine2 = new GumballMachine("boulder", 113);
            GumballMachine gumballMachine3 = new GumballMachine("santafe", 114);

            final Registry registry = LocateRegistry.createRegistry(2712);
            registry.bind(gumballMachine1.getLocation() + " gumballmachine", gumballMachine1);
            registry.bind(gumballMachine2.getLocation() + " gumballmachine", gumballMachine2);
            registry.bind(gumballMachine3.getLocation() + " gumballmachine", gumballMachine3);

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}

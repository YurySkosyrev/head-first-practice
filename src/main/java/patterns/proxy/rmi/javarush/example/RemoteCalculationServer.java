package patterns.proxy.rmi.javarush.example;

import java.rmi.RemoteException;

public class RemoteCalculationServer implements Calculator{
    @Override
    public int multiply(int x, int y) throws RemoteException {
        return x*y;
    }
}

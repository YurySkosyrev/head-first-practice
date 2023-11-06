package patterns.combine;

public class Quackologist implements Observer{
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Qoackologist: " + duck + " just quacked.");
    }
}

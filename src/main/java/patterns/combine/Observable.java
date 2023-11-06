package patterns.combine;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Observable implements QuackObservable{

    List<Observer> observers = new ArrayList<>();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        for (Observer observer : observers) {
            observer.update(duck);
        }
    }
}

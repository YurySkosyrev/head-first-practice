package patterns.combine;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}

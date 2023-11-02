package patterns.state.with.classes;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    void refill();
}

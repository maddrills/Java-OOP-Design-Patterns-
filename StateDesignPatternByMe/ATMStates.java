package StateDesignPatternByMe;

public interface ATMStates {

    ///we need four states
    void insertCar();
    void ejectCard();
    void atmPin(int pin);
    void withdrawAmount(int amount);
}

package StateDesignPattern;
public class TestATMMachine {
    public static void main(String[] args){
        ATMMachine atmMachine = new ATMMachine();
        atmMachine.ejectCard();
        atmMachine.insertCard();
        atmMachine.insertCard();
        atmMachine.ejectCard();
        atmMachine.ejectCard();
        atmMachine.insertCard();
        atmMachine.insertPin(1234);
        atmMachine.requestCash(2000);
        atmMachine.insertCard();
        atmMachine.insertPin(1234);
    }
}
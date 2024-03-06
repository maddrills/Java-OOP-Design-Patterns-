package StateDesignPatternByMe;

public class NoCard implements ATMStates{
    ATMMachine atmMachine;

    public NoCard(ATMMachine atmMachine){
        this.atmMachine = atmMachine;
    }
    @Override
    public void insertCar() {
        System.out.println("Card inserted");
        atmMachine.setATMCurrentState(atmMachine.getHasCard());
    }

    @Override
    public void ejectCard() {
        System.out.println("Heavens stop tampering with me dork there is no card there");
    }

    @Override
    public void atmPin(int pin) {
        System.out.println("hey hey hey sick you m******** in");
    }

    @Override
    public void withdrawAmount(int amount) {
        System.out.println("this is probably the worst bank hist i have ever had the misfortune of dealing with you dont have your card in yet di**");

    }
}

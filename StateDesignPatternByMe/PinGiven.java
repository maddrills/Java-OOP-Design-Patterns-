package StateDesignPatternByMe;

public class PinGiven implements ATMStates{

    ATMMachine atmMachine;

    public PinGiven(ATMMachine atmMachine){
        this.atmMachine = atmMachine;
    }
    @Override
    public void insertCar() {
        System.out.println("i already have a card ");
    }

    @Override
    public void ejectCard() {
        System.out.println("card ejected thanks for nothing");
        this.atmMachine.setATMCurrentState(atmMachine.getNoCard());
    }

    @Override
    public void atmPin(int pin) {
        System.out.println("you already inserted the pin " + pin +"\n .....just Withdraw your amount freek");
    }

    @Override
    public void withdrawAmount(int amount) {
        if(atmMachine.getMoneyInATMMachine() < amount){
            System.out.println("not enough funds in the ATM");
            System.out.println("card ejected");
            this.atmMachine.setATMCurrentState(atmMachine.getNoCard());
        }
        else {
            System.out.println("Enjoy your money " + amount + " have a nice day");
            this.atmMachine.setMoneyInATMMachine(-(amount));
            this.atmMachine.setATMCurrentState(atmMachine.getNoCard());
        }
    }
}

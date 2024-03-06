package StateDesignPatternByMe;

public class ATMMachine {
    //must take a card
    //must give a card
    //accept pin
    //deduce funds

    private int moneyInATMMachine = 2000;

    private ATMStates hasCard;
    private ATMStates noCard;
    private ATMStates pinIn;

    private ATMStates ATMCurrentState;

    public ATMMachine (){
        this.hasCard = new HasCard(this);
        this.noCard = new NoCard(this);
        this.pinIn = new PinGiven(this);
        //this would be the current state of the machine
        ATMCurrentState = noCard;
    }

    public void insertCard(){
        //call the insert card state
        ATMCurrentState.insertCar();
    }

    public void pullCard(){
        //call the
        ATMCurrentState.ejectCard();
    }
    public void insetPin(int pin){
        ATMCurrentState.atmPin(pin);
    }
    public void withdrawAmount(int amount){
        ATMCurrentState.withdrawAmount(amount);
    }
    public int getMoneyInATMMachine(){
        return moneyInATMMachine;
    }
    public void setMoneyInATMMachine(int moneyInATMMachine){
        this.moneyInATMMachine += moneyInATMMachine;
    }


    public void setATMCurrentState(ATMStates atmStates){
        this.ATMCurrentState = atmStates;
    }

    //state transitions
    public ATMStates getHasCard(){
        return hasCard;
    }
    public ATMStates getNoCard(){
        return noCard;
    }
    public ATMStates getPinIn(){
        return pinIn;
    }

}

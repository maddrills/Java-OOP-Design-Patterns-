package StateDesignPatternByMe;

public class HasCard implements ATMStates {
    ATMMachine atmMachine;

    public HasCard(ATMMachine atmMachine){
        this.atmMachine = atmMachine;
    }
    /**
     * state must accept card
     */
    @Override
    public void insertCar() {
        System.out.println("Hey dont be smart i cant take more than one card pihole!");
    }

    /**
     *
     */
    @Override
    public void ejectCard() {
        System.out.println("card removed");
        this.atmMachine.setATMCurrentState(this.atmMachine.getNoCard());
    }

    /**
     * @param pin
     */
    @Override
    public void atmPin(int pin) {
        System.out.println("Pin "+ pin +" inserted");
        this.atmMachine.setATMCurrentState(this.atmMachine.getPinIn());

    }

    /**
     * @param amount
     */
    @Override
    public void withdrawAmount(int amount) {
        System.out.println("yahhhhhhh just give your pin first");

    }
}

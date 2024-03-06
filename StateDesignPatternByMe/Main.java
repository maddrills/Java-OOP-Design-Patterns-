package StateDesignPatternByMe;

public class Main {
    public static void main(String[] args){
        ATMMachine atmMachine = new ATMMachine();

        atmMachine.insertCard();
        atmMachine.pullCard();
        atmMachine.insertCard();
        atmMachine.insetPin(1234);
        atmMachine.withdrawAmount(1500);


        System.out.println("\n when a jack ass comes");
        System.out.println();

        atmMachine.pullCard();
        atmMachine.insertCard();
        atmMachine.withdrawAmount(2000);
        atmMachine.insetPin(1234);
        atmMachine.insetPin(1234);
        atmMachine.insetPin(1234);
        atmMachine.withdrawAmount(5000);
        atmMachine.withdrawAmount(200);


        System.out.println("\n when a rich ass comes");
        System.out.println();

        atmMachine.insertCard();
        atmMachine.insetPin(2345);
        atmMachine.withdrawAmount(1000000);
        atmMachine.insertCard();
        atmMachine.insetPin(2345);
        atmMachine.withdrawAmount(1500);
        System.out.println();
        atmMachine.insertCard();
        atmMachine.insetPin(2345);
        atmMachine.withdrawAmount(250);
    }
}

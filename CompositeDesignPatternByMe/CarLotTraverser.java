package CompositeDesignPatternByMe;

public class CarLotTraverser {
    CarComposite carComposite;

    public CarLotTraverser(CarComposite carComposite){
        this.carComposite = carComposite;
        printStuff();
    }

    public void printStuff(){
        carComposite.printInfo();
    }
}

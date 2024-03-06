package CompositeDesignPatternByMe;

public class Main {
    public static void main(String[] args){
        //will be the head node

        CarComposite car = new VehicleDese(
                "Race car",
                "Go really fast above any speed limit");
        CarComposite car1 = new VehicleDese(
                "Every day car",
                "Goes slow but its safe");

        CarComposite farrari = new VehicleInfo("farrari",
                "fastest",400,345,200);
        CarComposite bugati = new VehicleInfo("Bugati",
                "my my its fast",500,360,150);
        car.add(farrari);
        car.add(bugati);

        car.add(car1);

        CarComposite hummer = new VehicleInfo("Hummer", "is practicaly an elephant",500,250,500);
        CarComposite polo = new VehicleInfo("polo gt", "hey its ok with speed but its safe",300,230,240);

        car1.add(hummer);
        car1.add(polo);

        CarLotTraverser carLotTraverser = new CarLotTraverser(car);


        //a traverser
    }
}

package CompositeDesignPatternByMe;

import java.util.ArrayList;
import java.util.Iterator;

public class VehicleDese extends CarComposite{

    //array of added nodes
    ArrayList<CarComposite> carNodes;
    //takes in anything that acts as a transport
    public VehicleDese(String VehicleType,String about){
        super(VehicleType,about);
        carNodes = new ArrayList<>();
    }

    @Override
    public void add(CarComposite carComposite){
        this.carNodes.add(carComposite);
    }
    @Override
    public void printInfo(){
        System.out.print("\n");
        System.out.println(getInfo()+" Vehicle");
        System.out.println(getName()+" type");
        Iterator iterator = carNodes.listIterator();
        while(iterator.hasNext()){
            CarComposite carComposite = (CarComposite) iterator.next();
            System.out.print("\n");
            carComposite.printInfo();
        }
    }
}

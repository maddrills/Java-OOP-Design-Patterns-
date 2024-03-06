package CompositeDesignPatternByMe;
//this would be the leaf
public class VehicleInfo extends CarComposite{
    //holds every vehicle according to their types
    int horsePower,speed,weight;

    public VehicleInfo(String VehicleName,String about,int horsePower,int speed,int weight){
        super(VehicleName, about);
        this.horsePower = horsePower;
        this.speed = speed;
        this.weight = weight;
    }
    @Override
    public void printInfo(){
        System.out.println(getInfo()+" Vehicle");
        System.out.println(getName()+" of name");
        horsePower();
        speed();
        weight();
    }

    public void horsePower(){
        System.out.println(horsePower+" HorsePower");
    }
    public void speed(){
        System.out.println(speed+" Vehicle Speed Km-ph");
    }
    public void weight(){
        System.out.println(weight+" Vehicle weight kg");
    }
}

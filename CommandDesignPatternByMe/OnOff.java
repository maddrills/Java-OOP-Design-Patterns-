package CommandDesignPatternByMe;

public class OnOff implements Command{
    ElectronicItem electronicItem;

    public OnOff(ElectronicItem electronicItem){
        this.electronicItem = electronicItem;
    }
    @Override
    public void forward() {
        System.out.println("TV up");
        this.electronicItem.TVOn();
    }

    @Override
    public void backwards() {
        System.out.println("TV down");
        this.electronicItem.TVOff();
    }
}

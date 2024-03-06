package CommandDesignPatternByMe;

public class Volume implements Command{
    ElectronicItem electronicItem;

    public Volume(ElectronicItem electronicItem){
        this.electronicItem = electronicItem;
    }

    @Override
    public void forward() {
        System.out.println("volume up");
        electronicItem.volumeUp();
    }

    @Override
    public void backwards() {
        System.out.println("volume down");
        electronicItem.volumeDown();
    }
}

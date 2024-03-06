package CommandDesignPatternByMe;

public class Main {
    public static void main(String[] args) {
        //main call
        ElectronicItem BPL = new BPL();

        Command command = new OnOff(BPL);
        Button button = new Button(command);
        button.pressForward();
        button.pressBackward();
        button.pressForward();

        Command command1 = new Volume(BPL);
        Button volume = new Button(command1);
        volume.pressForward();
        volume.pressForward();
        volume.pressForward();
        volume.pressForward();
        volume.pressForward();
        volume.pressForward();
        volume.pressForward();
        volume.pressForward();
        volume.pressForward();
        volume.pressForward();
        System.out.println("Volume at :" + ((BPL) BPL).getVolume());
        volume.pressBackward();
        volume.pressBackward();
        System.out.println("Volume at :" + ((BPL) BPL).getVolume());
    }
}

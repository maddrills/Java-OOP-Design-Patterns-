package CommandDesignPatternByMe;

public class BPL implements ElectronicItem{
    private int volume;

    public BPL(){}
    @Override
    public void volumeUp() {
        this.volume += 1;
    }

    @Override
    public void volumeDown() {
        this.volume -= 1;
        if(this.volume < 0){
            this.volume = 0;
        }
    }

    @Override
    public void TVOn() {
        System.out.println("BPL TV is on");

    }

    @Override
    public void TVOff() {
        System.out.println("BPL TV is off");

    }
    public int getVolume(){
        return volume;
    }
}

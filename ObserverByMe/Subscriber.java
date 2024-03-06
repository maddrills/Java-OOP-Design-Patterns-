package ObserverByMe;

public class Subscriber implements Observer{
    private int videoNumber;
    private String video;

    private Observable chanel;

    public Subscriber(Observable chanel){
        this.chanel = chanel;

        this.chanel.register(this);
    }

    public void printResult(){
        System.out.println("the number "+videoNumber + " name " + video);
    }


    @Override
    public void change(int numberOfVideos, String name) {
        this.videoNumber = numberOfVideos;
        this.video = name;
        printResult();
    }
}

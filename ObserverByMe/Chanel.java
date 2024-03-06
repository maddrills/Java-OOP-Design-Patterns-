package ObserverByMe;

import java.util.ArrayList;

public class Chanel implements Observable{

    private int numVideo;
    private String video;
    ArrayList<Observer> listOfObservers;

    public Chanel(){
        listOfObservers = new ArrayList<Observer>();
    }

    public void setNumVideo(int numVideo,String video) {
        this.numVideo = numVideo;
        this.video = video;
        alertOfChange();
    }

    @Override
    public void register(Observer o) {
        listOfObservers.add(o);
    }

    @Override
    public void dRegister(Observer delete) {
        int indexPos = listOfObservers.indexOf(delete);
        listOfObservers.remove(indexPos);
        System.out.println((indexPos+1)+" removed");
    }

    @Override
    public void alertOfChange() {
        //alert for all
        for(Observer o: listOfObservers){
            o.change(this.numVideo,this.video);
        }
    }
}

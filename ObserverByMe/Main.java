package ObserverByMe;

public class Main {
    public static void main(String[] args){

        //here we will give value to the chanel or observable
        Chanel ob1 = new Chanel();


        Subscriber sub3 = new Subscriber(ob1);
        Subscriber sub4 = new Subscriber(ob1);
        Subscriber sub2 = new Subscriber(ob1);
        Subscriber sub1 = new Subscriber(ob1);
        ob1.setNumVideo(1,"office");
        ob1.setNumVideo(2,"rudolf");
        ob1.setNumVideo(5,"queen");
    }
}

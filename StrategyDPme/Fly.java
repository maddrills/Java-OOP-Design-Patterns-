package StrategyDPme;

public interface Fly {
    //method sig
    void fly();
}

//the folowing are diffrent concreate clases that implement fly and are diffrent algorithems
class CanFly implements Fly{
    @Override
    public void fly(){
            System.out.println("flying");
        }
}
//cant fly
class CanNotFly implements Fly{
    @Override
    public void fly(){
        System.out.println("Cant fly");
    }
}
//short distance flight
class CanFlyAShortDistance implements Fly{
    @Override
    public void fly(){
        System.out.println("flew a short distance");
    }
}
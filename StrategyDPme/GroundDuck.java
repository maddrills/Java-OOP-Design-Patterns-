package StrategyDPme;

public class GroundDuck extends Duck{
    public GroundDuck(String name,int age){
        super(name,age,new CanFlyAShortDistance(),new QuackAsQuack());
        print(Integer.valueOf(getAge()));
        print(getName());
        getFly().fly();
        getQuack().quack();
    }
    private void print(Object literal){
        System.out.println(literal.toString());
    }
}

package StrategyDPme;

public class FlyDuck extends Duck{
    FlyDuck(String name, int age){
        super(name,age,new CanFly(),new QuackAsQuack());
        print(Integer.valueOf(getAge()));
        print(getName());
        getFly().fly();
        getQuack().quack();
    }

    private void print(Object literal){
        System.out.println(literal.toString());
    }
}

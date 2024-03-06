package StrategyDPme;

public class RubberDuck extends Duck{
    public RubberDuck(String name,int age){
        super(name,age,new CanNotFly(),new QuackAsSqueak());
        print(Integer.valueOf(getAge()));
        print(getName());
        getFly().fly();
        getQuack().quack();
    }

    private void print(Object literal){
        System.out.println(literal.toString());
    }
}


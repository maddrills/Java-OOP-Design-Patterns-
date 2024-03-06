package StrategyDPme;

public class Duck {
    private String name;
    private int age;

    //compose the two classes
    private Fly fly;
    private Quack quack;

    public Duck(String name, int age,Fly fly,Quack quack){
        super();
        this.name = name;
        this.age = age;
        this.fly = fly;
        this.quack = quack;
    }

    public Duck(){
        this("default duck",0,null,null);
    }

    public void displayDuck(){
        System.out.println("Duck");
    }
    //implementing the strategy pattern
    //must be able to fly and not fly or fly a little
    public Fly getFly() {
        return fly;
    }
    //duck must be able to quack differently or not at all
    public Quack getQuack() {
        return quack;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

package StrategyDPme;

public interface Quack {
    void quack();
}

class QuackAsCant implements Quack{
    @Override
    public void quack(){
        System.out.println("no quack");
    }
}

class QuackAsSqueak implements Quack{
    @Override
    public void quack(){
        System.out.println("sqqeeeek");
    }
}

class QuackAsQuack implements Quack{
    @Override
    public void quack(){
        System.out.println("quack quack");
    }
}

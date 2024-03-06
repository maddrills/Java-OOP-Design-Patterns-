package CompositeDesignPatternByMe;

public abstract class CarComposite {
    private String name,info;
    //we need a method to return
    public CarComposite(String name,String info){
        this.name = name;
        this.info = info;
    }
    public String getName() {
        return name;
    }

    public String getInfo(){
        return this.info;
    }
    public void horsePower(){}
    public void speed(){}
    public void weight(){}
    public void iterator(){}
    public void printInfo(){}

    public void add(CarComposite carComposite){
        throw new UnsupportedOperationException();
    }
    public void remove(CarComposite carComposite){
        throw new UnsupportedOperationException();
    }
}

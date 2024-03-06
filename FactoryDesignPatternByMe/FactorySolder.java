package FactoryDesignPatternByMe;

public abstract class FactorySolder {
    private int level;
    private String name;
    FactorySolder(){};
    //setters
    public void setLevel(int level){
        this.level = level;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public int getLevel(){
        return level;
    }
    public abstract void SolderName();
    public abstract int damage();
}

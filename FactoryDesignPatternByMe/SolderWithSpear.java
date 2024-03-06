package FactoryDesignPatternByMe;

public class SolderWithSpear extends FactorySolder{
    public SolderWithSpear(int level,String name){
        super();
        super.setLevel(level);
        super.setName(name+ " type Spear");
    }
    @Override
    public void SolderName(){
        System.out.println("Name "+getName());
    }
    @Override
    public int damage() {
        return 5 * getLevel();
    }
}

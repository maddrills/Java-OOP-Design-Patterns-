package FactoryDesignPatternByMe;

public class SolderWithAxe extends FactorySolder{
    public SolderWithAxe(int level,String name){
        super();
        super.setLevel(level);
        super.setName(name+ " type Axe");
    }
    @Override
    public void SolderName(){
        System.out.println("Name "+getName());
    }
    @Override
    public int damage() {
        return 20 * getLevel();
    }
}

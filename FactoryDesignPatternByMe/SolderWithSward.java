package FactoryDesignPatternByMe;

public class SolderWithSward extends FactorySolder{
    public SolderWithSward(int level,String name){
        super();
        super.setLevel(level);
        super.setName(name+ " type Sward");
    }
    @Override
    public void SolderName(){
        System.out.println("Name "+getName());
    }
    @Override
    public int damage() {
        return 10 * getLevel();
    }
}

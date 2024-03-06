package TemplateMethodDesignPatternByMe;

public final class PolitisionPoster extends Poster{
    public String politicianName;

    public PolitisionPoster(){
        super("Raggu");
        politicianName = "Raggu";
    }
    @Override
    public void Posterpicture() {
        System.out.println(politicianName+" Polition picture as Poster picture");
    }

    @Override
    public void posterName() {
        System.out.println(politicianName+" name written as posterName");
    }

    @Override
    public void posterColor() {
        System.out.println(politicianName+" while is the poster color");
    }
    @Override
    public boolean peopleSection(){
        return true;
    }
}

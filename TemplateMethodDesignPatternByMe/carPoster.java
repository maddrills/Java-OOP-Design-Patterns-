package TemplateMethodDesignPatternByMe;

public final class carPoster extends Poster{
    private String car;
    public carPoster(){
        super("car");
        car = "car";
    }
    @Override
    public void Posterpicture() {
        System.out.print(car);
        System.out.println("  poster");
    }

    @Override
    public void posterName() {
        System.out.print(car);
        System.out.println(" on poster");

    }

    @Override
    public void posterColor() {
        System.out.print(car);
        System.out.println(" Poster color is read");
    }
    @Override
    public boolean  border(){
        return true;
    }
    @Override
    public boolean  holes(){
        return true;
    }
}

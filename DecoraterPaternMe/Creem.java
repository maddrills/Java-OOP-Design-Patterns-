package DecoraterPaternMe;

public class Creem extends AddOns{
    Beverage beverage;
    public Creem(Beverage beverage) {
        this.beverage = beverage;

    }
    @Override
    public String about() {
        return this.beverage.about()+"added cream\n";
    }

    @Override
    public double price() {
        return this.beverage.price()+0.50;
    }
}

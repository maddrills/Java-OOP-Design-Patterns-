package DecoraterPaternMe;

public class Caremel extends AddOns{

    Beverage beverage;
    public Caremel(Beverage beverage) {
        this.beverage = beverage;

    }

    @Override
    public String about() {
        return this.beverage.about()+"added caramel\n";
    }

    @Override
    public double price() {
        return this.beverage.price()+1.00;
    }
}

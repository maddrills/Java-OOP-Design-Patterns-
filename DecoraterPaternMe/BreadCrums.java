package DecoraterPaternMe;

public class BreadCrums extends AddOns{
    Beverage beverage;
    public BreadCrums(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String about() {
        return this.beverage.about()+"added Bread crumbs\n";
    }

    @Override
    public double price() {
        return this.beverage.price()+0.70;
    }
}

package DecoraterPaternMe;

public class Expreso implements  Beverage{
    String name;
    int price;

    @Override
    public String  about() {
        return "Expreso added";
    }

    @Override
    public double price() {
        return 1.20;
    }
}

package DecoraterPaternMe;

public class Tea implements  Beverage{
    String name;
    int price;

    @Override
    public String about() {
        return "added Tea \n";
    }

    @Override
    public double price() {
        return 2.10;
    }
}

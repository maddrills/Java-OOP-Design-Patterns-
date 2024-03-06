package DecoratorPattern;

public class PizzaMaker {
    public static void main(String[] args){
        // The PlainPizza object is sent to the Mozzarella constructor
        // and then to the TomatoSauce constructor
        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Price: " + basicPizza.getCost());

        Pizza nasic2 = new Mozzarella(new TomatoSauce(new ThreeCheesePizza()));
        System.out.println("Ingredients: " + nasic2.getDescription());
        System.out.println("Price: " + nasic2.getCost());
    }
}
package IteratorDesignPatternByMe;

public class Menu {
    String name;
    int price;
    public Menu(String name,int price){
        //price
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString(){
        return "name :"+this.name + " price :"+ this.price;
    }
}

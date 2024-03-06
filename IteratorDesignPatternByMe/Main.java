package IteratorDesignPatternByMe;

import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        Desert desertMenu = new Desert("Desert 0");
        LunchMenu lunchMenu = new LunchMenu("Lunch Menu 0");
        DinnerMenu dinnerMenu = new DinnerMenu("Dinner Menu 0");


        desertMenu.addDisert("pastry",100);
        desertMenu.addDisert("Ice Cream",200);
        desertMenu.addDisert("Chocolate pancake",150);
        desertMenu.addDisert("Fruit bool",100);

        lunchMenu.addLunchItem("Berivan",200);
        lunchMenu.addLunchItem("kushka",150);
        lunchMenu.addLunchItem("kabab",100);
        lunchMenu.addLunchItem("masala dosa",150);

        dinnerMenu.addDinnerItem("Nachos and fries",120);
        dinnerMenu.addDinnerItem("noodles",200);
        dinnerMenu.addDinnerItem("glass noodles",250);
        dinnerMenu.addDinnerItem("warmish",80);


        System.out.println(desertMenu.getMenuName());
        lunchIterator(desertMenu.iterator());

        System.out.println("");
        System.out.println(lunchMenu.getMenuName());
        lunchIterator(lunchMenu.iterator());

        System.out.println("");
        System.out.println(dinnerMenu.getMenuName());
        lunchIterator(dinnerMenu.iterator());

    }

    public static void lunchIterator(Iterator iterator){
        while (iterator.hasNext()){
            //i don't know why i had to upcast this
            Menu menu = (Menu) iterator.next();
            System.out.println(menu);
        }
    }
}

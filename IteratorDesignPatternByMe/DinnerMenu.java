package IteratorDesignPatternByMe;

import java.util.Iterator;
import java.util.LinkedList;

public class DinnerMenu implements IteratorFeedBack{
    Menu menu;
    String menuName;
    LinkedList<Menu> dinnerItems;

    public DinnerMenu(String menuName){
        this.menuName = menuName;
        this.dinnerItems = new LinkedList<>();
    }

    public String getMenuName() {
        return menuName;
    }

    public void addDinnerItem(String disertName,int price){
        this.menu  = new Menu(disertName,price);
        addToLinkedList(menu);
    }

    private void addToLinkedList(Menu menu){
        dinnerItems.add(menu);
    }


    @Override
    public Iterator<Menu> iterator() {
        return dinnerItems.iterator();
    }
}

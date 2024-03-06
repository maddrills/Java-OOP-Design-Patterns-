package IteratorDesignPatternByMe;

import java.util.HashMap;
import java.util.Iterator;

public class LunchMenu implements IteratorFeedBack{
    private Menu menu;
    private String menuName;
    private HashMap<Integer,Menu> lunchItems;
    private int counter;

    public String getMenuName() {
        return menuName;
    }

    public LunchMenu(String menuName){
        this.menuName = menuName;
        this.lunchItems = new HashMap<>();
    }

    public void addLunchItem(String disertName,int price){
        this.menu  = new Menu(disertName,price);
        addToMap(menu);
        counter++;
    }

    private void addToMap(Menu menu){
        lunchItems.put(counter,menu);
    }


    @Override
    public Iterator<Menu> iterator() {
        return lunchItems.values().iterator();
    }
}

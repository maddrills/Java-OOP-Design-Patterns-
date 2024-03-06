package IteratorDesignPatternByMe;

import java.util.ArrayList;
import java.util.Iterator;

public class Desert implements IteratorFeedBack {
    private Menu menu;
    private String menuName;
    private ArrayList<Menu> desertMenuItems;

    public Desert(String menuName){
        this.menuName = menuName;
        desertMenuItems = new ArrayList<>();
    }

    public String getMenuName() {
        return menuName;
    }

    public void addDisert(String disertName,int price){
        this.menu = new Menu(disertName,price);
        addToArray(menu);
    }


    private void addToArray(Menu menu){
        desertMenuItems.add(menu);
    }

    @Override
    public Iterator<Menu> iterator() {
        return desertMenuItems.iterator();
    }
}

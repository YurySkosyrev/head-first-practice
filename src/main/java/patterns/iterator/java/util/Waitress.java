package patterns.iterator.java.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Waitress {

    List<Menu> menus;

    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {

        Iterator<Menu> iterator = menus.iterator();

        while (iterator.hasNext()) {
            Menu menu = iterator.next();
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

//    public void printVegetarianMenu() {
//        System.out.println("\nVEGETARIAN MENU\n---------------");
//        printVegetarianMenu(pancakeHouseMenu.createIterator());
//        printVegetarianMenu(dinerMenu.createIterator());
//        printVegetarianMenu(cafeMenu.createIterator());
//    }

//    public boolean isItemVegetarian(String name) {
//        java.util.Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
//        if (isVegetarian(name, pancakeIterator)) {
//            return true;
//        }
//        java.util.Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
//        if (isVegetarian(name, dinerIterator)) {
//            return true;
//        }
//        java.util.Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
//        if (isVegetarian(name, cafeIterator)) {
//            return true;
//        }
//        return false;
//    }
//
//
//    private void printVegetarianMenu(java.util.Iterator<MenuItem> iterator) {
//        while (iterator.hasNext()) {
//            MenuItem menuItem = iterator.next();
//            if (menuItem.isVegetarian()) {
//                System.out.print(menuItem.getName() + ", ");
//                System.out.print(menuItem.getPrice() + " -- ");
//                System.out.println(menuItem.getDescription());
//            }
//        }
//    }
//
//    private boolean isVegetarian(String name, Iterator<MenuItem> iterator) {
//        while (iterator.hasNext()) {
//            MenuItem menuItem = iterator.next();
//            if (menuItem.getName().equals(name)) {
//                if (menuItem.isVegetarian()) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
}

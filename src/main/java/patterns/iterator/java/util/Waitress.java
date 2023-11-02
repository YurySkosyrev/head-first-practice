package patterns.iterator.java.util;

import java.util.Iterator;

public class Waitress {

    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();

        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
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

package com.skillsoft.nestedclasseslambdas;

public class Main {

    public static void main(String[] args) {

        Product keyboard = new Product("Dell Keyboard", 49, "Computer Accessories");
        Product mouse = new Product("HP Mouse", 19, "Computer Accessories");
        Product printer = new Product("Epson Printer", 599, "Electronics");

        Product.Category keyboardCategory = keyboard.getCategory(); // cannot access if Category class has private access modifier
        Product.Category mouseCategory = mouse.getCategory(); // can access if Category class has private-package (default) access modifier
        Product.Category printerCategory = printer.getCategory();

        System.out.println("Keyboard category: " + keyboardCategory);
        System.out.println("Mouse category: " + mouseCategory);
        System.out.println("Printer category: " + printerCategory);

        System.out.println();

        // NOTE: We can still have categories that are not associated with any product
        // i.e. standalone categories

        Product.Category mobiles = new Product.Category("Mobiles Phones");
        Product.Category home = new Product.Category("Home Furnishing");

        System.out.println("Mobiles: " + mobiles);
        System.out.println("Home: " + home);

//        Product keyboard = new Product("Dell Keyboard", 49, "Computer Accessories");
//        Product mouse = new Product("HP Mouse", 19, "Computer Accessories");
//        Product printer = new Product("Epson Printer", 599, "Electronics");
//
//        Category keyboardCategory = keyboard.getCategory(); // Cannot resolve symbol 'Category'
//        Category mouseCategory = mouse.getCategory(); // Cannot resolve symbol 'Category'
//        Category printerCategory = printer.getCategory();  // Cannot resolve symbol 'Category'
//
//        System.out.println("Keyboard category: " + keyboardCategory);
//        System.out.println("Mouse category: " + mouseCategory);
//        System.out.println("Printer category: " + printerCategory);
//
//        System.out.println();
    }
}

// Static Nested Class
// A nested class defined within an outer class, thus logically associated with the outer class

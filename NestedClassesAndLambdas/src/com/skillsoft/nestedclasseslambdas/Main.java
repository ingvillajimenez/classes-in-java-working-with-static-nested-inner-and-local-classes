package com.skillsoft.nestedclasseslambdas;

public class Main {

    public static void main(String[] args) {

        Product keyboard = new Product("Dell Keyboard", 49, "Computer Accessories");
        Product mouse = new Product("HP Mouse", 19, "Computer Accessories");
        Product printer = new Product("Epson Printer", 599, "Electronics");

        System.out.println("Keyboard: " + keyboard);
        System.out.println("Mouse: " + mouse);
        System.out.println("Printer: " + printer);

        System.out.println();

        printer.updateCategory("Computer Peripherals");
        System.out.println(printer);

        System.out.println();

        System.out.println("Keyboard category: " + keyboard.getCategory());
        System.out.println("Mouse category: " + mouse.getCategory());
        System.out.println("Printer category: " + printer.getCategory());

        System.out.println();

//        Product keyboard = new Product("Dell Keyboard", 49, "Computer Accessories");
//        Product mouse = new Product("HP Mouse", 19, "Computer Accessories");
//        Product printer = new Product("Epson Printer", 599, "Electronics");
//
//        System.out.println("Keyboard: " + keyboard);
//        System.out.println("Mouse: " + mouse);
//        System.out.println("Printer: " + printer);
//
//        System.out.println();
//
//        printer.updateCategory("Computer Peripherals");
//        System.out.println(printer);
//
//        System.out.println();
//
//        // NOTE: We can also have categories that are not associated with any product
//        // i.e. standalone categories
//
//        Category mobiles = new Category("Mobile Phones");
//        Category home = new Category("Home Furnishings");
//
//        System.out.println("Mobiles: " + mobiles);
//        System.out.println("Home: " + home);


    }
}

// Static Nested Class
// A nested class defined within an outer class, thus logically associated with the outer class

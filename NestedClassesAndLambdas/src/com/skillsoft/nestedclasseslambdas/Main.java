package com.skillsoft.nestedclasseslambdas;

public class Main {

    public static void main(String[] args) {

        Product keyboard = new Product(
                "Dell Keyboard", 49, "Computer Accessories", 4.3);
        Product mouse = new Product(
                "HP Mouse", 19, "Computer Accessories", 3.9);
        Product printer = new Product(
                "Epson Printer", 599, "Electronics", 4.5);

        keyboard.getRating().printRating();
        mouse.getRating().printRating();
        printer.getRating().printRating();

        System.out.println();

        Product.Rating rating = new Product.Rating(3.6, keyboard);
        rating.printRating();

//        Product keyboard = new Product("Dell Keyboard", 49, "Computer Accessories");
//        Product mouse = new Product("HP Mouse", 19, "Computer Accessories");
//        Product printer = new Product("Epson Printer", 599, "Electronics");

//        keyboard.getCategory().printProductDetails();
//        mouse.getCategory().printProductDetails();
//        printer.getCategory().printProductDetails();
//
//        System.out.println();

    }
}

// Static Nested Class
// A nested class defined within an outer class, thus logically associated with the outer class

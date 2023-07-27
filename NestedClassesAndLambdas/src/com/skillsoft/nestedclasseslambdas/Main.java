package com.skillsoft.nestedclasseslambdas;

public class Main {

    public static void main(String[] args) {

        Product keyboard = new Product(
                "Dell Keyboard", 49, 4.3);
        keyboard.getReviews().add("Very good!");

        Product mouse = new Product(
                "HP Mouse", 19, 3.9);

        Product printer = new Product(
                "Epson Printer", 599, 4.5);
        printer.getReviews().add("Works smoothly");

        System.out.println(keyboard);
        System.out.println(mouse);
        System.out.println(printer);

        System.out.println();

//        Product.ReviewsAndRatings reviewsAndRatings1 = new Product.ReviewsAndRatings(4.5, null); // java.lang.IllegalArgumentException
//        Product.ReviewsAndRatings reviewsAndRatings2 = new Product.ReviewsAndRatings(2.5, null); // java: com.skillsoft.nestedclasseslambdas.Product.ReviewsAndRatings has private access in com.skillsoft.nestedclasseslambdas.Product
//
//        System.out.println(reviewsAndRatings1);
//        System.out.println(reviewsAndRatings2);
//
//        System.out.println();

//        Product keyboard = new Product(
//                "Dell Keyboard", 49, 4.3);
//        keyboard.getReviewsAndRatings().addReviews("Very good!");
//
//        Product mouse = new Product(
//                "HP Mouse", 19, 3.9);
//
//        Product printer = new Product(
//                "Epson Printer", 599, 4.5);
//        printer.getReviewsAndRatings().addReviews("Works smoothly");
//
//        System.out.println(keyboard);
//        System.out.println(mouse);
//        System.out.println(printer);
//
//        System.out.println();
    }
}

// Static Nested Class
// A nested class defined within an outer class, thus logically associated with the outer class

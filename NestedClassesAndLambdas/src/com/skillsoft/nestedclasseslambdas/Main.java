package com.skillsoft.nestedclasseslambdas;

public class Main {

    public static void main(String[] args) {

        Product keyboard = new Product("Dell Keyboard", 49);
        Product mouse = new Product("HP Mouse", 19);
        Product printer = new Product("Epson Printer", 599);

        Product.ReviewsAndRatings reviewsAndRatingsKeyboard = keyboard.new ReviewsAndRatings(4.3);
        reviewsAndRatingsKeyboard.addReviews("Very good!");
        // reviewsAndRatingsKeyboard will automatically be associated with the product instance that is the keyboard
        Product.ReviewsAndRatings reviewsAndRatingsMouse = mouse.new ReviewsAndRatings(3.9);

        Product.ReviewsAndRatings reviewsAndRatingsPrinter = printer.new ReviewsAndRatings(4.5);
        reviewsAndRatingsPrinter.addReviews("Never breaks down");

        System.out.println(reviewsAndRatingsKeyboard);
        System.out.println(reviewsAndRatingsMouse);
        System.out.println(reviewsAndRatingsPrinter);

        System.out.println();

        // NOTE: The Product instance is not automatically linked to the right ReviewsAndRating instance
        System.out.println(keyboard.getReviewsAndRatings());
        System.out.println(mouse.getReviewsAndRatings());
        System.out.println(printer.getReviewsAndRatings());

        System.out.println();

        System.out.println("*** Need to explicitly specify reviews and ratings on product");

        keyboard.setReviewsAndRatings(reviewsAndRatingsKeyboard);
        mouse.setReviewsAndRatings(reviewsAndRatingsMouse);
        printer.setReviewsAndRatings(reviewsAndRatingsPrinter);

        System.out.println(keyboard.getReviewsAndRatings());
        System.out.println(mouse.getReviewsAndRatings());
        System.out.println(printer.getReviewsAndRatings());

        System.out.println();

//        Product.ReviewsAndRatings reviewsAndRatingsKeyboard = new Product.ReviewsAndRatings(4.3); // 'com.skillsoft.nestedclasseslambdas.Product' is not an enclosing class
//        Product.ReviewsAndRatings reviewsAndRatingsMouse = new Product.ReviewsAndRatings(3.9);
//        Product.ReviewsAndRatings reviewsAndRatingsPrinter = new Product.ReviewsAndRatings(4.5);
//        // java: an enclosing instance that contains com.skillsoft.nestedclasseslambdas.Product.ReviewsAndRatings is required
//        // cannot have these inner classes be stand alone objects
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
//        System.out.println(keyboard.getReviewsAndRatings());
//        System.out.println(mouse.getReviewsAndRatings());
//        System.out.println(printer.getReviewsAndRatings());
//
//        System.out.println();

//        System.out.println(keyboard);
//        System.out.println(mouse);
//        System.out.println(printer);




    }
}

// Static Nested Class
// A nested class defined within an outer class, thus logically associated with the outer class

// Inner Class
// An inner class in Java cannot be created in the absence of an outer class instance
// The instance of an inner class is automatically associated with an instance of the outer class

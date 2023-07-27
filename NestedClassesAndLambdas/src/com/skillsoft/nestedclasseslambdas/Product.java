package com.skillsoft.nestedclasseslambdas;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private long id;
    private String name;
    private int price;

    private ReviewsAndRatings reviewsAndRatings;

    public Product(String name, int price, double rating) {

        this.id = Math.round(Math.random() * 10000);
        this.name = name;
        this.price = price;

        this.reviewsAndRatings = new ReviewsAndRatings(rating, this);
    }

    public double getRatings() {
        return reviewsAndRatings.rating;
    }

    public List<String> getReviews() {
        return reviewsAndRatings.reviews;
    }

//    public ReviewsAndRatings getReviewsAndRatings() {
//        return reviewsAndRatings;
//    }

    @Override
    public String toString() {
        return String.format("Name: %s, Price: %d, Reviews and ratings: %s",
                name, price, reviewsAndRatings);
    }

//    public static class ReviewsAndRatings {
    private static class ReviewsAndRatings {

        private final Product product;
        private final double rating;
        private final List<String> reviews;

        public ReviewsAndRatings(double rating, Product product) {
            // throwing exception from constructors is bad practice in Java
//            if (product == null) {
//                throw new IllegalArgumentException("The input argument 'product' cannot be null");
//            }

            this.product = product;
            this.rating = rating;

            this.reviews = new ArrayList<>();
        }

        public void addReviews(String review) {
            this.reviews.add(review);
        }

        @Override
        public String toString() {
            return String.format("Product: %s, rating: %.1f, reviews: %s",
                    product == null ? "<unknown>" : product.name, rating, reviews);
        }
    }
}

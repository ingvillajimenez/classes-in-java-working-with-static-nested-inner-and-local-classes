package com.skillsoft.nestedclasseslambdas;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private long id;
    private String name;
    private int price;

    private ReviewsAndRatings reviewsAndRatings;

//    public Product(String name, int price, double rating) {
    public Product(String name, int price) {

        this.id = Math.round(Math.random() * 10000);
        this.name = name;
        this.price = price;

//        this.reviewsAndRatings = new ReviewsAndRatings(rating);
//        this.reviewsAndRatings = new ReviewsAndRatings(rating, this);
    }

    public ReviewsAndRatings getReviewsAndRatings() {
        return reviewsAndRatings;
    }

    public void setReviewsAndRatings(ReviewsAndRatings reviewsAndRatings) {
        this.reviewsAndRatings = reviewsAndRatings;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Price: %d, Reviews and ratings: %s",
                name, price, reviewsAndRatings);
    }

    public class ReviewsAndRatings { // inner class, no static keyword, it is inside an outer class

//        private final Product product;
        private final double rating;
        private final List<String> reviews;

//        public ReviewsAndRatings(double rating, Product product) {
        public ReviewsAndRatings(double rating) {

//            this.product = product;
            this.rating = rating;

            this.reviews = new ArrayList<>();
        }

        public void addReviews(String review) {
            this.reviews.add(review);
        }

        @Override
        public String toString() {
            return String.format("Product: %d, %s, %d, rating: %.1f, reviews: %s",
                    Product.this.id, Product.this.name, Product.this.price,
                    rating, reviews);
            // Reference the Product instance that is automatically associated with ReviewsAnRatings
//                    product == null ? "<unknown>" : product.name, rating, reviews);
        }
    }
}

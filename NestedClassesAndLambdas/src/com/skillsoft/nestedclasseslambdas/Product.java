package com.skillsoft.nestedclasseslambdas;

public class Product {

    private long id;
    private String name;
    private int price;

    private Category category;
    private Rating rating;

    public Product(String name, int price, String categoryName, double rating) {

        this.id = Math.round(Math.random() * 10000);
        this.name = name;
        this.price = price;

//        this.category = new Category(categoryName);
        this.category = new Category(categoryName, this);
        this.rating = new Rating(rating, this);
    }

    public void updateCategory(String name) {
        this.category.updateCategory(name);
    }

    public Category getCategory() {
        return category;
    }

    public Rating getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return String.format("Product ID: %d, Name: %s, Price: %d, Category name: %s",
                id, name, price, category.name);
    }

    // NOTE: The "public" modifier means that objects of this class
    // can be instantiated outside of this class as well
    public static class Category {

        private final long id;
        private String name;
        private Product product;

        public Category(String name, Product product) {
            this.id = Math.round(Math.random() * 10000);
            this.name = name;
            this.product = product;
        }

        public void updateCategory(String name) {
            this.name = name;
        }

//        public void printProductDetails() {
//            // Category is not automatically associated with a product instance
//            System.out.println(price); // Non-static field 'price' cannot be referenced from a static context
//            System.out.println(this.price); // Cannot resolve symbol 'price'
//            System.out.println(Category.this.price); // Cannot resolve symbol 'price'
//            System.out.println(Product.this.price); // 'com.skillsoft.nestedclasseslambdas.Product.this' cannot be referenced from a static context
//        }

        public void printProductDetails() {
            System.out.println("**** Product details");
            System.out.println("ID: " + product.id);
            System.out.println("Name: " + product.name);
            System.out.println("Price: " + product.price);
            System.out.println("Category: " + product.category);
        }

        @Override
        public String toString() {
            return String.format("Category ID: %d, Name: %s", id, name);
        }
    }

    public static class Rating {

        private Product product;
        private double rating;

        public Rating(double rating, Product product) {

            this.product = product;
            this.rating = rating;
        }

        public void printRating() {
            System.out.println("****Average product rating");
            System.out.println(String.format("Product ID: %d Name: %s Rating: %.2f\n",
                    product.id, product.name, rating));
        }
    }
}

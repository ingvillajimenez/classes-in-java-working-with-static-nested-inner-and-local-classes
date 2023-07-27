package com.skillsoft.nestedclasseslambdas;

public class Product {

    private long id;
    private String name;
    private int price;

    private Category category;

    public Product(String name, int price, String categoryName) {

        this.id = Math.round(Math.random() * 10000);
        this.name = name;
        this.price = price;

        this.category = new Category(categoryName);
    }

    public void updateCategory(String name) {
        this.category.updateCategory(name);
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return String.format("Product ID: %d, Name: %s, Price: %d, Category: %s",
                id, name, price, category);
    }

    // NOTE: The "public" modifier means that objects of this class
    // can be instantiated outside of this class as well
    public static class Category {

        private final long id;
        private String name;

        public Category(String name) {
            this.id = Math.round(Math.random() * 10000);
            this.name = name;
        }

        public void updateCategory(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return String.format("Category ID: %d, Name: %s", id, name);
        }
    }
}

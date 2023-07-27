package com.skillsoft.nestedclasseslambdas;

//public class Product {
class Product { // Package-private class

    private long id;
    private String name;
    private int price;

    private Category category;

    public Product(String name, int price, String categoryName) {

        this.id = Math.round(Math.random() * 10000);
        this.name = name;
        this.price = price;

        this.category = new Category(categoryName); // Can access even if Category class is private
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
//                id, name, price, category);
                id, name, price, category.name); // can access private field "name" of the Category class
    }

    // NOTE: The "public" modifier means that objects of this class
    // can be instantiated outside of this class as well
    public static class Category {
//    private static class Category {
//    static class Category { // Package-private class

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

package com.skillsoft.anotherpackage;

import com.skillsoft.nestedclasseslambdas.Product;
import com.skillsoft.nestedclasseslambdas.Product.Category;

public class Main {

    public static void main(String[] args) {

        Product.Category mobiles = new Product.Category("Mobile Phones"); // Cannot be accessed from outside package if Category has private-package access modifier
        Product.Category home = new Product.Category("Home Furnishings"); // Cannot be accessed from outside package if Product has private-package access modifier

        System.out.println("Mobiles: " + mobiles);
        System.out.println("Home: " + home);
    }
}

package com.skillsoft.nestedclasseslambdas;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Customer jason = new Customer(1234, "Jason", "212-345-1235, jason@gmail.com");
        jason.validateCustomer();

        System.out.println(jason);

        Customer mona = new Customer(2344, "Mona", "2334546567, mona@somemail.com");
        mona.validateCustomer();

        System.out.println(mona);

        Customer lucy = new Customer(2344, "Lucy", "425-341-0987, lucy@somemail");
        lucy.validateCustomer();

        System.out.println(lucy);

    }
}

// Static Nested Class
// A nested class defined within an outer class, thus logically associated with the outer class

// Inner Class
// An inner class in Java cannot be created in the absence of an outer class instance
// The instance of an inner class is automatically associated with an instance of the outer class

// Iterators
// Allow iterating over elements in any collection

// Local Classes
// Defined locally within a block of Java code, rather than in its own file, or nested within another class
// A local class can only be accessed within the block in which it's declared
// A local class has complete access to the member variables of the outer class

// Final or Effectively Final
// The value held in the local variable should not change once it has been assigned
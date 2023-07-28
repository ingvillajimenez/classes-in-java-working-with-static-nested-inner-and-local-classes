package com.skillsoft.nestedclasseslambdas;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        StringContainer names = new StringContainer("Alice", "Bob", "Charles", "Darwin");

        for(String name: names) {
            System.out.println(name);
        }

//        Iterator<String> namesIterator = names.iterator();
//
//        System.out.println("\nFirst element");
//        System.out.println("Has next: " + namesIterator.hasNext());
//        System.out.println(namesIterator.next());
//
//        System.out.println("\nSecond element");
//        System.out.println("Has next: " + namesIterator.hasNext());
//        System.out.println(namesIterator.next());
//
//        System.out.println("\nThird element");
//        System.out.println("Has next: " + namesIterator.hasNext());
//        System.out.println(namesIterator.next());
//
//        System.out.println("\nFourth element");
//        System.out.println("Has next: " + namesIterator.hasNext());
//        System.out.println(namesIterator.next());
//
//        System.out.println("\nOut of elements");
//        System.out.println("Has next: " + namesIterator.hasNext());
//        System.out.println(namesIterator.next()); // java.lang.ArrayIndexOutOfBoundsException

    }
}

// Static Nested Class
// A nested class defined within an outer class, thus logically associated with the outer class

// Inner Class
// An inner class in Java cannot be created in the absence of an outer class instance
// The instance of an inner class is automatically associated with an instance of the outer class

// Iterators
// Allow iterating over elements in any collection
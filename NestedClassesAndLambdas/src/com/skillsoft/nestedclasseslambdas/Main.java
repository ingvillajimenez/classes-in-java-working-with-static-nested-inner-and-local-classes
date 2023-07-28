package com.skillsoft.nestedclasseslambdas;

public class Main {

    public static void main(String[] args) {

        Shape triangle = new Shape("triangle", "red", "glossy");
        Shape rectangle = new Shape("rectangle", "green", "glossy");
        Shape circle = new Shape("circle", "blue", "glossy");

        Shape.Brush triangleBrush = triangle.new Brush("shiny gold", "matte");
        Shape.Brush rectangleBrush = rectangle.new Brush("shiny silver", "matte");
        Shape.Brush circleBrush = circle.new Brush("moon silver", "matte");

        triangleBrush.draw("black", "leathery");
        rectangleBrush.draw("black", "leathery");
        circleBrush.draw("black", "leathery");

//        Shape triangle = new Shape("triangle");
//        Shape rectangle = new Shape("rectangle");
//        Shape circle = new Shape("circle");
//
//        Shape.Brush triangleBrush = triangle.new Brush("red", "glossy");
//        Shape.Brush rectangleBrush = rectangle.new Brush("blue", "feathery");
//        Shape.Brush circleBrush = circle.new Brush("green", "grainy");
//
//        triangleBrush.draw();
//        rectangleBrush.draw();
//        circleBrush.draw();
//
//        Shape.Brush anotherTriangleBrush = triangle.new Brush("shiny gold", "matte");
//        anotherTriangleBrush.draw();
//
//        Shape.Brush anotherRectangleBrush = rectangle.new Brush("shiny silver", "matte");
//        anotherRectangleBrush.draw();
//
//        Shape.Brush anotherCircleBrush = circle.new Brush("moon silver", "glossy");
//        anotherCircleBrush.draw();

//        Shape triangle = new Shape("triangle", "red", "glossy");
//        Shape rectangle = new Shape("rectangle", "blue", "feathery");
//        Shape circle = new Shape("circle", "green", "grainy");
//
//        Shape.Brush triangleBrush = triangle.new Brush();
//        Shape.Brush rectangleBrush = rectangle.new Brush();
//        Shape.Brush circleBrush = circle.new Brush();
//
//        triangleBrush.draw();
//        rectangleBrush.draw();
//        circleBrush.draw();


    }
}

// Static Nested Class
// A nested class defined within an outer class, thus logically associated with the outer class

// Inner Class
// An inner class in Java cannot be created in the absence of an outer class instance
// The instance of an inner class is automatically associated with an instance of the outer class

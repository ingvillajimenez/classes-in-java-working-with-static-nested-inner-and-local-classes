package com.skillsoft.nestedclasseslambdas;

public class Shape {

    private final String shapeType;
    private final String color;
    private final String texture;

    public Shape(String shapeType, String color, String texture) {
        this.shapeType = shapeType;
        this.color = color;
        this.texture = texture;
    }

    @Override
    public String toString() {
        return String.format("Shape: %s, Color: %s, Texture: %s" ,
                shapeType, color, texture);
    }

    public class Brush {

        private final String color;
        private final String texture;

        public Brush(String color, String texture) {
            this.color = color;
            this.texture = texture;
        }

        public void draw(String color, String texture) {
            System.out.println("\n****Drawing shape: " + Shape.this.shapeType); // Access member variable of the outer class

            System.out.println("Shape's color: " + Shape.this.color); // Access member variable of the outer class
            System.out.println("Brush's color: " + this.color);
            System.out.println("Input argument's color: " + color);

            System.out.println("Shape's texture: " + Shape.this.texture); // Access member variable of the outer class
            System.out.println("Brush's texture: " + this.texture);
            System.out.println("Input argument's texture: " + texture);
        }

//        public void draw() {
//            System.out.println("\n****Drawing shape: " + Shape.this.shapeType);
//
//            System.out.println("Shape's color: " + Shape.this.color);
//            System.out.println("Brush's color: " + this.color);
//
//            System.out.println("Shape's texture: " + Shape.this.texture);
//            System.out.println("Brush's texture: " + this.texture);
//        }
    }
}

//public class Shape {
//
//    private final String shapeType;
//
//    public Shape(String shapeType) {
//        this.shapeType = shapeType;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("Shape: %s", shapeType);
//    }
//
//    public class Brush {
//
//        private final String color;
//        private final String texture;
//
//        public Brush(String color, String texture) {
//            this.color = color;
//            this.texture = texture;
//        }
//
//        public void draw() {
//            System.out.println("\n****Drawing shape: " + Shape.this.shapeType);
//            System.out.println("Color: " + this.color);
//            System.out.println("Texture: " + this.texture);
//        }
//    }
//}

//public class Shape {
//
//    private final String shapeType;
//    private final String color;
//    private final String texture;
//
//    public Shape(String shapeType, String color, String texture) {
//        this.shapeType = shapeType;
//        this.color = color;
//        this.texture = texture;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("Shape: %s, Color: %s, Texture: %s",
//                shapeType, color, texture);
//    }
//
//    public class Brush {
//
//        public Brush() {
//        }
//
//        public void draw() {
//            System.out.println("\n****Drawing shape: " + Shape.this.shapeType);
//            System.out.println("Color: " + Shape.this.color);
//            System.out.println("Texture: " + Shape.this.texture);
//        }
//    }
//}

package com.coursemicron.structural.composite;

public class Client {
    public static void main(String[] args) {
        Shape t = new Trangle();
        Shape c = new Circle();

        ShapeCollection collection = new ShapeCollection();
        collection.add(t);
        collection.add(c);
        collection.draw("red");
        collection.remove(t);
        collection.draw("green");
        collection.clear();
    }
}

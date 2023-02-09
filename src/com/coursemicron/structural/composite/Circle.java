package com.coursemicron.structural.composite;

public class Circle implements Shape{

    /**
     * @param color
     */
    @Override
    public void draw(String color) {
        System.out.println("Drawing a circle and filling color :"+color);
    }
}

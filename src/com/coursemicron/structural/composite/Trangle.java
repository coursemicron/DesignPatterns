package com.coursemicron.structural.composite;

public class Trangle implements Shape{

    /**
     * @param color
     */
    @Override
    public void draw(String color) {
        System.out.println("Drawing a triangle and filling color :"+color);
    }
}

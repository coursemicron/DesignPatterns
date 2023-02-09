package com.coursemicron.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollection implements Shape{
    private List<Shape> shapes = new ArrayList<>();

    /**
     * @param color
     */
    @Override
    public void draw(String color) {
        for (Shape s :
                shapes) {
            s.draw(color);
        }
    }
    public void add(Shape shape){
        this.shapes.add(shape);
    }

    public void remove(Shape shape){
        this.shapes.remove(shape);
    }

    public void clear(){
        this.shapes.clear();
    }
}

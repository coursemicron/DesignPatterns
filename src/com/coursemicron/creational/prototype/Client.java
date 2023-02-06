package com.coursemicron.creational.prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        NameCollection col = new NameCollection();
        col.loadData();
        NameCollection cloned = (NameCollection) col.clone();
    }
}

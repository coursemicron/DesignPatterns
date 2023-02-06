package com.coursemicron.creational.builder;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("4gb", "512gb", "i7").setHasBluetooth(true).setGraphicCardMemory("4gb").build();
        System.out.println(computer.toString());
    }
}

package com.coursemicron.creational.factory;

public class Client {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputerInstance(ComputerType.PERSONAL_COMPUTER, "4gb", "512gb", "2core");
        System.out.println(pc.toString());
        Computer server = ComputerFactory.getComputerInstance(ComputerType.SERVER_COMPUTER, "16gb", "1024gb", "8core");
        System.out.println(server.toString());
    }
}

package com.coursemicron.creational.abstractfactory;


public class Client {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputerInstance(new PCFactory("4gb","512gb","1core"));
        Computer server = ComputerFactory.getComputerInstance(new ServerFactory("16gb","1tb","8core","222"));
        System.out.println(pc.toString());
        System.out.println(server.toString());
    }
}

package com.coursemicron.creational.factory;

public class ComputerFactory {

    public static Computer getComputerInstance(ComputerType type, String ram, String hdd, String cpu){
        if (type.name().equals(ComputerType.PERSONAL_COMPUTER.toString()))return (new PersonalComputer(ram,hdd,cpu));
        if (type.name().equals(ComputerType.SERVER_COMPUTER.toString()))return (new ServerComputer(ram,hdd,cpu));
        return null;
    }
}

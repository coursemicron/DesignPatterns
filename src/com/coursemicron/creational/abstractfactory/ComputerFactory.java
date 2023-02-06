package com.coursemicron.creational.abstractfactory;

public class ComputerFactory {
    public static Computer getComputerInstance(ComputerAbstractFactory caf){
        return caf.createComputer();
    }
}

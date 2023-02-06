package com.coursemicron.creational.abstractfactory;

public class ServerFactory implements ComputerAbstractFactory{
    private String ram;
    private String hdd;
    private String cpu;

    private String serverCore;

    public ServerFactory(String ram, String hdd, String cpu, String serverCore) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.serverCore = serverCore;
    }


    /**
     * @return
     */
    @Override
    public Computer createComputer() {
        return new ServerComputer(ram,hdd,cpu,serverCore);
    }
}

package com.coursemicron.creational.factory;

public class PersonalComputer extends Computer{
    private String ram;
    private String hdd;
    private String cpu;
    /**
     * @return
     */
    @Override
    public String getRAM() {
        return this.ram;
    }

    /**
     * @return
     */
    @Override
    public String getHDD() {
        return this.hdd;
    }

    /**
     * @return
     */
    @Override
    public String getCPU() {
        return this.cpu;
    }

    public PersonalComputer(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }
}

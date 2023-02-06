package com.coursemicron.creational.factory;

public class ServerComputer extends Computer{
    private String ram;
    private String hdd;
    private String cpu;
    private String serverCore;
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

    public String getServerCore() {
        return serverCore;
    }

    public void setServerCore(String serverCore) {
        this.serverCore = serverCore;
    }

    public ServerComputer(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }
}

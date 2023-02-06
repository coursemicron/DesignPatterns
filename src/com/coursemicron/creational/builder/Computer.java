package com.coursemicron.creational.builder;

public class Computer {
    private String ram;
    private String hdd;
    private String cpu;

    private String graphicCardMemory;
    private boolean hasBluetooth;

    public Computer setGraphicCardMemory(String graphicCardMemory) {
        this.graphicCardMemory = graphicCardMemory;
        return this;
    }

    public Computer setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
        return this;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", cpu='" + cpu + '\'' +
                ", graphicCardMemory='" + graphicCardMemory + '\'' +
                ", hasBluetooth=" + hasBluetooth +
                '}';
    }

    public Computer(ComputerBuilder builder) {
        this.ram = builder.ram;
        this.hdd = builder.hdd;
        this.cpu = builder.cpu;
        this.graphicCardMemory = builder.graphicCardMemory;
        this.hasBluetooth = builder.hasBluetooth;
    }

    public static class ComputerBuilder{
        private String ram;
        private String hdd;
        private String cpu;

        private String graphicCardMemory;
        private boolean hasBluetooth;

        public ComputerBuilder setGraphicCardMemory(String graphicCardMemory) {
            this.graphicCardMemory = graphicCardMemory;
            return this;
        }

        public ComputerBuilder setHasBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public ComputerBuilder(String ram, String hdd, String cpu) {
            this.ram = ram;
            this.hdd = hdd;
            this.cpu = cpu;
        }

        public Computer build(){
            return new Computer(this);
        }
    }


}

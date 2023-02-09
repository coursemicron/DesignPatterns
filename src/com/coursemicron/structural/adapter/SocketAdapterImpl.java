package com.coursemicron.structural.adapter;

public class SocketAdapterImpl extends Socket implements SocketAdapter{

    /**
     * @return
     */
    @Override
    public Volt get150Volt() {
        Volt v = getVolt(); // Volt is 250, so to get 150 volt we need to deduct it by 100 volts
        return convertVolt(v,100);
    }

    /**
     * @return
     */
    @Override
    public Volt get12Volt() {
        Volt v = getVolt(); // Volt is 250, so to get 12 volt we need to deduct it by 238 volts
        return convertVolt(v,238);
    }

    private Volt convertVolt(Volt v, int ratio){
        return new Volt(v.getVolt()-ratio);
    }
}

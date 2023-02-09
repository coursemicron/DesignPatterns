package com.coursemicron.structural.adapter;

public class Client {
    public static void main(String[] args) {
        // From socket we always get 250 volts
        Socket socket = new Socket();
        System.out.println(socket.getVolt());
        //From adapter we can get any volts
        SocketAdapter adapter = new SocketAdapterImpl();
        System.out.println(adapter.get150Volt());
        System.out.println(adapter.get12Volt());
    }
}

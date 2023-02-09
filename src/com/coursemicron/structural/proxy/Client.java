package com.coursemicron.structural.proxy;

public class Client {
    public static void main(String[] args) throws Exception {
        CommandExecutorProxy proxy = new CommandExecutorProxy("root","wrong_pwd");
        proxy.run("ls");
        proxy.run("ll");
    }
}

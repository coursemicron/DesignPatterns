package com.coursemicron.structural.proxy;

public class RuntimeCommandExecutorImpl implements RuntimeCommandExecutor{
    /**
     * @param cmd
     */
    @Override
    public void run(String cmd) {
        System.out.println(cmd);
    }
}

package com.coursemicron.structural.proxy;

public class CommandExecutorProxy implements RuntimeCommandExecutor{
    private RuntimeCommandExecutor executor;
    boolean isAdmin;
    private String user;
    private String pwd;

    /**
     * @param cmd
     */
    @Override
    public void run(String cmd) throws Exception {
       if(isAdmin) executor.run(cmd);
       else {
           if(cmd.equals("ll"))throw new Exception("Insufficient privillage to execute given command: "+cmd);
           executor.run(cmd);
       }
    }

    public CommandExecutorProxy(String user, String pwd) {
        if (user.equals("root") && pwd.equals("rootpwd"))isAdmin=true;
        executor = new RuntimeCommandExecutorImpl();
    }


}

package com.tasks5.command;

public class Echo implements Command {

    private String strCmd = "Error";
    public Echo (String str){
        if(!str.isBlank()){
            strCmd = str;
        }
    }

    @Override
    public void execute(){
        System.out.println(strCmd);
    }
}

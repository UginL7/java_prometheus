package com.tasks5.command;

public class CurrentDate implements Command {
    
    private String strCmd = "Error";

    public CurrentDate(String str){
        if(str != null){
            str = str.toLowerCase().trim();
            if(str.equals("now")){
                strCmd = str;
            }
        }
    }    

    @Override
    public void execute(){
        if(strCmd != "Error"){
            System.out.println(System.currentTimeMillis());
        } else {
            System.out.println("Error");
        }
    }
}
package com.tasks5.command;

public class Bye implements Command{
    
    @Override
    public void execute(){
        System.out.println("Goodbye!");
    }
}

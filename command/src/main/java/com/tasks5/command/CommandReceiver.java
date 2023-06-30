package com.tasks5.command;

public class CommandReceiver  implements Command{

    private String[] args;

    public CommandReceiver(String[] inCommand){
        args = inCommand;
    }

    @Override
    public void execute(){
        Command command;
        String cmd = args[0].toLowerCase().trim();
        if(args.length == 0 | ((cmd == "echo" | cmd == "date") & args.length == 1)){
            System.out.println("Error");
            return;        
        }        

        switch(cmd){
            case "help":
                command = new Help();
                break;
            case "echo":
                command = new Echo(args[1]);
                break;
            case "date":
                command = new CurrentDate(args[1]);
                break;
            case "exit":
                 command = new Bye();
                break;
            default:
                System.out.println("Error");
                return;
        }

        command.execute();
    }
    
}

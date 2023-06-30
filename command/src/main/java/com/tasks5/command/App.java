package com.tasks5.command;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        if(args == null){
            System.out.println("Error");
            return;
        }

        if(args.length == 0){
            System.out.println("Error");
            return;
        }

        Command command;
        String cmd = args[0].toLowerCase().trim();

        if((cmd.equals("echo") | cmd.equals("date")) & args.length == 1){
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

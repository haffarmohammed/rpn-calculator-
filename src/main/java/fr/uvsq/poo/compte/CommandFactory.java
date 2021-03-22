package fr.uvsq.poo.compte;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CommandFactory {
    protected Stack Historique = new Stack();
    protected Map<String,Command> commands;

    public CommandFactory() {
        this.commands = new HashMap<>();
    }

    public void addCommand (String name, Command command) {
        this.commands.put(name,command) ;
    }

    public static CommandFactory init (){
        CommandFactory cf = new CommandFactory();
        cf.addCommand("Undo",()->{cf.Historique.pop(); });
        cf.addCommand("Quit",()->{System.exit(0);});
        return cf;
    }
}

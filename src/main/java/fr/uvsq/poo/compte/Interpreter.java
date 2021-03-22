package fr.uvsq.poo.compte;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Interpreter {
    private final Map<String, Command> commands;
    Stack<Integer> Operands;

    public Interpreter() {
        this.commands = new HashMap<>();
        Operands = new Stack<>();
    }

    public void addCommand(String name, Command command){
        this.commands.put(name, command);
    }

    public void executeCommand(String name){


        if (this.commands.containsKey(name)){
            this.commands.get(name).apply();
        }else System.out.println("command not supported !!!");
    }



    public static Interpreter init(){
        Interpreter cf = new Interpreter();
        cf.addCommand("undo", () -> {
            cf.Operands.pop();
        });
        cf.addCommand("exit", () -> {
            System.exit(0);
        });
        return cf;
    }
}

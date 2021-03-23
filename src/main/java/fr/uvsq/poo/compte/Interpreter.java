package fr.uvsq.poo.compte;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.Stack;

public class Interpreter {
    protected Stack<Command> history = new Stack<>();
    protected Stack<Integer> operands = new Stack<>();
    protected Hashtable<String, Command> set = new Hashtable<>();

    public void session(){
        Scanner s = new Scanner(System.in);
        while (true){
            Command command = getNewCommand(s.nextLine());
            if (command != null)
                if (command instanceof Quit){
                    System.out.println("quiting");
                    return;
                }else {
                    command.execute();
                }
        }
    }

    public Command getNewCommand(String input){
        try {
            operands.push(Integer.parseInt(input));
            afficher();
            return null;
        }catch (Exception e){
            if (! set.containsKey(input)){
                System.out.println("not valid command");
                return null;

            }else return set.get(input);
        }

    }

    public void afficher(){
        System.out.println(operands.toString());
    }
}

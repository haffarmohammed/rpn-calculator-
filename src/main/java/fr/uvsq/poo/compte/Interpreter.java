package fr.uvsq.poo.compte;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Stack;

public class Interpreter {
    protected Stack<Command> history = new Stack<>();
    protected Stack<Integer> operands = new Stack<>();
    protected Hashtable<String, Command> commands = new Hashtable<>();
    int numEnter;

    public void session(){
        Scanner sc = new Scanner(System.in);
        while (true){
            Command command = getNewCommand(sc.nextLine());
            if (command != null)
                if (command instanceof Quit){
                    System.out.println("quiting");
                    return;
                }else {
                    command.apply();
                }
        }
    }

    public Command getNewCommand(String input){
        try {
            numEnter = Integer.parseInt(input);
            input = "Accept";
        }catch (Exception e){ }

        if (! commands.containsKey(input)){
            System.out.println("not valid command");
            afficher();
            return null;
        }else {
            afficher();
            return commands.get(input);
        }

    }

    public void afficher(){
        System.out.println(operands.toString());
    }
}

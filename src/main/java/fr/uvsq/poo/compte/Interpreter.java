package fr.uvsq.poo.compte;

import java.util.*;

public class Interpreter {
    protected Stack<Command> history = new Stack<>();
    protected Stack<Integer> Operands = new Stack<>();
    protected Hashtable<String, Command> Commands = new Hashtable<>();
    int numEnter;


    public void session(){
        Scanner sc = new Scanner(System.in);
        while (true){
            String lire = sc.nextLine();
            Command command = getNewCommand(lire);
            if (command != null){
                if (command instanceof Quit){
                    System.out.printf("Thanks for using our Calculator");
                    return;
                }
                else{
                    command.apply();
                }
            }

        }
    }


    public void Afficher (){
        System.out.println(Operands.toString());
    }


    protected Command getNewCommand(String Input) {

        try {
            numEnter = Integer.parseInt(Input);
            Input = "Accept";
          //   Command Accept = getNewCommand("Accept");
          //  return Accept;
        } catch (Exception e) {

        }
            if (! Commands.containsKey(Input)){
                System.out.println("Command not valid");
                Afficher();
                return null;
            }
            else{
                Afficher();
                return Commands.get(Input);
            }




/*       finally {
            Afficher();
        }*/
    }

    }


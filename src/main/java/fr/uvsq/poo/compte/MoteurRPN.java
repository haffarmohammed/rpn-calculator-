package fr.uvsq.poo.compte;

public class MoteurRPN extends Interpreter{
    public MoteurRPN() {
        Commands.put("Quit", new Quit());
        Commands.put("Undo", new Quit());
        Commands.put("Add", new Quit());
        Commands.put("Subtract", new Quit());

    }
}

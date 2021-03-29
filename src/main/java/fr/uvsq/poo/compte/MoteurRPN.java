package fr.uvsq.poo.compte;

public class MoteurRPN extends Interpreter{
    public MoteurRPN() {
        Commands.put("Quit", new Quit());
        Commands.put("Undo", new Undo(history));
        Commands.put("+", new Add(this));
    //    Commands.put("Subtract", new Subtract(this));

    }
}
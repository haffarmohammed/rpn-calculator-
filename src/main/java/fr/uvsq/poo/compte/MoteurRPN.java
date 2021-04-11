package fr.uvsq.poo.compte;

public class MoteurRPN extends Interpreter {
    public MoteurRPN(){
        commands.put("+", new Add(this));
        commands.put("-", new Subtract(this));
        commands.put("*", new Multiply(this));
        commands.put("/", new Divide(this));
        commands.put("Accept", new Accept(this));
        commands.put("quit", new Quit());
        commands.put("undo", new Undo(history));

    }
}

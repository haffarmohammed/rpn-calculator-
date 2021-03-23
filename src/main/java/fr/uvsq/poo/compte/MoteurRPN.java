package fr.uvsq.poo.compte;

public class MoteurRPN extends Interpreter {
    public MoteurRPN(){
        set.put("+", new Add(this));
        set.put("quit", new Quit());
        set.put("undo", new Undo(history));

    }
}

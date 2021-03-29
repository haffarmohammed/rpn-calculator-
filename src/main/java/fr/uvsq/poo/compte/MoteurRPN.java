package fr.uvsq.poo.compte;

public class MoteurRPN extends Interpreter {
    public MoteurRPN(){
        set.put("+", new Plus(this));
        set.put("-", new Min(this));
        set.put("*", new Mul(this));
        set.put("/", new Div(this));
        set.put("quit", new Quit());
        set.put("undo", new Undo(history));

    }
}

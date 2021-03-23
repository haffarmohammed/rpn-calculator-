package fr.uvsq.poo.compte;

public class Calculator extends Interpreter {
    public Calculator(){
        set.put("quit", new Quit());
        set.put("undo", new Undo(history));

    }
}

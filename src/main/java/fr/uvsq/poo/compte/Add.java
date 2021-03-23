package fr.uvsq.poo.compte;

import java.util.Stack;

public class Add extends Command{
    Interpreter interpreter;

    public Add(Interpreter interpreter){
        this.interpreter = interpreter;
    }

    @Override
    public void execute() {
        interpreter.operands.push(interpreter.operands.pop() + interpreter.operands.pop());
        interpreter.afficher();
    }

    @Override
    public void undo() {

    }
}

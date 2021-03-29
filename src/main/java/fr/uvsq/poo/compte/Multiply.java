package fr.uvsq.poo.compte;

public class Multiply extends Command {

    Interpreter interpreter;

    public Multiply(Interpreter interpreter) {
        this.interpreter = interpreter;
    }

    @Override
    public void apply() {
        interpreter.Operands.push(interpreter.Operands.pop()*interpreter.Operands.pop());
        interpreter.Afficher();

    }

    @Override
    public void undo() {

    }
}

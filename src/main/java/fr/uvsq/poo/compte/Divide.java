package fr.uvsq.poo.compte;

public class Divide extends Command{

    Interpreter interpreter;

    public Divide(Interpreter interpreter) {
        this.interpreter = interpreter;
    }
    @Override
    public void apply() {
        int first = interpreter.Operands.pop();
        interpreter.Operands.push(interpreter.Operands.pop()/first);
        interpreter.Afficher();
    }

    @Override
    public void undo() {

    }
}

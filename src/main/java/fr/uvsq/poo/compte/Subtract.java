package fr.uvsq.poo.compte;

public class Subtract extends Command {

    Interpreter interpreter;

    public Subtract(Interpreter interpreter) {
        this.interpreter = interpreter;
    }
    @Override
    public void apply() {
        this.operant=interpreter.Operands.pop();
        interpreter.Operands.push(interpreter.Operands.pop()-this.operant);
        interpreter.history.push(this);
        interpreter.Afficher();

    }

    @Override
    public void undo() {
        int sum = interpreter.Operands.pop();
        interpreter.Operands.push(sum+this.operant);
        interpreter.Operands.push(this.operant);
        interpreter.history.pop();
    }
}


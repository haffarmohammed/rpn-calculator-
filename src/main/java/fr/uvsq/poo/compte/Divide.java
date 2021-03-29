package fr.uvsq.poo.compte;

public class Divide extends Command{

    Interpreter interpreter;

    public Divide(Interpreter interpreter) {
        this.interpreter = interpreter;
    }
    @Override
    public void apply() {
        this.operant=interpreter.Operands.pop();
        interpreter.Operands.push(interpreter.Operands.pop()/this.operant);
        interpreter.history.push(this);
        interpreter.Afficher();
    }

    @Override
    public void undo() {
        int rst = interpreter.Operands.pop();
        interpreter.Operands.push(rst*this.operant);
        interpreter.Operands.push(this.operant);
        interpreter.history.pop();
    }
}

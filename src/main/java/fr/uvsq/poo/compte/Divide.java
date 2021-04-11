package fr.uvsq.poo.compte;

public class Divide extends Command{
    Interpreter interpreter;

    public Divide(Interpreter interpreter){
        this.interpreter = interpreter;
    }

    @Override
    public void apply() {
        this.operand = interpreter.operands.pop();
        interpreter.operands.push(interpreter.operands.pop() / this.operand);
        interpreter.history.push(this);
        interpreter.afficher();
    }

    @Override
    public void undo() {
        int quot = interpreter.operands.pop();
        interpreter.operands.push(quot * this.operand);
        interpreter.operands.push(this.operand);
        interpreter.history.pop();
    }
}

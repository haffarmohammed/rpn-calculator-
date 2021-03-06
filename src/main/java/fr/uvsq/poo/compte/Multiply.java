package fr.uvsq.poo.compte;

public class Multiply extends Command{
    Interpreter interpreter;

    public Multiply(Interpreter interpreter){
        this.interpreter = interpreter;
    }

    @Override
    public void apply() {
        this.operand = interpreter.operands.pop();
        interpreter.operands.push(this.operand * interpreter.operands.pop());
        interpreter.history.push(this);
        interpreter.afficher();
    }

    @Override
    public void undo() {
        int prod = interpreter.operands.pop();
        interpreter.operands.push(prod / this.operand);
        interpreter.operands.push(this.operand);
        interpreter.history.pop();
    }
}

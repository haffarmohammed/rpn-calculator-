package fr.uvsq.poo.compte;

public class Subtract extends Command{
    Interpreter interpreter;

    public Subtract(Interpreter interpreter){
        this.interpreter = interpreter;
    }

    @Override
    public void apply() {
        this.operand = interpreter.operands.pop();
        interpreter.operands.push( interpreter.operands.pop() - this.operand);
        interpreter.history.push(this);
        interpreter.afficher();
    }

    @Override
    public void undo() {
        int dif = interpreter.operands.pop();
        interpreter.operands.push(dif + this.operand);
        interpreter.operands.push(this.operand);
        interpreter.history.pop();
    }
}

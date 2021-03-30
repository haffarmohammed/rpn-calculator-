package fr.uvsq.poo.compte;

public class Div extends Command{
    Interpreter interpreter;

    public Div(Interpreter interpreter){
        this.interpreter = interpreter;
    }

    @Override
    public void execute() {
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

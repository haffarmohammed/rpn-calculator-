package fr.uvsq.poo.compte;

public class Add extends Command{
    Interpreter interpreter;

    public Add(Interpreter interpreter){
        this.interpreter = interpreter;
    }

    @Override
    public void apply() {
        this.operand = interpreter.operands.pop();
        interpreter.operands.push( this.operand + interpreter.operands.pop());
        interpreter.history.push(this);
        interpreter.afficher();
    }

    @Override
    public void undo() {
        int sum = interpreter.operands.pop();
        interpreter.operands.push(sum - this.operand);
        interpreter.operands.push(this.operand);
        interpreter.history.pop();
    }
}

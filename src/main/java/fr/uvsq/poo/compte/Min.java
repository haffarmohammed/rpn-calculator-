package fr.uvsq.poo.compte;

public class Min extends Command{
    Interpreter interpreter;

    public Min(Interpreter interpreter){
        this.interpreter = interpreter;
    }

    @Override
    public void execute() {
        this.operand = interpreter.operands.pop();
        interpreter.operands.push( interpreter.operands.pop() - this.operand);
        interpreter.history.push(this);
        interpreter.afficher();
    }

    @Override
    public void undo() {
        int dif = interpreter.operands.pop();
        System.out.println(dif);
        System.out.println(this.operand);
        interpreter.operands.push(dif + this.operand);
        interpreter.operands.push(this.operand);
        interpreter.history.pop();
    }
}

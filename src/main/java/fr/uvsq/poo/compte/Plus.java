package fr.uvsq.poo.compte;

public class Plus extends Command{
    Interpreter interpreter;

    public Plus(Interpreter interpreter){
        this.interpreter = interpreter;
    }

    @Override
    public void execute() {
        this.operand = interpreter.operands.pop();
        interpreter.operands.push( this.operand + interpreter.operands.pop());
        interpreter.history.push(this);
        interpreter.afficher();
    }

    @Override
    public void undo() {
        int som = interpreter.operands.pop();
        interpreter.operands.push(som - this.operand);
        interpreter.operands.push(this.operand);
        interpreter.history.pop();
    }
}

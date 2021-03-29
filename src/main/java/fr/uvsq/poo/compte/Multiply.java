package fr.uvsq.poo.compte;

public class Multiply extends Command {

    Interpreter interpreter;

    public Multiply(Interpreter interpreter) {
        this.interpreter = interpreter;
    }

    @Override
    public void apply() {
        this.operant=interpreter.Operands.pop();
        interpreter.Operands.push(this.operant*interpreter.Operands.pop());
        interpreter.history.push(this);
        interpreter.Afficher();

    }

    @Override
    public void undo() {
        int rst = interpreter.Operands.pop();
        interpreter.Operands.push(rst/this.operant);
        interpreter.Operands.push(this.operant);
        interpreter.history.pop();

    }
}

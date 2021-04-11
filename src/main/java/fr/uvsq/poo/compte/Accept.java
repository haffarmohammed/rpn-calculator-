package fr.uvsq.poo.compte;

public class Accept extends Command{
    Interpreter interpreter;

    public Accept(Interpreter interpreter) {
        this.interpreter = interpreter;
    }

    @Override
    public void apply() {
        interpreter.history.push(this);
        interpreter.Operands.push(interpreter.numEnter);
    }

    @Override
    public void undo() {
        interpreter.Operands.pop();
        interpreter.history.pop();

    }
}

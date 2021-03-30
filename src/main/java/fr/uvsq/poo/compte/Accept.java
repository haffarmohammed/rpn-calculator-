package fr.uvsq.poo.compte;

public class Accept extends Command{

    Interpreter interpreter;

    public Accept(Interpreter interpreter){
        this.interpreter = interpreter;
    }

    @Override
    public void execute() {
        interpreter.operands.push(interpreter.numEnter);
        interpreter.history.push(this);
    }

    @Override
    public void undo() {
        interpreter.operands.pop();
        interpreter.history.pop();
    }
}

package fr.uvsq.poo.compte;

public class Min extends Command{
    Interpreter interpreter;

    public Min(Interpreter interpreter){
        this.interpreter = interpreter;
    }

    @Override
    public void execute() {
        int op = interpreter.operands.pop();
        interpreter.operands.push( interpreter.operands.pop() - op);
        interpreter.afficher();
    }

    @Override
    public void undo() {

    }
}

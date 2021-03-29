package fr.uvsq.poo.compte;

public class Div extends Command{
    Interpreter interpreter;

    public Div(Interpreter interpreter){
        this.interpreter = interpreter;
    }

    @Override
    public void execute() {
        int op = interpreter.operands.pop();
        interpreter.operands.push(interpreter.operands.pop() / op);
        interpreter.afficher();
    }

    @Override
    public void undo() {

    }
}

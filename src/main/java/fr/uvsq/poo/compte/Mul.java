package fr.uvsq.poo.compte;

public class Mul extends Command{
    Interpreter interpreter;

    public Mul(Interpreter interpreter){
        this.interpreter = interpreter;
    }

    @Override
    public void execute() {
        interpreter.operands.push(interpreter.operands.pop() * interpreter.operands.pop());
        interpreter.afficher();
    }

    @Override
    public void undo() {

    }
}

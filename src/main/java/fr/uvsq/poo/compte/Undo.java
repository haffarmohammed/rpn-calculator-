package fr.uvsq.poo.compte;

import java.util.Stack;

public class Undo  extends Command{
    protected Stack<Command> history;

    public Undo(Stack<Command> history) {
        this.history = history;
    }

    @Override
    public void execute() {
        ((Command)history.firstElement()).undo();
    }

    @Override
    public void undo() {

    }

    @Override
    public Command clone() {
        return this;
    }
}

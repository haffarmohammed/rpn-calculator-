package fr.uvsq.poo.compte;

import java.util.Stack;

public class Undo  extends Command{
    protected Stack<Command> history;

    public Undo(Stack<Command> history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (history.empty()) System.out.println("There is no previous operation");
        else ((Command)history.firstElement()).undo();
    }

    @Override
    public void undo() {

    }
}

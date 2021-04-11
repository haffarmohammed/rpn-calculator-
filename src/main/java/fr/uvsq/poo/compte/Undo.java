package fr.uvsq.poo.compte;

import java.util.Stack;

public class Undo  extends Command{
    protected Stack<Command> history;

    public Undo(Stack<Command> history) {
        this.history = history;
    }

    @Override
    public void apply() {
        if (history.empty()) System.out.println("There is no previous operation");
        else history.lastElement().undo();
    }

    @Override
    public void undo() {

    }
}

package fr.uvsq.poo.compte;

public abstract class Command{
    int operand;
    public abstract void execute();
    public abstract void undo();
}

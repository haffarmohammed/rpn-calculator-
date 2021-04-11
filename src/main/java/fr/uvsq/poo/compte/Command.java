package fr.uvsq.poo.compte;

public abstract class Command{
    int operand;
    public abstract void apply();
    public abstract void undo();
}

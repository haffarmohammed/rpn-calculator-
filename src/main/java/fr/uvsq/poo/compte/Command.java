package fr.uvsq.poo.compte;

public abstract class Command implements Cloneable{
    public abstract void execute();
    public abstract void undo();
    public abstract Command clone();
}

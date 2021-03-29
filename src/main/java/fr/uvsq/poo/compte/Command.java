package fr.uvsq.poo.compte;


abstract class Command implements Cloneable {
    public abstract void apply();
    public abstract void undo();
    //public abstract Command clone();
}

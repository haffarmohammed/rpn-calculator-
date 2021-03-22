package fr.uvsq.poo.compte;

@FunctionalInterface
public interface Command {
    public void apply();
}

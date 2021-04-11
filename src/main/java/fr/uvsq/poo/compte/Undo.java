package fr.uvsq.poo.compte;

import java.util.Stack;

class Undo extends Command {
    protected Stack <Command> Historique;

    public Undo(Stack historique) {
        Historique = historique;
    }



    public void apply() {
        if (Historique.empty()){
            System.out.printf("There is no commands\n");
        }
        else{
            Historique.lastElement().undo();
        }
    }

    public void undo() { }

}

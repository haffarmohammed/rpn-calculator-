package fr.uvsq.poo.compte;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommandTest {

    @Test
    public void testQuit(){
        Interpreter i = Interpreter.init();
        System.out.println("waiting for finishing");
        i.executeCommand("quit");
    }

}
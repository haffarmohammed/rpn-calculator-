package fr.uvsq.poo.compte;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class CommandTest {
    Calculator calculator = new Calculator();
    InputStream sysInBackup = System.in; // backup System.in to restore it later

    @Test
    public void testUndo(){
        ByteArrayInputStream in = new ByteArrayInputStream("undo\nquit".getBytes());
        System.setIn(in);
        calculator.session();
    }

    @Test
    public void testQuit(){
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("quit".getBytes());
        System.setIn(in);
        calculator.session();
    }

}
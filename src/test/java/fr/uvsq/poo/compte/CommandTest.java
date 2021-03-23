package fr.uvsq.poo.compte;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class CommandTest {

    @Test
    public void testUndo(){

    }

    @Test
    public void testQuit(){
        Calculator calculator = new Calculator();
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("quit".getBytes());
        System.setIn(in);
        calculator.session();
    }

}
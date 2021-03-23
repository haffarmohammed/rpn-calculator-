package fr.uvsq.poo.compte;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.Assert.*;

public class CommandTest {

    @Test
    public void testUndo(){
        Calculator calculator = new Calculator();
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("quit".getBytes());
        System.setIn(in);
        calculator.session();

    }

    @Test
    public void testQuit(){

    }

}
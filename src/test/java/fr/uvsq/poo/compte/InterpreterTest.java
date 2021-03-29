package fr.uvsq.poo.compte;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class InterpreterTest {


    MoteurRPN moteurRPN = new MoteurRPN();
    InputStream inputStream = System.in;

    @Test
    public void UndoTest(){
        ByteArrayInputStream Stream = new ByteArrayInputStream("Undo".getBytes());
        System.setIn(Stream);
        moteurRPN.session();
    }

    @Test
    public void QuitTest(){
        ByteArrayInputStream Stream = new ByteArrayInputStream("Quit".getBytes());
        System.setIn(Stream);
        moteurRPN.session();
    }


}

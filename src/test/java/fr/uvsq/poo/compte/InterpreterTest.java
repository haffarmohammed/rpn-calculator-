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

    @Test
    public void NumberTest(){
        ByteArrayInputStream Stream = new ByteArrayInputStream("5\n6\nQuit".getBytes());
        System.setIn(Stream);
        moteurRPN.session();
    }

    @Test
    public void AddTest(){
        ByteArrayInputStream Stream = new ByteArrayInputStream("5\n6\n+\nQuit".getBytes());
        System.setIn(Stream);
        moteurRPN.session();
    }

    @Test
    public void SubtractTest(){
        ByteArrayInputStream Stream = new ByteArrayInputStream("5\n6\n-\nQuit".getBytes());
        System.setIn(Stream);
        moteurRPN.session();
    }

    @Test
    public void MultiplyTest(){
        ByteArrayInputStream Stream = new ByteArrayInputStream("5\n6\n*\nQuit".getBytes());
        System.setIn(Stream);
        moteurRPN.session();
    }

    @Test
    public void DivideTest(){
        ByteArrayInputStream Stream = new ByteArrayInputStream("30\n6\n/\nQuit".getBytes());
        System.setIn(Stream);
        moteurRPN.session();
    }

    @Test
    public void UndoAddTest(){
        ByteArrayInputStream Stream = new ByteArrayInputStream("30\n6\n+\nUndo\nUndo\nQuit".getBytes());
        System.setIn(Stream);
        moteurRPN.session();
    }

    @Test
    public void UndoSubtractTest(){
        ByteArrayInputStream Stream = new ByteArrayInputStream("30\n6\n-\nUndo\nUndo\nQuit".getBytes());
        System.setIn(Stream);
        moteurRPN.session();
    }

    @Test
    public void UndoDivideTest(){
        ByteArrayInputStream Stream = new ByteArrayInputStream("30\n6\n/\nUndo\nUndo\nQuit".getBytes());
        System.setIn(Stream);
        moteurRPN.session();
    }

    @Test
    public void UndoMultiplyTest(){
        ByteArrayInputStream Stream = new ByteArrayInputStream("5\n6\n*\nUndo\nUndo\nQuit".getBytes());
        System.setIn(Stream);
        moteurRPN.session();
    }

    @Test
    public void UndoAcceptTest(){
        ByteArrayInputStream Stream = new ByteArrayInputStream("5\nUndo\nUndo\nQuit".getBytes());
        System.setIn(Stream);
        moteurRPN.session();
    }

}

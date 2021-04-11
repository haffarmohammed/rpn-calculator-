package fr.uvsq.poo.compte;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Stack;

public class InterpreterTest {


    MoteurRPN moteurRPN = new MoteurRPN();
    // InputStream inputStream = System.in;
    Stack<Integer> Oper = new Stack<>();
    Stack<Command> Com = new Stack<>();

    @Test
    public void UndoTest(){
        System.setIn(new ByteArrayInputStream("5\nUndo\nQuit".getBytes()));
        moteurRPN.session();
        Assert.assertTrue(moteurRPN.Operands.isEmpty());

    }

    @Test
    public void QuitTest(){
        //  ByteArrayInputStream Stream = new ByteArrayInputStream("Quit".getBytes());
        System.setIn(new ByteArrayInputStream("Quit".getBytes()));
        moteurRPN.session();
    }

    @Test
    public void NumberTest(){
        // ByteArrayInputStream Stream = new ByteArrayInputStream("5\n6\nQuit".getBytes());
        System.setIn(new ByteArrayInputStream("5\n6\nQuit".getBytes()));
        Oper.push(5);   Oper.push(6);
        moteurRPN.session();
        Assert.assertEquals(Oper, moteurRPN.Operands);
    }

    @Test
    public void AddTest(){
        //ByteArrayInputStream Stream = new ByteArrayInputStream("5\n6\n+\nQuit".getBytes());
        System.setIn(new ByteArrayInputStream("5\n6\n+\nQuit".getBytes()));
        moteurRPN.session();
        Oper.push (11);
        Assert.assertEquals(Oper, moteurRPN.Operands);

    }

    @Test
    public void SubtractTest(){
        //ByteArrayInputStream Stream = new ByteArrayInputStream("5\n6\n-\nQuit".getBytes());
        System.setIn(new ByteArrayInputStream("5\n6\n-\nQuit".getBytes()));
        moteurRPN.session();
        Oper.push(-1);
        Assert.assertEquals(Oper, moteurRPN.Operands);
    }

    @Test
    public void MultiplyTest(){
        //ByteArrayInputStream Stream = new ByteArrayInputStream("5\n6\n*\nQuit".getBytes());
        System.setIn(new ByteArrayInputStream("5\n6\n*\nQuit".getBytes()));
        moteurRPN.session();
        Oper.push(30);
        Assert.assertEquals(Oper, moteurRPN.Operands);
    }

    @Test
    public void DivideTest(){
        // ByteArrayInputStream Stream = new ByteArrayInputStream("30\n6\n/\nQuit".getBytes());
        System.setIn(new ByteArrayInputStream("30\n6\n/\nQuit".getBytes()));
        moteurRPN.session();
        Oper.push(5);
        Assert.assertEquals(Oper, moteurRPN.Operands);
    }

    @Test
    public void UndoAddTest(){
        //ByteArrayInputStream Stream = new ByteArrayInputStream("30\n6\n+\nUndo\nUndo\nQuit".getBytes());
        System.setIn(new ByteArrayInputStream("30\n6\n+\nUndo\nQuit".getBytes()));
        moteurRPN.session();
        Oper.push(30);  Oper.push(6);
        Assert.assertEquals(Oper, moteurRPN.Operands);
    }

    @Test
    public void UndoSubtractTest(){
        //ByteArrayInputStream Stream = new ByteArrayInputStream("30\n6\n-\nUndo\nUndo\nQuit".getBytes());
        System.setIn(new ByteArrayInputStream("30\n6\n-\nUndo\nQuit".getBytes()));
        moteurRPN.session();
        Oper.push(30);  Oper.push(6);
        Assert.assertEquals(Oper, moteurRPN.Operands);
    }

    @Test
    public void UndoDivideTest(){
        //ByteArrayInputStream Stream = new ByteArrayInputStream("30\n6\n/\nUndo\nUndo\nQuit".getBytes());
        System.setIn(new ByteArrayInputStream("30\n6\n/\nUndo\nQuit".getBytes()));
        moteurRPN.session();
        Oper.push(30);  Oper.push(6);
        Assert.assertEquals(Oper, moteurRPN.Operands);
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

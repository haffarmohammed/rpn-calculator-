package fr.uvsq.poo.compte;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.util.Stack;

public class CommandTest {
    MoteurRPN moteurRPN = new MoteurRPN();
    Stack<Integer> O = new Stack<>();
    Stack<Command> C = new Stack<>();


    @Test
    public void testEnteringNumber(){
        System.setIn(new ByteArrayInputStream("5\n6\nquit".getBytes()));
        moteurRPN.session();
        O.push(5);O.push(6);
        Assert.assertEquals(O, moteurRPN.operands);
    }

    @Test
    public void testUndoEnteringNumber(){
        System.setIn(new ByteArrayInputStream("5\n6\nundo\nundo\nundo\nquit".getBytes()));
        moteurRPN.session();
        Assert.assertTrue(moteurRPN.operands.isEmpty());
        Assert.assertTrue(moteurRPN.history.isEmpty());
    }

    @Test
    public void testUndo(){
        ByteArrayInputStream in = new ByteArrayInputStream("undo\nquit".getBytes());
        System.setIn(in);
        moteurRPN.session();
    }

    @Test
    public void testQuit(){
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("quit".getBytes());
        System.setIn(in);
        moteurRPN.session();
    }

    @Test
    public void testAddNumbers(){
        ByteArrayInputStream in = new ByteArrayInputStream("5\n6\n+\nquit".getBytes());
        System.setIn(in);
        moteurRPN.session();
    }

    @Test
    public void testMinusNumbers(){
        ByteArrayInputStream in = new ByteArrayInputStream("8\n4\n-\nquit".getBytes());
        System.setIn(in);
        moteurRPN.session();
    }

    @Test
    public void testMulNumbers(){
        ByteArrayInputStream in = new ByteArrayInputStream("8\n4\n*\nquit".getBytes());
        System.setIn(in);
        moteurRPN.session();
    }

    @Test
    public void testDivNumbers(){
        ByteArrayInputStream in = new ByteArrayInputStream("8\n4\n/\nquit".getBytes());
        System.setIn(in);
        moteurRPN.session();
    }

    @Test
    public void testUndoAddNumbers(){
        ByteArrayInputStream in = new ByteArrayInputStream("5\n6\n+\nundo\nundo\nquit".getBytes());
        System.setIn(in);
        moteurRPN.session();
    }

    @Test
    public void testUndoMinusNumbers(){
        ByteArrayInputStream in = new ByteArrayInputStream("5\n6\n*\nundo\nundo\nquit".getBytes());
        System.setIn(in);
        moteurRPN.session();
    }

    @Test
    public void testUndoMulNumbers(){
        ByteArrayInputStream in = new ByteArrayInputStream("5\n6\n-\nundo\nundo\nquit".getBytes());
        System.setIn(in);
        moteurRPN.session();
    }

    @Test
    public void testUndoDivNumbers(){
        ByteArrayInputStream in = new ByteArrayInputStream("30\n6\n/\nundo\nundo\nquit".getBytes());
        System.setIn(in);
        moteurRPN.session();
    }

}
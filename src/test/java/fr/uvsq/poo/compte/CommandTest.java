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
        System.setIn(new ByteArrayInputStream("undo\nquit".getBytes()));
        moteurRPN.session();
        Assert.assertTrue(moteurRPN.history.isEmpty());
    }

    @Test
    public void testQuit(){
        System.setIn(new ByteArrayInputStream("quit".getBytes()));
        moteurRPN.session();
    }

    @Test
    public void testAddNumbers(){
        System.setIn(new ByteArrayInputStream("5\n6\n+\nquit".getBytes()));
        moteurRPN.session();
        O.push(11);
        Assert.assertEquals(O, moteurRPN.operands);
    }

    @Test
    public void testMinusNumbers(){
        System.setIn(new ByteArrayInputStream("8\n4\n-\nquit".getBytes()));
        moteurRPN.session();
        O.push(4);
        Assert.assertEquals(O, moteurRPN.operands);
    }

    @Test
    public void testMulNumbers(){
        System.setIn(new ByteArrayInputStream("8\n4\n*\nquit".getBytes()));
        moteurRPN.session();
        O.push(32);
        Assert.assertEquals(O, moteurRPN.operands);
    }

    @Test
    public void testDivNumbers(){
        System.setIn(new ByteArrayInputStream("8\n4\n/\nquit".getBytes()));
        moteurRPN.session();
        O.push(2);
        Assert.assertEquals(O, moteurRPN.operands);
    }

    @Test
    public void testUndoAddNumbers(){
        System.setIn(new ByteArrayInputStream("5\n6\n+\nundo\nquit".getBytes()));
        moteurRPN.session();
        O.push(5);
        O.push(6);
        Assert.assertEquals(O, moteurRPN.operands);
    }

    @Test
    public void testUndoMinusNumbers(){
        System.setIn(new ByteArrayInputStream("5\n6\n*\nundo\nquit".getBytes()));
        moteurRPN.session();
        O.push(5);
        O.push(6);
        Assert.assertEquals(O, moteurRPN.operands);
    }

    @Test
    public void testUndoMulNumbers(){
        System.setIn(new ByteArrayInputStream("5\n6\n*\nundo\nquit".getBytes()));
        moteurRPN.session();
        O.push(5);
        O.push(6);
        Assert.assertEquals(O, moteurRPN.operands);
    }

    @Test
    public void testUndoDivNumbers(){
        System.setIn(new ByteArrayInputStream("30\n6\n/\nundo\nquit".getBytes()));
        moteurRPN.session();
        O.push(30);
        O.push(6);
        Assert.assertEquals(O, moteurRPN.operands);
    }

}
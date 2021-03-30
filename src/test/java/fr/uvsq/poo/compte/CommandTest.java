package fr.uvsq.poo.compte;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class CommandTest {
    MoteurRPN moteurRPN = new MoteurRPN();
    InputStream sysInBackup = System.in; // backup System.in to restore it later

    @Test
    public void testEnteringNumber(){
        ByteArrayInputStream in = new ByteArrayInputStream("5\n6\nquit".getBytes());
        System.setIn(in);
        moteurRPN.session();
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

}
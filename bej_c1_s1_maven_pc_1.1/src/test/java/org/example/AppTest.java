package org.example;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;



import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private Fibonacci fibonacci;

    @Before
    public void setUp() {
        fibonacci = new Fibonacci();
    }


    @Test
    public void negativeInput(){
        assertEquals("Invalid",fibonacci.fib(-2));
    }

    @Test
    public void zeroAsInput(){
        assertEquals("0",fibonacci.fib(0));
    }

    @Test
    public void oneAsInput(){
        assertEquals("0 1", fibonacci.fib(1));
    }

    @Test
    public void getFibResult(){
        assertEquals("0 1 1", fibonacci.fib(3));
    }

    @Test
    public void getFibResult_2(){
        assertEquals("0 1 1 2 3", fibonacci.fib(5));
    }

    @Test
    public void getFibResult_3(){
        assertEquals("0 1 1 2 3 5 8 13 21 34", fibonacci.fib(10));
    }

}



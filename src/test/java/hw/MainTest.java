package hw;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest
{

    @Test
    public void fizzBuzzTestSeven()
    {
        String[] expected7={"1","2","Fizz","4","Buzz","Fizz","7"};
        assertArrayEquals(expected7,Main.fizzBuzzArray(7) );
    }
    @Test
    public void fizzBuzzTestOne()
    {
        String[] expected1={"1"};
        assertArrayEquals(expected1,Main.fizzBuzzArray(1) );
    }
    @Test
    public void fizzBuzzTestSeventeen()
    {
        String[] expected17={"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","Fizz Buzz","16","17"};
        assertArrayEquals(expected17,Main.fizzBuzzArray(17) );
    }
    @Test
    public void fizzBuzzTestNegTen()
    {
        String[] expectedNeg10={"Your number is not a valid array length."};
        assertArrayEquals(expectedNeg10,Main.fizzBuzzArray(-10) );
    }
    @Test
    public void fizzBuzzTestNegOne()
    {
        String[] expectedNeg1={"Your number is not a valid array length."};
        assertArrayEquals(expectedNeg1,Main.fizzBuzzArray(-1) );
    }
    @Test
    public void fizzBuzzTestZero()
    {
        String[] expectedZero={"Your number is not a valid array length."};
        assertArrayEquals(expectedZero,Main.fizzBuzzArray(0) );
    }
}
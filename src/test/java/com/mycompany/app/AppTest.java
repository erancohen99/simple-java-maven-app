package com.mycompany.app;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testAppConstructor() {
        try {
            new App();
        } catch (Exception e) {
            fail("Construction failed.");
        }
    }

    @Test
    public void testAppMain()
    {
        //Variable declaration		
        String string1="Junit";					
        String string2="Junit";					
        String string3="test";					
        String string4="test";					
        String string5=null;					
        int variable1=1;					
        int	variable2=2;					
        int[] airethematicArrary1 = { 1, 2, 3 };					
        int[] airethematicArrary2 = { 1, 2, 3 };					
        		
        //Assert statements		
        assertEquals(string1,string2);					
        assertSame(string3, string4);					
        assertNotSame(string1, string3);					
        assertNotNull(string1);			
        assertNull(string5);			
        assertTrue(variable1<variable2);					
        assertArrayEquals(airethematicArrary1, airethematicArrary2);					

        		
        //Assert statements		
        assertEquals(string1,string2);
		//Assume.assumeFalse(System.getProperty("os.name").contains("Windows"));
        App.main(null);
        try {
            assertEquals("Jenkins pipe test" + System.getProperty("line.separator"), outContent.toString());
        } catch (AssertionError e) {
            fail("\"message\" is not \"Jenkins pipe test\"");
        }
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}

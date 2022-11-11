/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pwo.seq;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Kuba
 */
public class LucasGeneratorTest {
    
    

    /**
     * Test of reset method, of class LucasGenerator.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        LucasGenerator instance = new LucasGenerator();
        instance.reset();
        BigDecimal expResult = new BigDecimal(2);
        BigDecimal result = instance.nextTerm();
        assertEquals(expResult, result);
    }

    /**
     * Test of nextTerm method, of class LucasGenerator.
     */
    @Test
    public void testNextTerm() {
        System.out.println("nextTerm");
        LucasGenerator instance = new LucasGenerator();
        instance.nextTerm();
        BigDecimal expResult = new BigDecimal(1);
        BigDecimal result = instance.nextTerm();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testGetTerm() {

        System.out.println("getTerm");
        LucasGenerator instance = new LucasGenerator();
        BigDecimal expResult = new BigDecimal(123);
        BigDecimal result = instance.getTerm(10);
        assertEquals(expResult, result);

    }
    
}

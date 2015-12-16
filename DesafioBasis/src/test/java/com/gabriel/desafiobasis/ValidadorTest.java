/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabriel.desafiobasis;

import junit.framework.Test;
import junit.framework.TestCase;

/**
 *
 * @author gabrielgomes
 */
public class ValidadorTest extends TestCase {
    
    /**
     * Test of checkString method, of class Validador.
     */
    private boolean expResult;
    private boolean result;
    private String word;
    Validador check = null;
    
    public void testCheckStringValid() {
        System.out.println("checkString 1");
        word           = "((1+1)*2) + (10+2) + (((2-1)-1)*1)";
        check         = new Validador();
        this.expResult = true;
        this.result    = check.checkString(word);
        assertEquals(expResult, result);
    }
    
    public void testCheckStringValid2() {
        System.out.println("checkString 2");
        word           = "O Fulano (aquele que fez aniversário hoje) perguntou por você.";
        check         = new Validador();
        this.expResult = true;
        this.result    = check.checkString(word);
        assertEquals(expResult, result);
    }
    
    public void testCheckStringInvalid() {
        System.out.println("checkString 3 ");
        word      = "&:)";
        check    = new Validador();
        expResult = false;
        result    = check.checkString(word);
        assertEquals(expResult, result);
    }
    
    public void testCheckStringInvalid2() {
        System.out.println("checkString 4 ");
        word      = "#:)";
        check    = new Validador();
        expResult = false;
        result    = check.checkString(word);
        assertEquals(expResult, result);
    }
    
}

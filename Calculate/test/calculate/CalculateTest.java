/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculate;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {

    Calculate calculation = new Calculate();

    int sum = calculation.sum(7, 9);
    int testSum = 16;

    @Test

    public void testSum() {

        System.out.println("@Test sum(): " + sum + " = " + testSum);
        assertEquals(sum, testSum);


        System.out.println("");
        System.out.println("");
        
        //para conta de menos
        System.out.println("20 - 7 = 13 (passa se der certo)");
        assertEquals(13, 20-7);
        


    }

}


package org.example;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.*;
public class Test1 {

    @Test

    public void testCase1() {
        int a = 5;
        int b = 5;

        assertEquals(b, a, "The value is not correct");
        System.out.println("done");
    }
}
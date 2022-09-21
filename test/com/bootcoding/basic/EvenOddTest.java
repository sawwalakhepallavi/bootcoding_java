package com.bootcoding.basic;

import org.junit.Assert;
import org.junit.Test;

public class EvenOddTest {

    @Test
    public void testEven(){
        EvenOdd eo=new EvenOdd();
        boolean e = eo.isEven(10);
        Assert.assertTrue(e);

    }
}

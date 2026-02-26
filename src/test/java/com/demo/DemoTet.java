package com.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

    @Test
    public void sampleTest() {
        System.out.println("Running Test from Jenkins");
        Assert.assertTrue(true);
    }
}
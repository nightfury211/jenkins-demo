package com.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

    @Test
    public void sampleTest() {
        System.out.println("Running Test from Jenkins: POll scm");
        assertEquals(3, 1 + 1);
    }
}

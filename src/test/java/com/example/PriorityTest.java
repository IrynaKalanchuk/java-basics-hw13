package com.example;

import org.testng.annotations.Test;

public class PriorityTest {
    @Test(priority = 3)
    public void testMethod1() {
        System.out.println("testMethod1");
    }

    @Test(priority = 2)
    public void testMethod2() {
        System.out.println("testMethod2");
    }

    @Test(priority = 1)
    public void testMethod3() {
        System.out.println("testMethod3");
    }
}

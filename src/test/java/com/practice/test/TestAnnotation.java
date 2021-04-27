package com.practice.test;

import org.testng.annotations.*;

public class TestAnnotation {

    @Test
    public void testCase1(){
        System.out.println("testcase1");
    }

    @Ignore
    @Test
    public void testCase2(){
        System.out.println("testcase2");
    }

    @Test
    public void testCase3(){
        System.out.println("testcase3");
    }

    @BeforeMethod
    public void testBeforeMethod(){
        System.out.println("beforemethod");
    }

    @AfterMethod
    public void testAfterMethod(){
        System.out.println("AfterMethod");
    }

    @BeforeTest
    public void testBeforeTest(){
        System.out.println("BeforeTest");
    }

    @AfterTest
    public void testAfterTest(){
        System.out.println("AfterTest");
    }

    @BeforeClass
    public void testBeforeClass(){
        System.out.println("BeforeClass");
    }

    @AfterClass
    public void testAfterClass(){
        System.out.println("AfterClass");
    }


    @BeforeGroups
    public void testBeforeGroups(){
        System.out.println("BeforeGroups");
    }

    @AfterGroups
    public void testAfterGroups(){
        System.out.println("AfterGroups");
    }

    @BeforeSuite
    public void testBeforeSuite(){
        System.out.println("BeforeSuite");
    }

    @AfterSuite
    public void testAfterSuite(){
        System.out.println("AfterSuite");
    }
}

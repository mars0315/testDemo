package com.practice.test;

import org.testng.annotations.*;

public class TestAnnotation2 {


    @Test
    @Parameters("test1")
    public void testCase1(@Optional() String test1 ){
        System.out.println(Thread.currentThread().getId());
    }

    @Test
    @Parameters("test2")
    public void testCase2(String test2){
        System.out.println(Thread.currentThread().getId());
    }

    @Test(enabled = true)
    @Parameters("test3")
    public void testCase3(@Optional() String test3){
        System.out.println(test3);
    }

    @Test(dataProvider = "test4")
    public void testCase4(String test4){
        System.out.println(test4);
    }
    @DataProvider(name="test4")
    public Object[] dataProvider(){
        System.out.println("data provider");
        Object[] objects=new Object[]{"test1","test22","test333"};
        return objects;
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

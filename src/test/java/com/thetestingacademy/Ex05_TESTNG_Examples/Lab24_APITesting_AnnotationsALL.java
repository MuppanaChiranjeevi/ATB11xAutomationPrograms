package com.thetestingacademy.Ex05_TESTNG_Examples;
//All TestNG Annotations Sequence
//@BeforeSuite
//@AfterSuite
//@BeforeTest
//@AfterTest
//@BeforeGroups
//@AfterGroups
//@BeforeClass
//@AfterClass
//@BeforeMethod
//@AfterMethod

import org.testng.annotations.*;

public class Lab24_APITesting_AnnotationsALL {
    @BeforeSuite
    void demo1()
    {
        System.out.println("BeforeSuite");
    }

    @BeforeTest
    void demo2(){
        System.out.println("BeforeTest");
    }

    @BeforeClass
    void demo3(){
        System.out.println("BeforeClass");
    }

    @BeforeMethod
    void demo4(){
        System.out.println("BeforeMethod");
    }

    @Test
    void demo5(){
        System.out.println("Test");
    }

    @AfterMethod
    void demo6(){
        System.out.println("AfterMethod");
    }

    @AfterClass
    void demo7(){
        System.out.println("AfterClass");
    }

    @AfterTest
    void demo8(){
        System.out.println("AfterTest");
    }
    @AfterSuite
    void demo9(){
        System.out.println("AfterSuite");
    }
}

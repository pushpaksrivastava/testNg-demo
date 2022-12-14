package com.example.testNgdemo;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Test1 {

    @Test
    void login_test() {
        System.out.println("This is Login Test");
        Assert.assertEquals(1,1);
    }
}

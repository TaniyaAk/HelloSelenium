package com.testng.parametertests;

import com.taniya.tests.BasePageTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestMethodPara  {
    @Parameters("name")
    @Test
    public void parameterTestOne(String name){
        System.out.println("Hello I am awesome "+name);
    }

}

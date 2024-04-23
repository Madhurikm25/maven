package org.example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class parameterex {





    @Parameters({"Valid username","Valid password"})
    @Test

    public void login(String Username, String password)
    {

        System.out.println("username=" +Username);
        System.out.println("password=" +password);

        }


}

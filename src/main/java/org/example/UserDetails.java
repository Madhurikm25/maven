package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserDetails {

    @Test


    public void createUser()
    {

        System.out.println("user creation");
    }

    @BeforeMethod
    public void updateUSer()
    {

        System.out.println("update user");
    }

    @AfterMethod
    public void deleteUser()
    {

        System.out.println("Delete  user");
    }




}



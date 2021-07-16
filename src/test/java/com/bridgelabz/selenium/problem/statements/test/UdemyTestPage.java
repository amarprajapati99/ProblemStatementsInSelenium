package com.bridgelabz.selenium.problem.statements.test;

import com.bridgelabz.selenium.problem.statements.base.BaseClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.Registration;

public class UdemyTestPage extends BaseClass{

    @Test
    public void To_check_SignUp_Page() {

        Registration registration = new Registration ();
        registration.signUpPage ();
    }

    @Test
    public void To_Check_LoginPage_With_Valid_Credentials() throws InterruptedException {
        LoginPage loginPage = new LoginPage (driver);
        loginPage.setLoginPage ();
    }
}

package com.orangehrmlive.testsuite;


import com.orangehrmlive.pages.LoginPage;
import com.orangehrmlive.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() throws InterruptedException {
        Thread.sleep(5000);
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Dashboard";
        Assert.assertEquals(loginPage.getTextMessage(),expectedMessage,"Text not found");
    }
    @Test
    public void  userShouldNavigateToForgotPasswordPageSuccessfully() throws InterruptedException {
        Thread.sleep(5000);
        loginPage.clickOnForgotPassword();
        String expectedMessage = "Reset Password";
        Assert.assertEquals(loginPage.resetPasswordTextMessage(),expectedMessage,"Text not Found");


    }

    }







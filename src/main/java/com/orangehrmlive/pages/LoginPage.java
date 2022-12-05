package com.orangehrmlive.pages;

import com.orangehrmlive.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By userNameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button[normalize-space()='Login']");
    By displayDashboardText = By.xpath("//h6[normalize-space()='Dashboard']");
    By forgotPasswordLink = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
    By resetPassword = By.xpath("//h6[normalize-space()='Reset Password']");


    public void enterUserName(String username){
        sendTextToElement(userNameField,username);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getTextMessage(){
       return getTextFormElement(displayDashboardText);
    }
    public void clickOnForgotPassword(){
        clickOnElement(forgotPasswordLink);
    }
    public String resetPasswordTextMessage(){
        return getTextFormElement(resetPassword);
    }





}

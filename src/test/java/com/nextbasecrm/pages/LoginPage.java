package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement loginBox;

    @FindBy(css = "input[name='USER_PASSWORD']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;

    @FindBy (xpath = "//input[@type='checkbox']")
    public WebElement checkbox;

    @FindBy (xpath = "//a[@class='login-link-forgot-pass']")
    public WebElement forgotPasswordLink;

    @FindBy (xpath = "//div[.='Incorrect login or password']")
    public WebElement errorMessage;




}

package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://library1.cydeo.com/login.html
public class LoginPage {
////
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@id='inputEmail']")
    public WebElement inputEmailInput;

    @FindBy(xpath = "//*[@id='inputPassword']")
    public WebElement inputPasswordInput;

    @FindBy(xpath = "//button")
    public WebElement btnButton;

    // No page elements added


}
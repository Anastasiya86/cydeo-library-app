package com.cars.pages;

import com.cars.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//span[@class='nav-user-name'])[1]")
   public  WebElement menuDropdown;

    @FindBy (xpath = "//a[@data-linkname='header-sign-in']")
     public WebElement signIn;

    @FindBy (xpath = "(//input[@class='sds-text-field'])[1]")
    public WebElement emailInput;
    @FindBy (xpath = "(//input)[@type='password'][1]")
    public WebElement passwordInput;

    @FindBy (xpath = "(//span[@class='nav-user-name'])[1]")
    public WebElement profileName;
}

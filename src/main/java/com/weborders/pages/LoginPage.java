package com.weborders.pages;

import com.weborders.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends  BasePage {

    @FindBy(id = "ctl00_MainContent_username")
    private WebElement userNameElement;

    @FindBy(id = "ctl00_MainContent_password")
    private WebElement passwordElement;

    public void login(String userName, String password){
        wait.until(ExpectedConditions.visibilityOf(userNameElement)).sendKeys(userName);
        wait.until(ExpectedConditions.visibilityOf(passwordElement)).sendKeys(password, Keys.ENTER);
    }

    public void login(){
        String userName = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        wait.until(ExpectedConditions.visibilityOf(userNameElement)).sendKeys(userName);
        wait.until(ExpectedConditions.visibilityOf(passwordElement)).sendKeys(password, Keys.ENTER);
    }


}

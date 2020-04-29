package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.sql.XAConnection;
import javax.sql.rowset.BaseRowSet;
import javax.swing.*;

/**
 * @author:
 * @create:
 * @date:
 */
public class AbstractPageBase {
    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait  = new WebDriverWait(driver,10);

    public AbstractPageBase() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "button[id=\"signin_button\"]")
   protected WebElement sign_in_button;
    public void click_on_sign_in_button(){
        System.out.println("user click on sign in button");
        BrowserUtilities.waitForPageToLoad(20);
        wait.until(ExpectedConditions.elementToBeClickable(sign_in_button)).click();
        BrowserUtilities.wait(3);

    }
    public String getTheCurrentTitle(){
        return driver.getTitle();
    }

    public void clickOn(String title){
        BrowserUtilities.wait(3);
        String xpath = "//div[@class='span12']/div/ul/li/a[contains(text(),'"+title+"')]";
        By target_locator = By.xpath(xpath);
        wait.until(ExpectedConditions.elementToBeClickable(target_locator)).click();
        BrowserUtilities.wait(2);

    }





}

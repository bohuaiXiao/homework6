package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

/**
 * @author:
 * @create:
 * @date:
 */
public class LoginPage extends AbstractPageBase {

    @FindBy(css = "#user_login")
    private WebElement username;
    @FindBy(css = "#user_password")
    private WebElement passwords;


    public void login(){
        wait.until(ExpectedConditions.titleContains("Log in"));
        username.sendKeys(ConfigurationReader.getProperty("Username"));
        passwords.sendKeys(ConfigurationReader.getProperty("Password"), Keys.ENTER);
        BrowserUtilities.waitForPageToLoad(20);

    }

    public void login(String username){
        wait.until(ExpectedConditions.titleContains("Log in"));
        this.username.sendKeys(username);
        passwords.sendKeys(ConfigurationReader.getProperty("Password"), Keys.ENTER);
        BrowserUtilities.waitForPageToLoad(20);
    }
    @FindBy(xpath = "//h2")
    private List<WebElement> summaryType_List;

    public List<String> get_Account_summary_type(){
        return BrowserUtilities.getTextFromWebElements(summaryType_List);
    }
    @FindBy(xpath = "//h2[contains(text(),'Credit Accounts')]/following-sibling::div[1]/div/table/thead/tr/th")
    private List<WebElement> credit_account_columns;

    public List<String > get_credit_account_columns(){
        return BrowserUtilities.getTextFromWebElements(credit_account_columns)  ;
    }

    @FindBy(xpath = "//div[@class='alert alert-error']")
    private WebElement invalid_info;
    public String get_invalid_message(){
        return invalid_info.getText();
    }





}

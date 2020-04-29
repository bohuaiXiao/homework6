package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * @author:
 * @create:
 * @date:
 */
public class AccountActivity extends AbstractPageBase {

    @FindBy(css = "#aa_accountId")
    private WebElement dropDown_List;
    Select select = new Select(dropDown_List);

    public String getDefault_option(){
        return select.getFirstSelectedOption().getText();
    }

    public List<String> get_dropdown_options(){
        List<WebElement> options = select.getOptions();
        return BrowserUtilities.getTextFromWebElements(options);

    }
    @FindBy(xpath = "//table[@class=\"table table-condensed table-hover\"]/thead/tr/th")
    List<WebElement> transactions_tableList;
    public List<String > get_transactions_tabList(){
        return BrowserUtilities.getTextFromWebElements(transactions_tableList   );
    }

    @FindBy(css = "#user_login")
    private WebElement username;
    @FindBy(css = "#user_password")
    private WebElement passwords;
    public void login(String name, String password){
        wait.until(ExpectedConditions.titleContains("Log in"));
        username.sendKeys(name);
        passwords.sendKeys(password);
        BrowserUtilities.waitForPageToLoad(20);

    }





}

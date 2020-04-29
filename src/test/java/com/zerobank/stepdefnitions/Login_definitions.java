package com.zerobank.stepdefnitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.net.URL;
import java.util.Arrays;
import java.util.List;

/**
 * @author:
 * @create:
 * @date:
 */
public class Login_definitions {
    LoginPage loginPage = new LoginPage();

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        System.out.println("user is on the login page");
        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);
    }
    @Then("user click on sign in button")
    public void user_click_on_sign_in_button() {
        loginPage.click_on_sign_in_button();
    }


    @Then("user login as authorized user")
    public void user_login_as_authorized_user() {
       loginPage.login();
       BrowserUtilities.wait(3);
    }
    @Then("account summary page title should be {string}")
    public void account_summary_page_title_should_be(String string) {
        String actual_title = loginPage.getTheCurrentTitle();
        System.out.println("actual_title = " + actual_title);
        Assert.assertEquals(string,actual_title);
    }

    @Then("account summary page should have follow types:")
    public void account_summary_page_should_have_follow_types(List<String> dataTable) {
       List<String> actual_summary = loginPage.get_Account_summary_type();
       Assert.assertEquals(dataTable,actual_summary);
    }

    @Then("Credit Accounts table should have follow columns:")
    public void credit_Accounts_table_should_have_follow_columns(List<String> dataTable) {
        List<String > actual_column_of_credit_account = loginPage.get_credit_account_columns();
        Assert.assertEquals(dataTable,actual_column_of_credit_account);

    }

    @When("user login with {string} username or password")
    public void user_login_with_username_or_password(String string) {
        loginPage.click_on_sign_in_button();
        System.out.println("user invalid wrong user name");
        loginPage.login(string);
        BrowserUtilities.wait(2);
    }

    @Then("error message {string} should be displayed")
    public void error_message_should_be_displayed(String string) {
        String actual_message = loginPage.get_invalid_message();
        Assert.assertEquals(string,actual_message);
    }

}

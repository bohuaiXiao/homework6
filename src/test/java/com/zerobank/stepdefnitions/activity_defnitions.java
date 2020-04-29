package com.zerobank.stepdefnitions;

import com.zerobank.pages.AccountActivity;
import io.cucumber.java.en.Then;
import org.junit.Assert;

/**
 * @author:
 * @create:
 * @date:
 */
public class activity_defnitions {
    AccountActivity accountActivity = new AccountActivity();




    @Then("user click on the {string}")
    public void user_click_on_the(String string) {
        accountActivity.clickOn(string);
    }

    @Then("Account Activity page should have the title {string}")
    public void account_Activity_page_should_have_the_title(String string) {
        Assert.assertEquals(string,accountActivity.getTheCurrentTitle());
    }

    @Then("Account drop down default option should be {string}")
    public void account_drop_down_default_option_should_be(String string) {
        String default_option = accountActivity.getDefault_option();
        Assert.assertEquals(string,default_option);
    }

    @Then("Account drop down should have the following options:")
    public void account_drop_down_should_have_the_following_options(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }

    @Then("Transactions table should have column names :")
    public void transactions_table_should_have_column_names(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }

}

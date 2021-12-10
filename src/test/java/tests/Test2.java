package tests;

import cart_po.Cart_PO;
import common.Base_Test;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import home_po.Home_PO;
import org.junit.Assert;
import products_po.Product_PO;
import products_po.SearchResults_PO;

public class Test2 extends Base_Test {
    Home_PO hp = new Home_PO();
    Product_PO pro = new Product_PO();

    @Given("^an open browser in home page$")
    public void an_open_browser_in_home_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        hp.open();
    }

    @Then("^verify that every product price has \\$ symbol before amount$")
    public void verify_that_every_product_price_has_$_symbol_before_amount() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(pro.validationSymbol());
    }
}

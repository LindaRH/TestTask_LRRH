package tests;

import cart_po.Cart_PO;
import common.Base_Test;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import home_po.Home_PO;
import login_po.Login_PO;
import org.junit.Assert;

public class Test extends Base_Test {
    Home_PO hp = new Home_PO();
    Cart_PO cart = new Cart_PO();
    Login_PO login = new Login_PO();
    @Given("^An open browser in home page$")
    public void an_open_browser_in_home_page() throws Throwable {
        hp.open();
    }

    @Then("^Add an item add to cart$")
    public void add_an_item_add_to_cart() throws Throwable {
        hp.addProduct();

    }

    @When("^Open the cart$")
    public void open_the_cart() throws Throwable {
        cart.openCartFromProduct();
    }

    @When("^Verify the subtotal value is present$")
    public void verify_the_subtotal_value_is_present() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals("$25.49",cart.verifySubtotal());
    }

    @Then("^Change item quantity to three$")
    public void change_item_quantity_to_three() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        cart.modifyQuantity("3");

    }

    @Then("^Verify subtotal value is multiplied by three$")
    public void verify_subtotal_value_is_multiplied_by_three() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals("$76.47",cart.verifySubtotal());
    }

    @Then("^Log in as existing user$")
    public void log_in_as_existing_user() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(login.login("lprubarod@gmail.com","prueba12345"));
    }

    @Then("^Verify carts of anonymous and logged in user are merged$")
    public void verify_carts_of_anonymous_and_logged_in_user_are_merged() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals("$76.47",cart.verifySubtotal());
    }

}

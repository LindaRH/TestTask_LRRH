package tests;

import cart_po.Cart_PO;
import common.Base_Test;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import home_po.Home_PO;
import products_po.SearchResults_PO;

public class Test3 extends Base_Test {
    Home_PO hp = new Home_PO();
    SearchResults_PO sr = new SearchResults_PO();
    Cart_PO crt = new Cart_PO();

    @Given("^open browser in home page$")
    public void open_browser_in_home_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        hp.open();
    }

    @Then("^find a product by search ([^\"]*)$")
    public void find_a_product_by_search(String variable) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        hp.search(variable);
        sr.sizeResults(1).result(0,variable);
    }

    @Then("^add to cart$")
    public void add_to_cart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        sr.addToCart();
        crt.openCartFromProduct();
    }

    @Then("^verify product is in cart ([^\"]*)$")
    public void verify_product_is_in_cart(String title) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        crt.verifyProduct(title);
    }


}

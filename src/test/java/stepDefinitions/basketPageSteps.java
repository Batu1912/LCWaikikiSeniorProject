package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.basketPage;
import util.DriverFactory;

public class basketPageSteps {

    basketPage basketPage = new basketPage(DriverFactory.getDriver());

    @Then("check product size {string}")
    public void checkProductSize(String productSize) {
        basketPage.checkProductSize(productSize);
    }

    @Then("check product name {string}")
    public void checkProductName(String productName) {
        basketPage.checkProductName(productName);
    }

    @Then("check product number {string}")
    public void checkProductNumber(String productNumber) {
        basketPage.checkProductNumber(productNumber);
    }


    @Then("click purchase button")
    public void clickPurchaseButton() {
        basketPage.clickPurchaseButton();

    }


    @Then("check purchasing page {string}")
    public void checkPurchasingPage(String price) {
        basketPage.checkPurchaseButton(price);
    }
}

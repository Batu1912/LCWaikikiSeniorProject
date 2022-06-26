package stepDefinitions;

import io.cucumber.java.en.When;
import pages.productPage;
import util.DriverFactory;



public class productPageSteps {
    productPage productPage = new productPage(DriverFactory.getDriver());

    @When("click {string} when hover the {string} category, select {string} color and click product")
    public void clickWhenHoverTheCategorySelectColorAndClickProduct(String kadin, String bluz, String siyah){
        productPage.selectCategory();
        productPage.clickAndTypeColorBox();
        productPage.clickFirstProduct();

    }


    @When("after select {string} size, add product to basket and go to basket")
    public void afterSelectSizeAddProductToBasketAndGoToBasket(String size) {
        productPage.clickMediumSize();
        productPage.addToBasketAndGoToBasket();
    }
}

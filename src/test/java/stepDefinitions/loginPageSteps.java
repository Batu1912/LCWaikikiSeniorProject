package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;
import util.DriverFactory;

public class loginPageSteps {

    loginPage loginPage = new loginPage(DriverFactory.getDriver());

    @Then("check Login Page")
    public void checkLoginPage() {
        loginPage.checkLoginPage();
    }

    @When("click Login Button")
    public void clickLoginButton() {
        loginPage.typeEmailAndPassword();
    }


}

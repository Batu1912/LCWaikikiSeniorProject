package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;
import util.DriverFactory;

public class homePageSteps {

    homePage homePage = new homePage(DriverFactory.getDriver());

    @Given("Batu is on Home Page")
    public void batuIsOnHomePage(){
        homePage.checkHomePageLogo();
    }

    @When("click {string} card in the top right")
    public void clickCardInTheTopRight(String login) {
        homePage.clickHomePageLoginButton(login);
    }



}

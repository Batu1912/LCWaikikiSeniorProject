package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.ElementHelper;
import java.util.logging.LogManager;
import java.util.logging.Logger;



public class homePage {

    By logo = By.cssSelector("a.main-header-logo");
    By hpLoginButton = By.id("user_1_");  //Home page login button


    Logger logger;
    WebDriver driver;
    ElementHelper helper;

    public homePage(WebDriver driver){

        this.driver = driver;
        this.helper = new ElementHelper(driver);
        String mainLogo = new String();
        this.logger = LogManager.getLogManager().getLogger(mainLogo);
    }

    public void checkHomePageLogo(){
        helper.checkElementVisible(logo);
        logger.info("Ana sayfa acildi.");

    }

    public void clickHomePageLoginButton(String login) {
        helper.click(hpLoginButton);
    }




}

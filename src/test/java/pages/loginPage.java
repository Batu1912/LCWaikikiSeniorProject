package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class loginPage {
    By emailBox = By.cssSelector("[name='email']");
    By passBox = By.cssSelector("[name='password']");
    By loginButton = By.cssSelector(".login-form__button.login-form__button--bg-blue");

    WebDriver driver;
    WebDriverWait wait;
    ElementHelper helper;

    public loginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.helper = new ElementHelper(driver);
    }

    public void checkLoginPage(){
        helper.checkElementVisible(loginButton);
    }

    public void typeEmailAndPassword(){
        helper.click(emailBox);
        helper.sendKey(emailBox,"batuhanaci@hotmail.com");
        helper.click(passBox);
        helper.sendKey(passBox,"lctest2022");
        helper.click(loginButton);
    }
}

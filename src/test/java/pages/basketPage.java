package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;
import java.util.logging.Logger;

public class basketPage {

    By productName = By.cssSelector(".rd-cart-item-title");
    By size = By.cssSelector(".rd-cart-item-size");
    By productNumber = By.xpath("//span[contains(text(), 'Sepetim (1 Ürün)')]");
    By purchaseButton = By.cssSelector(".col-md-12.pl-20.pr-20 .main-button.mb-10");
    By addressButton = By.cssSelector(".closeButtonSpan");
    By productPrice = By.cssSelector(".rd-cart-item-price.mb-15");



    WebDriver driver;
    WebDriverWait wait;
    ElementHelper helper;
    Logger logger;

    public basketPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.helper = new ElementHelper(driver);
    }

    public void checkProductName(String name){
        String pname =helper.getText(productName);
        System.out.println(pname);
        helper.checkElementWithText(productName,name);

    }

    public void checkProductSize(String productSize) {
        String psize=helper.getText(size);
        System.out.println(psize);
        helper.checkElementWithText(size, productSize);

    }

    public void checkProductNumber(String number){
        String pnumb=helper.getText(productNumber);
        System.out.println(pnumb);
        helper.checkElementWithText(productNumber, number);

    }

    public void clickPurchaseButton(){
        helper.findElement(purchaseButton).click();

    }

    public void checkPurchaseButton(String price){
        helper.click(addressButton);
        String totalp=helper.getText(productPrice);
        logger.info(totalp);
        helper.checkElementWithText(productPrice,price);


    }

}

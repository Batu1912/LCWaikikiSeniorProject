package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;


public class productPage {

    By womenItem = By.cssSelector(".menu-nav__lists [href='https://www.lcwaikiki.com/tr-TR/TR/lp/32-33-kadin']");
    By productBlouse = By.xpath("(//a[text()='Bluz'])[1]");
    By colorFilter = By.cssSelector(".collapsible-filter-container__content-area.collapsible-filter-container__content-area--color-filter");
    By searchColorBox = By.cssSelector("input[placeholder='Renk Ara']");
    By blackColor = By.cssSelector("[src='http://akstatic.lcwaikiki.com/Resource/Images/icon/siyah.png']");
    By firstProduct = By.xpath("//div[@class='product-grid']/div[@class='product-card product-card--one-of-4'][1]");
    By productSize = By.cssSelector("a[size='M']");
    By addToBasketButton = By.id("pd_add_to_cart");
    By basketCard = By.id("shopping-cart");
    By cookiesButton = By.xpath("//button[contains(text(),'ANLADIM')]");

    WebDriver driver;
    WebDriverWait wait;
    ElementHelper helper;


    public productPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.helper = new ElementHelper(driver);
    }

    public void selectCategory(){
        helper.click(cookiesButton);
        helper.hoverWithMouse(womenItem);
        helper.click(productBlouse);

    }


    public void clickAndTypeColorBox(){
        helper.findElement(colorFilter);
        helper.click(searchColorBox);
        helper.sendKey(searchColorBox,"siyah");
        helper.click(blackColor);
    }

    public void clickFirstProduct(){
        helper.click(firstProduct);
    }

    public void clickMediumSize(){
        helper.click(productSize);

    }

    public void addToBasketAndGoToBasket(){
        helper.click(addToBasketButton);
        helper.click(basketCard);

    }


}

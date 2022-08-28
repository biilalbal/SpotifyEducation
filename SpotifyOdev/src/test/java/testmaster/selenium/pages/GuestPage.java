package testmaster.selenium.pages;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import testmaster.selenium.methods.Methods;

public class GuestPage {

    private static final Logger logger = LogManager.getLogger(Methods.class);
    Methods methods;

    public GuestPage(){

        methods = new Methods();
    }

    public void controlGuestPage(){

        assertTrue(methods.isElementVisible(By.xpath("//a[@aria-current=\"page\" and ./span[text()=\"Ana sayfa\"]]"),20));
        assertTrue(methods.isElementVisible(By.cssSelector("a[href=\"/search\"]"),20));
        assertTrue(methods.isElementVisible(By.cssSelector("a[href=\"/collection\"]"),20));
        assertTrue(methods.isElementVisible(By.xpath("//button[text()=\"Kaydol\"]"),30));
        assertTrue(methods.isElementVisible(By.cssSelector("button[data-testid=\"login-button\"]"),20));
    }

    public void clickLoginButton(){

        By loginButton = By.cssSelector("button[data-testid=\"login-button\"]");
        assertTrue(methods.isElementClickable(loginButton,20));
        methods.clickElement(loginButton);
    }
}

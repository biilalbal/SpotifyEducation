package testmaster.selenium.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import testmaster.selenium.methods.Methods;

public class HomePage {
    private static final Logger logger = LogManager.getLogger(Methods.class);
    Methods methods;

    public HomePage(){

        methods = new Methods();
    }

    public void loginControl(String username){
        String usernameElement = "figure[data-testid=\"user-widget-avatar\"]" + "[title=\""+ username+"\"]";


        Assertions.assertTrue(methods.isElementVisible(By.cssSelector(usernameElement),20));
        String usernameTitle = methods.getAttribute(By.cssSelector("figure[data-testid=\"user-widget-avatar\"]"),"title");
        Assertions.assertEquals(username, usernameTitle);
    }
    public void createPlaylist(){
        methods.clickElement(By.cssSelector(".J4xXuqyaJnnwS6s2p3ZB"));
        methods.waitBySeconds(4);
    }
    public void playListControl(){
        String checkText=".AINMAUImkAYJd4ertQxy";
        Assertions.assertTrue(methods.isElementVisible(By.cssSelector(checkText),20));
        logger.info("Calma listesi olusturuldu.");
    }
    public void closeAdd(){
        methods.clickElement(By.cssSelector("div[id=onetrust-close-btn-container]"));
    }

}

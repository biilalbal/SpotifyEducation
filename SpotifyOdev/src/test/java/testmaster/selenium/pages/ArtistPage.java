package testmaster.selenium.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import testmaster.selenium.methods.Methods;

public class ArtistPage {
    private static final Logger logger = LogManager.getLogger(Methods.class);
    Methods methods;
    public ArtistPage(){
        methods=new Methods();
    }
    public void artistPageControl(){
        Assert.assertTrue(methods.isElementVisible(By.xpath("//span[text()='Doğrulanmış Sanatçı']"),20));
        Assert.assertTrue(methods.isElementVisible(By.xpath("//h1[text()='Daft Punk']"),20));
        logger.info("Sanatci sayfasinin acildigi dogrulandi");
    }
    public void addSongsToPlaylist(){
        methods.hoverElement(By.xpath("(//div[@data-testid='tracklist-row'])[1]"));
        methods.clickElement(By.xpath("(//button[@data-testid='more-button'])[2]"));
        methods.hoverElement(By.xpath("//button[.='Çalma listesine ekle']"));
        methods.clickElement(By.xpath("//div[@class='eelA_0lUVXP3DXSyqSl6']//button[@class='wC9sIed7pfp47wZbmU6m']"));
        methods.waitBySeconds(1);
        methods.hoverElement(By.xpath("(//div[@data-testid='tracklist-row'])[2]"));
        methods.clickElement(By.xpath("(//button[@data-testid='more-button'])[3]"));
        methods.hoverElement(By.xpath("//button[.='Çalma listesine ekle']"));
        methods.clickElement(By.xpath("//div[@class='eelA_0lUVXP3DXSyqSl6']//button[@class='wC9sIed7pfp47wZbmU6m']"));
        methods.waitBySeconds(1);
        methods.hoverElement(By.xpath("(//div[@data-testid='tracklist-row'])[3]"));
        methods.clickElement(By.xpath("(//button[@data-testid='more-button'])[4]"));
        methods.hoverElement(By.xpath("//button[.='Çalma listesine ekle']"));
        methods.clickElement(By.xpath("//div[@class='eelA_0lUVXP3DXSyqSl6']//button[@class='wC9sIed7pfp47wZbmU6m']"));
        methods.waitBySeconds(2);
        ////div[@class='eelA_0lUVXP3DXSyqSl6']//button[@class='wC9sIed7pfp47wZbmU6m']
        ////button[.='Çalma listesine ekle']
        //(//button[@data-testid='more-button'])[2]
    }
}

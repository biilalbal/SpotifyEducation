package testmaster.selenium.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import testmaster.selenium.methods.Methods;

public class PlaylistPage {
    private static final Logger logger = LogManager.getLogger(Methods.class);
    Methods methods;
    public PlaylistPage(){
        methods=new Methods();
    }
    public void controlPlayListPage(){
        assertTrue(methods.isElementVisible(By.xpath("//h2[text()='Çalma listesi']"),20));
        assertTrue(methods.isElementVisible(By.xpath("//h1[text()='Çalma listene ekleyebileceğin bir şeyler bulalım']"),20));
        logger.info("Playlist sayfasi acildi.");
    }
    public void clickEditName(){
        methods.clickElement(By.cssSelector(".eczMAK"));
    }
    public void changeName(String setPlaylistName){
        methods.clear(By.cssSelector("[placeholder='Add a name']"));
        methods.sendKeys(By.cssSelector("[placeholder='Add a name']"), setPlaylistName);
        methods.clickElement(By.xpath("//span[contains(text(),'Kaydet')]"));
        methods.waitBySeconds(2);
        logger.info("Playlist adi " + setPlaylistName +" olarak degistirildi");
    }
    public void controlPlaylistName(){
        assertTrue(methods.isElementVisible(By.cssSelector("li[data-testid='rootlist-item']"),20));
        logger.info("Calma listesinin olusturuldugu dogrulandi");
    }
    public void playSecondSong(){
        methods.hoverElement(By.xpath("(//div[@data-testid='tracklist-row'])[2]"));
        methods.clickElement(By.xpath("(//button[@class='RfidWIoz8FON2WhFoItU'])[2]"));
        methods.waitBySeconds(12);
        logger.info("2. Sarki caliniyor");
    }
    public void stopTheSong(){
        methods.clickElement(By.xpath("(//div[@class='VpYFchIiPg3tPhBGyynT'])[2]"));
        logger.info("2. Sarki durduruldu");
    }
    public void deleteThirdSong(){
        methods.hoverElement(By.xpath("(//div[@data-testid='tracklist-row'])[3]"));
        methods.clickElement(By.xpath("(//button[@data-testid='more-button'])[4]"));
        methods.clickElement(By.xpath("//span[text()='Bu çalma listesinden kaldır']"));
        logger.info("3. Sarki listeden silindi");
        methods.waitBySeconds(2);
    }
    public void deleteMyPlayList(){
        methods.clickElement(By.xpath("(//button[@data-testid='more-button'])[1]"));
        methods.clickElement(By.xpath("//span[.='Sil']"));
        methods.clickElement(By.xpath("//span[contains(text(),'SİL')]"));
        methods.waitBySeconds(2);
        logger.info("Playlist silindi.");
    }
    public void deletedPlaylistControl(){
        assertTrue(methods.isElementVisible(By.xpath("//h1[contains(text(),'İlk çalma listeni oluştur')]"),20));
        assertTrue(methods.isElementVisible(By.xpath("//span[contains(text(),'Çalma listesi oluştur')]"),20));
        logger.info("Playlist silindigi goruldu");
    }

}

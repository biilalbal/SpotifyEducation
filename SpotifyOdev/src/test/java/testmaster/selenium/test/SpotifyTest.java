package testmaster.selenium.test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import testmaster.selenium.driver.Driver;
import testmaster.selenium.methods.Methods;
import testmaster.selenium.pages.*;

public class SpotifyTest extends Driver {
    private static final Logger logger = LogManager.getLogger(Methods.class);
    GuestPage guestPage;
    LoginPage loginPage;
    HomePage homePage;
    PlaylistPage playlistPage;
    SearchPage searchPage;
    ArtistPage artistPage;
    SpotifyMenu spotifyMenu;

    @Test
    public void spotifyHomework(){
        init();
        guestPage.controlGuestPage();
        guestPage.clickLoginButton();

        loginPage.controlLoginPage();
        loginPage.validLogin("bilal_bal8@hotmail.com","147258369bb");

        homePage.closeAdd();
        homePage.loginControl("Bilal");
        homePage.createPlaylist();
        homePage.playListControl();

        playlistPage.controlPlayListPage();
        playlistPage.clickEditName();
        playlistPage.changeName("Bilal");
        playlistPage.controlPlaylistName();

        spotifyMenu.clickSearchButton();

        searchPage.controlSearchPage();
        searchPage.searchSong("Dafk Punk");
        searchPage.clickArtist();

        artistPage.artistPageControl();
        artistPage.addSongsToPlaylist();

        spotifyMenu.clickMyPlaylist();

        playlistPage.playSecondSong();
        playlistPage.stopTheSong();
        playlistPage.deleteThirdSong();
        playlistPage.deleteMyPlayList();
        playlistPage.deletedPlaylistControl();


    }
    public void init(){
        playlistPage = new PlaylistPage();
        guestPage = new GuestPage();
        loginPage = new LoginPage();
        homePage = new HomePage();
        searchPage=new SearchPage();
        artistPage=new ArtistPage();
        spotifyMenu=new SpotifyMenu();

    }
}

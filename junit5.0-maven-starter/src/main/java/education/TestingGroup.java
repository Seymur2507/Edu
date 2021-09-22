package education;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;


public class TestingGroup {

    public WebDriver driver;
    @BeforeClass
    public void Setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://users.bugred.ru/");
    }
    @Test

    public void LoginCheck() {
        SitePage sitepage = new SitePage(driver);
        LoginPage loginpage = new LoginPage(driver);
        ProfilePage profilepage = new ProfilePage(driver);
        sitepage.clickLoginBtn();
        loginpage.inputEmail("kochevnik.mozdok@mail.ru");
        loginpage.inputPassword("kochevnik");
        loginpage.AuthClick();
        sitepage.clickprofileLink();
        String user = profilepage.getUserName();
        Assert.assertEquals("seymur", user);//???????
        profilepage.clickLogoutLink();
    }

    @AfterClass
    public void Shutdown() {
        driver.quit();
    }

}


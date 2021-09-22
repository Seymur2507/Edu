package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.lang.InterruptedException;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class OldGoogle {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:/webdrivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //GET гугла
        driver.get("https://www.google.ru/");
        //---------------------------------------------------
        //поиск окошка ввода
        WebElement searchField = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        //ввод в окошко текста
        searchField.sendKeys("Java"+ Keys.ENTER);
        //-------------------------------------------------
        //ожидание 1 сек
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //поиск страницы ORacLE
        WebElement result = driver.findElement(By.xpath("//h3[contains(.,\'Java | Oracle\')]"));
        //кликание на оракл - driver.findElement(By.xpath("//h3[contains(.,\'Java | Oracle\')]")).click();
        result.click();
    }
}

package education;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
public class Main extends BaseTest{

    @Test()
    public void JavaSearchTest(){
        driver = new ChromeDriver();
        //GET гугла
        driver.get("https://www.google.ru/");
        //---------------------------------------------------
        //поиск окошка ввода
        WebElement searchField = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        //ввод в окошко текста
        searchField.sendKeys("Java"+ Keys.ENTER);
        //ожидание------------------------------------------------
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //поиск страницы ORacLE-------------------------
        WebElement result = driver.findElement(By.xpath("//h3[contains(.,\'Java | Oracle\')]"));
        //кликание на оракл-------------------------------
        result.click();
        //ожидание--------------------------------
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
*/
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.sql.Driver;

public class BaseTest {

    @Test
    public void searchOnGoogle(){
System.setProperty("chromedriver.exe","C:\\Users\\melvin.thomas\\IdeaProjects\\automationcom");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input"))
                .sendKeys("Cars Used");
        driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input"))
                .sendKeys(Keys.ENTER);
        driver.close();
    }
}

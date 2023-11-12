package webElementTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/");

        driver.manage().window().maximize();
        driver.findElement(By.linkText("Accept All")).click();
        Select select=new Select(driver.findElement(By.name("country")));
        Thread.sleep(1000);
        select.selectByVisibleText("ANGUILLA");
        Thread.sleep(1000);
        select.selectByIndex(4);
        Thread.sleep(1000);
        select.selectByValue("ANTARCTICA");

        for(WebElement element:select.getOptions()){
            System.out.printf(element.getText()+ "" +(element.getTagName()));
        }
    driver.quit();
    }
}

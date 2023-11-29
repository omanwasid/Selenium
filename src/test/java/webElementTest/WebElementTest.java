package webElementTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebElementTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

        driver.manage().window().maximize();
        driver.findElement(By.id("userName")).clear();
        WebElement element= driver.findElement(By.id("userName"));
        element.sendKeys(" Oman Wasid");

        driver.manage().timeouts().getImplicitWaitTimeout();

        driver.findElement(By.id("userEmail")).clear();
        WebElement element1= driver.findElement(By.id("userEmail"));
        element1.sendKeys("oman46@gmail.com");

        driver.findElement(By.id("currentAddress")).clear();
        WebElement element2= driver.findElement(By.id("currentAddress"));
        element2.sendKeys("Hækkevold 11,2tv,Brønshøj");

        //driver.findElement(By.id("submit")).clear();
        WebElement element3=driver.findElement(By.id("submit"));
        System.out.println(element3.isDisplayed());
        //element3.click();


        WebElement element4= driver.findElement(By.id("permanentAddress"));
        System.out.println("TagName:" +element4.getTagName());

        //System.out.println(driver.findElement(By.id("permanentAddress")).getTagName());

        WebElement elm = driver.findElement(By.id("submit"));
        System.out.println("Font Size of: " + elm.getCssValue("font-size"));
        System.out.println(elm.getCssValue("color"));
        System.out.println("Text is:" +elm.getText());
        System.out.println("Rect X value is:" +elm.getRect().getX());
        System.out.println("Rect Y value is:" +elm.getRect().getY());




    driver.close();




    }
}

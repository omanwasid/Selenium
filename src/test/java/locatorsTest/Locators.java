package locatorsTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Locators {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("#login-button")).click();
        driver.findElement(By.linkText("Sauce Labs Backpack")).click();
        //driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

        driver.navigate().back();
        driver.findElement(By.partialLinkText("Labs")).click();
        driver.findElement(By.name("back-to-products")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.cssSelector("#continue-shopping")).click();

        //System.out.println(driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).getSize());

        driver.findElement(By.className("social_linkedin")).getTagName();

        List<WebElement> elements = driver.findElements(By.className("inventory_item_price"));
        System.out.println("Size of the elements is: "        + elements.size());

    }
}

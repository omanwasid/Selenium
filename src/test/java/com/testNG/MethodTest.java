package com.testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MethodTest extends BaseMethodTest{
    @Test(priority = 0)
    public  void verifyTitleShouldSucceed(){

        Assert.assertEquals(driver.getTitle(), "Swag Labs");


    }

    @Test(priority = 1)
    public  void verifyLoginShouldSucceed() throws InterruptedException {


        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("#login-button")).click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");

    }

    @Test(priority = 2)
    public  void verifyProductPageShouldSucceed() throws InterruptedException {

        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("#login-button")).click();




        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.cssSelector(".shopping_cart_link")).click();
        //Assert.assertEquals(driver.findElements(By.linkText("Checkout: Your Information")),"Checkout: Your Information");

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/cart.html");


    }

}

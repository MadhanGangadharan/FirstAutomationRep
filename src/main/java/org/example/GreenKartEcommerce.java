package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GreenKartEcommerce {

    public static void main(String[] args) {
        ArrayList<String> vegetables = new ArrayList<String>();
        vegetables.add("Brocolli");
        vegetables.add("Cauliflower ");
        WebDriver driver=new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
            List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        for (int j=0;j< vegetables.size();j++) {
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getText().contains(vegetables.get(j))){
                    driver.findElement(By.xpath("//div//button[text()='ADD TO CART']")).click();
                    //System.out.println(vegetables.get(j));
                }

            }

        }

        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(30));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='PROCEED TO CHECKOUT']")));
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

        //driver.findElement(By.xpath("//button[text()='Place Order']")).click();
        //driver.findElement(By.xpath("//div//button[@fdprocessedid='l0z2a2']]")).click();





    }


}

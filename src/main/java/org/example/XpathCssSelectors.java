package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathCssSelectors {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Testing branching the class");
        System.out.println("Hello");
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("Madhan");
        driver.findElement(By.name("inputPassword")).sendKeys("12345");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Madhan");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("madhan12322@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
        driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("abc@gmail.com");
        //driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("1234567890");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234567880");//Using parent Child Traverse
        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
        driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
        driver.findElement(By.id("inputUsername")).sendKeys("Madhan");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        Thread.sleep(5000);
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.getTitle());
    }
}

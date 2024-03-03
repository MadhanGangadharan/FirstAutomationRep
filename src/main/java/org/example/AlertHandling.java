package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("alertbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        driver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(5000);
        driver.switchTo().alert().dismiss();


    }
}

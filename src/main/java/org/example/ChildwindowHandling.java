package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ChildwindowHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
        Set<String> windows= driver.getWindowHandles();
        Iterator<String> it =windows.iterator();
        String parentid= it.next();
        String childid= it.next();
        driver.switchTo().window(childid);
        String email=driver.findElement(By.linkText("mentor@rahulshettyacademy.com")).getText();
        System.out.println(email);
        driver.switchTo().window(parentid);
        driver.findElement(By.id("username")).sendKeys(email);
    }
}

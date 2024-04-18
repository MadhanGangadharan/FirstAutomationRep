package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboardInteraction {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
        Actions dD=new Actions(driver);
        dD.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable")) ).build().perform();
        driver.switchTo().defaultContent();

        /*WebDriver driver=new ChromeDriver();
        Actions achson=new Actions(driver);
        driver.get("https://www.amazon.in/");
        WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
        achson.moveToElement(move).build().perform();
        achson.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("mobile").build().perform();
*/
    }
}

package org.example;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class staticdropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//        WebElement dropdownelement = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//        Select  dropdownvalues =new Select(dropdownelement);
//        dropdownvalues.selectByIndex(0);
//        System.out.println(dropdownvalues.getFirstSelectedOption().getText());
//        dropdownvalues.selectByValue("INR");
//        System.out.println(dropdownvalues.getFirstSelectedOption().getText());
//        dropdownvalues.selectByVisibleText("AED");
//        System.out.println(dropdownvalues.getFirstSelectedOption().getText());
//            driver.findElement(By.id("divpaxinfo")).click();
//            Thread.sleep(1000);
//            System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//            int i =1;
//            while(i<5){
//                driver.findElement(By.id("hrefIncAdt")).click();
//                i++;
//            }
//
//        driver.findElement(By.id("btnclosepaxoption")).click();
//        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        // ############################Dynamic Drop Down################################################################

        //driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        //driver.findElement(By.xpath("//a[@value='MAA'][1]")).click();
        //driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
        //driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
//        driver.findElement(By.id("autosuggest")).sendKeys("ind");
//        Thread.sleep(2000);
//        List<WebElement> Countries = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
//
//        for (WebElement Country : Countries){
//
//            if (Country.getText().equalsIgnoreCase("India")) {
//                Country.click();
//                break;
//
//
//            }
//        }
        Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
        ;
        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
        System.out.print(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());


    }

}

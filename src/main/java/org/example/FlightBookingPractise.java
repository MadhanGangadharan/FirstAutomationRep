package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FlightBookingPractise {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("India");
        Thread.sleep(2000);
        List<WebElement> countries=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

        for (WebElement Country : countries){

            if (Country.getText().equalsIgnoreCase("India")) {
                System.out.println(Country.getText());
                Country.click();
                break;
            }
        }
        driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_0']")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("(//a[@value='CJB'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        //driver.findElement(By.id("hrefIncAdt")).click();
        int Adult=1;
        int child=1;
        while(Adult<=2){
            driver.findElement(By.id("hrefIncAdt")).click();
            Adult++;
        }
        while(child<=2){
            driver.findElement(By.id("hrefIncChd")).click();
            child++;
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        WebElement selectElement = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select sel = new Select(selectElement);
        sel.selectByValue("USD");
        WebElement Currency= sel.getFirstSelectedOption();
        String selectedoption = Currency.getText();
        System.out.println(selectedoption);
        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();

        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

    }

}

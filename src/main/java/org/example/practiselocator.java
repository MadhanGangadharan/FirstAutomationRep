package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiselocator {


    public static void main(String[] args){
        System.out.println("Hello");
        WebDriver a =new ChromeDriver();
        a.get("https://rahulshettyacademy.com/locatorspractice/");
        a.findElement(By.id("inputUsername")).sendKeys("Madhan");
        a.findElement(By.name("inputPassword")).sendKeys("12345");
        a.findElement(By.className("signInBtn")).click();

    }
}

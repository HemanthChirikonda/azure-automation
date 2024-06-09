package com.learningautomation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebiste {


    public void testingTheJob(){
        WebDriver  driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("htto.azure-devopws-nect ");
        String name = driver.getTitle();
        System.out.println(name);
        driver.quit();

    }
}

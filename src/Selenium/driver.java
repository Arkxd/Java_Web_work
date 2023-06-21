package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driver {
    public static void main(String[] args) {
        WebDriver webDriver = (WebDriver) new ChromeDriver();
        webDriver.get("http://www.baidu.com/");
        String title = webDriver.getTitle();
        System.out.println("title is => " + title);
        webDriver.findElement(By.id("kw")).sendKeys("易百教程");
        webDriver.findElement(By.id("su")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

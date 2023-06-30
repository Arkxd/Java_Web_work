package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_in {
    public static void main(String[] args) {
        WebDriver webDriver = (WebDriver) new ChromeDriver();
        webDriver.get("http://jw.qit.edu.cn/jwglxt/xtgl/login_slogin.html");
        String title = webDriver.getTitle();
        System.out.println("title is => " + title);
        webDriver.findElement(By.id("yhm")).sendKeys("202202215108");
        webDriver.findElement(By.id("mm")).sendKeys("Szb753731346");
        webDriver.findElement(By.id("dl")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
package 测试大作业;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    public static void main(String[] args) {
        WebDriver webDriver = (WebDriver) new ChromeDriver();
        webDriver.get("http://localhost:8080/login");
        String title = webDriver.getTitle();
        System.out.println("title is =>" + title);
        webDriver.findElement(By.id("name")).sendKeys("小白");
        webDriver.findElement(By.id("password")).sendKeys("adminadmin");
        webDriver.findElement(By.cssSelector(".bn")).click();
    }
}

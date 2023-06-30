package 测试大作业;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class 添加商品 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = (WebDriver) new ChromeDriver();
        webDriver.get("http://localhost:8080/login");
        String title = webDriver.getTitle();
        System.out.println("title is => " + title);
        webDriver.findElement(By.id("name")).sendKeys("小白");
        webDriver.findElement(By.id("password")).sendKeys("adminadmin");
        webDriver.findElement(By.cssSelector(".bn")).click();
        webDriver.findElement(By.cssSelector("#menu-product > dt")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.linkText("商品列表")).click();
        webDriver.findElement(By.linkText("\uE600 添加商品")).click();
        webDriver.switchTo().frame(0);
        webDriver.findElement(By.id("name")).sendKeys("111");
        webDriver.findElement(By.id("price")).sendKeys("222");
        webDriver.findElement(By.id("zan")).sendKeys("333");
        webDriver.findElement(By.id("number")).sendKeys("444");
        webDriver.findElement(By.cssSelector(".btn")).click();
    }
}

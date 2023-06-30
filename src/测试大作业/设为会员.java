package 测试大作业;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class 设为会员 {
    public static void main(String[] args) {
        WebDriver webDriver = (WebDriver) new ChromeDriver();
        webDriver.get("http://localhost:8080/login");
        String title = webDriver.getTitle();
        System.out.println("title is => " + title);
        webDriver.findElement(By.id("name")).sendKeys("小白");
        webDriver.findElement(By.id("password")).sendKeys("adminadmin");
        webDriver.findElement(By.cssSelector(".bn")).click();
        webDriver.findElement(By.cssSelector("#menu-member > dt")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        webDriver.findElement(By.linkText("用户列表")).click();
        webDriver.findElement(By.cssSelector(".text-c:nth-child(3) .ml-5:nth-child(1) > .label")).click();
        webDriver.findElement(By.linkText("确定")).click();
    }
}

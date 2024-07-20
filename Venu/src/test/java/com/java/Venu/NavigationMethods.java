package com.java.Venu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys("HYR Tutorials");
        Thread.sleep(3000);
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(3000);
        driver.findElement(By.name("email")).sendKeys("test@gmail.com");
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.quit();
        
	}

}

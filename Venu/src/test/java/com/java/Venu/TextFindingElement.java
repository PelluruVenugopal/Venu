package com.java.Venu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextFindingElement {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		driver.findElement(By.id("login_field")).sendKeys("pelluru");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("venup@143");
		Thread.sleep(3000);
		driver.findElement(By.name("commit")).click();
		

	}

}

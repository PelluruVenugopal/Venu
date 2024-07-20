package com.java.Venu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleTextBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://github.com/login");
        Thread.sleep(3000);
        WebElement usernameText=driver.findElement(By.id("login_field"));
        if(usernameText.isDisplayed()) {
        	if(usernameText.isEnabled()) {
        		usernameText.sendKeys("pelluru venugopal");
        		String enteredTxt=usernameText.getAttribute("value");
        		System.out.println(enteredTxt);
        		Thread.sleep(3000);
        		usernameText.clear();
        	}
        	else {
        		System.out.println("username Textbox is not enabled");
        	}
        	
        }
	}

}

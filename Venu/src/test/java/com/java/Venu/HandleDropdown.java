package com.java.Venu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html#google_vignette");
		Thread.sleep(3000);
		WebElement CourseElement=driver.findElement(By.id("course"));
		Select CoursenameDropdown = new Select(CourseElement);
		List<WebElement> CourseNameDropdownOptions=CoursenameDropdown.getOptions();
		for(WebElement option:CourseNameDropdownOptions) {
			System.out.println(option.getText());
			
		}
		CoursenameDropdown.selectByIndex(1);
		Thread.sleep(3000);
		CoursenameDropdown.selectByValue("net");
		Thread.sleep(3000);
		CoursenameDropdown.selectByVisibleText("Javascript");
		Thread.sleep(3000);
		String selectedtext=CoursenameDropdown.getFirstSelectedOption().getText();
		System.out.println("selected visible text -" +selectedtext);
		

	}

}

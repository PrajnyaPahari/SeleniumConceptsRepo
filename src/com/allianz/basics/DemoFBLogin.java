package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFBLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("hellouser");
		driver.findElement(By.id("pass")).sendKeys("684768364");
		driver.findElement(By.name("login")).click();
	}

}

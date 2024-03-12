package com.allianz.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FB{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		// TODO Auto-generated method stub

	}

}

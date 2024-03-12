package com.allianz.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1launchbrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		String browser="chrome";
		if(browser.equalsIgnoreCase("ed")) {
			driver=new EdgeDriver();		}
		else
		{
		driver = new ChromeDriver();	
		}
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		String title = driver.getTitle();
		System.out.println(title);
		String ps = driver.getPageSource();
		System.out.println(ps);
		driver.close();
		

	}

}

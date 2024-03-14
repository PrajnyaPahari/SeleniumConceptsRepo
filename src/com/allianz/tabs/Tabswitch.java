package com.allianz.tabs;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Url = "https://www.db4free.net/";
		WebDriver driver= null;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(Url);
		driver.findElement(By.linkText("phpMyAdmin »")).click();
		List<String> al = new ArrayList<String>(driver.getWindowHandles()); 
		//Set<String> windowHandales= driver.getWindowHandles();
		System.out.print(al.get(0));
		System.out.print(al.get(1));
		driver.switchTo().window(al.get(1));
		System.out.println(driver.getTitle());
		driver.findElement(By.id("input_username")).sendKeys("admin123");
		driver.findElement(By.id("input_password")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='input_go']")).click();
		//driver.quit();
		driver.close();
		

	}

}

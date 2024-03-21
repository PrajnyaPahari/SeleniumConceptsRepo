package com.allianz.alertBasics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm";
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		
		driver.findElement(By.xpath("//img[@alt='Go']")).click();
		//driver.findElement(By.xpath("//img[contains"))
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.print(text);
		alert.accept();
		
		

	}

}

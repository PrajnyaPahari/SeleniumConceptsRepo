package com.allianz.alertBasics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://netbanking.hdfcbank.com/netbanking/IpinResetUsingOTP.htm";
		WebDriver driver = null;
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		
		driver.findElement(By.xpath("//img[@alt='Go']")).click();
		WebDriverWait wait = null;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
		//driver.findElement(By.xpath("//img[contains"))
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.print(text);
		alert.accept();
		
		

	}

}

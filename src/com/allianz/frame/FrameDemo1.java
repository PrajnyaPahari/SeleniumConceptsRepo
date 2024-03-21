package com.allianz.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FrameDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "https://netbanking.hdfcbank.com/netbanking";
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='login_page']")));
		driver.findElement(By.name("fldLoginUserId")).sendKeys("Jack123");
		driver.findElement(By.linkText("CONTINUE")).click();
		driver.switchTo().defaultContent();
		
	}

}

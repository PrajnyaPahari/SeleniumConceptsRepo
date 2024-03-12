package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoFBSignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		//Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("demo");
		driver.findElement(By.name("lastname")).sendKeys("last");
		driver.findElement(By.name("reg_email__")).sendKeys("demo@sel.in");
		//Thread.sleep(5000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("demo@sel.in");
		driver.findElement(By.id("password_step_input")).sendKeys("sele@123456");
		//driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[3]/label")).click();
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		Select selectDay = new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("14");
		Select selectMonth = new Select(driver.findElement(By.id("month")));
		selectMonth.selectByVisibleText("Dec");
		//selectMonth.selectByValue("11");
		//selectMonth.selectByIndex(10);
		Select selectYear = new Select(driver.findElement(By.id("year")));
		selectYear.selectByVisibleText("1976");
		

	}

}

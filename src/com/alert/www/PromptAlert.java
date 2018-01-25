package com.alert.www;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Dell\\Desktop\\selenium\\Browser Driver\\geckodriver.exe");
		   
		 WebDriver driver = new FirefoxDriver();
		 
		      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		      driver.get("https://www.google.co.in");
		      driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		      
	driver.findElement(By.cssSelector("li.active:nth-child(3) > a:nth-child(1)")).click();
	
	driver.findElement(By.cssSelector(".btn-info")).click();
	Thread.sleep(5000);
	Alert promt =driver.switchTo().alert();
	promt.sendKeys("hello Guys");
	  String AlertText = promt.getText();
	System.out.println(AlertText);
	promt.accept();
	}

}

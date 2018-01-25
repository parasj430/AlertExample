package com.alert.www;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConfirmationAlert {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
	// This is the second commit

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Dell\\Desktop\\selenium\\Browser Driver\\geckodriver.exe");
		   
		 WebDriver driver = new FirefoxDriver();
		 
		      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		      driver.get("https://www.google.co.in");
		      driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		      
	driver.findElement(By.cssSelector("li.active:nth-child(2) > a:nth-child(1)")).click();
	
	driver.findElement(By.cssSelector(".btn-primary")).click();
	Thread.sleep(5000);
	Alert confirmation =driver.switchTo().alert();
	String AlertText = confirmation.getText();
	System.out.println(AlertText);
	confirmation.accept();
	
	
	}

}

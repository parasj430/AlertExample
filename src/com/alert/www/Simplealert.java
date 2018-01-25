package com.alert.www;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javafx.scene.control.Alert;

public class Simplealert {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Dell\\Desktop\\selenium\\Browser Driver\\geckodriver.exe");
		   
		 WebDriver driver = new FirefoxDriver();
		 
		      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		      driver.get("https://www.google.co.in");
		      driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		      
	
	driver.findElement(By.cssSelector(".btn-danger")).click();
	Thread.sleep(5000);
	
	
	
	org.openqa.selenium.Alert simple = driver.switchTo().alert();
	String str = simple.getText();
	System.out.println(str);
			
	simple.accept();
	
	
	}

}

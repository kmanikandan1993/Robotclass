package org.robotc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webt {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","H:\\Robotclass\\driver\\chromedriver.exe");

		WebDriver driver =new ChromeDriver(); 
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
	List<>	driver.findElements(By.tagName("table"));      
		

}

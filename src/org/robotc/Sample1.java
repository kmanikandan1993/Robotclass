package org.robotc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sample1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","H:\\Robotclass\\driver\\chromedriver.exe");

		WebDriver driver =new ChromeDriver(); 
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		WebElement singleSelect =driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select s = new Select(singleSelect);
		s.selectByIndex(0);
		Thread.sleep(5000);
		s.selectByValue("5");
		Thread.sleep(5000);
		s.selectByVisibleText("Blue");
		
		List<WebElement> options = s.getOptions();
		for (int i = 0; i <options.size(); i++) {
			WebElement	optionss =options.get(i); 
			String text = optionss.getText();
			System.out.println(text);
			
		}
}
}
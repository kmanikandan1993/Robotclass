package org.robotc;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;
import org.openqa.selenium.interactions.Actions;

public class Selenium {
public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver","H:\\Robotclass\\driver\\chromedriver.exe");

WebDriver driver =new ChromeDriver(); 
driver.get("http://demo.guru99.com/test/drag_drop.html");

WebElement user=driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
WebElement pass=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
WebElement user1=driver.findElement(By.xpath("(//a[contains(text(),'5000')])[2]"));
WebElement pass1=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
WebElement user2=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
WebElement pass2=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
WebElement user3=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
WebElement pass3=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));




Actions acc = new Actions(driver);

acc.dragAndDrop(user,pass).perform();
acc.dragAndDrop(user1,pass1).perform();
acc.dragAndDrop(user2,pass2).perform();
acc.dragAndDrop(user3, pass3).perform();

TakesScreenshot tk = (TakesScreenshot)driver; 

File src = tk.getScreenshotAs(OutputType.FILE);

File des = new File ("H:\\Robotclass\\lib\\shot");
FileUtils.copyFile(src,des);













}}
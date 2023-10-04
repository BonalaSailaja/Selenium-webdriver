package com.aqe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo3 {
	public static String browser = "Firefox";
	public static WebDriver dr;

	public static void main(String[] args) {
		if(browser.equals("Chrome")) {
			dr=new ChromeDriver();
		}else if(browser.equals("Firefox")) {
			dr=new FirefoxDriver();
		}else if(browser.equals("Edge")) {
			dr=new EdgeDriver();
		}
		
		
		dr.get("http://www.google.com");
		dr.manage().window().maximize();
		dr.findElement(By.id("APjFqb")).sendKeys("Amazon");
		dr.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		dr.findElement(By.xpath("/html/body/div[5]/div/div[9]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/div/div/div/cite")).click();
		dr.findElement(By.id("twotabsearchtextbox")).sendKeys("fridge");
		dr.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		dr.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
		JavascriptExecutor js = (JavascriptExecutor) dr.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[4]/div[35]/div[1]/div/form/div/ul"));
        js.executeScript("window.scrollBy(0,500)");
        System.out.println("scrolled");
		WebElement addToCartButton = dr.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div[6]/div/div/form/div[1]/div[1]/span/span/a"));
	        addToCartButton.click();
	       System.out.println("added");
	   
		dr.close();
		
	}

}

package com.aqe;
import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	public class DemoTest {
	    public static WebDriver dr;
	    public static String browser = "Firefox";
	    @BeforeTest
	    public void setUp() {
	        if (browser.equals("Chrome")) {
	            dr = new ChromeDriver();
	        } else if (browser.equals("Firefox")) {
	            dr = new FirefoxDriver();
	        }
	        dr.get("http://www.google.com");
	        dr.manage().window().maximize();
	    }
        @Test(priority = 1)
	    public void searchAmazon() {
	        dr.findElement(By.id("APjFqb")).sendKeys("Amazon");
	        dr.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
	    }

	    @Test(priority = 2)
	    public void clickAmazonLink() {
	        dr.findElement(By.xpath("/html/body/div[5]/div/div[9]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/div/div/div/cite")).click();
	    }

	    @Test(priority = 3)
	    public void searchForFridge() {
	        dr.findElement(By.id("twotabsearchtextbox")).sendKeys("fridge");
	        dr.findElement(By.cssSelector("#nav-search-submit-button")).click();
	    }

	    @Test(priority = 4)
	    public void addToCart() {
	        JavascriptExecutor js = (JavascriptExecutor) dr;
	        js.executeScript("window.scrollBy(0,500)");

	        WebElement addToCartButton = dr.findElement(By.cssSelector("span.a-declarative a"));
	        addToCartButton.click();
	    }  
	    @AfterTest
	    public void tearDown() {
	         dr.close();
	    }
	

	}



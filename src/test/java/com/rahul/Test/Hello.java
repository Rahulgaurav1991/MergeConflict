package com.rahul.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hello {
	
		@Test
		public void data()
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://torrentcounter.to/");
			Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(By.id("menu-item-2836"))).perform();
			List<WebElement> ele = driver.findElements(By.xpath("//li[@id='menu-item-2837']/..//a"));
			for(WebElement name:ele) {
				System.out.println(name.getAttribute("innerHtml"));
				
			}
			driver.close();
		}

	}



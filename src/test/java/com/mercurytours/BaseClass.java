package com.mercurytours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import com.mercurytours.PackageHolidays;


public class BaseClass {
	public static WebDriver driver;
	
	@Test
	public static void main() {
		// TODO Auto-generated method stub
		System.out.println("ok");
		//Open the browser and app
		driver = new FirefoxDriver();
		driver.get("https://www.mercuryholidays.co.uk/");
		PackageHolidays p = new PackageHolidays();
		p.PackagHolidays();
	}

}

package com.mercurytours;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class PackageHolidays extends BaseClass implements ActionListener{

	public void PackagHolidays() {
		
		System.out.println(driver.getTitle());
		
		new Select (driver.findElement(By.id("destination")))
		                       .selectByVisibleText("Malta");
		new Select (driver.findElement(By.id("from")))
							   .selectByVisibleText("London Heathrow");
		driver.findElement(By.id("calendar")).click();  
		driver.findElement(By.xpath("/html/body/div[9]/table/tbody/tr[5]/td[4]/a]")).click();
		System.out.println("Succes");
		
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

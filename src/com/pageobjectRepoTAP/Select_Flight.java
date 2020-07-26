package com.pageobjectRepoTAP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.genericLib.Browser;
import com.genericLib.constnts;

public class Select_Flight {

	@FindBy(xpath="//input[@name='reserveFlights']")
	private WebElement reserveflights;

	
	
	public void findflights(){
		
		reserveflights.click();
	}
	
	}

	


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

public class Flight_Reservation_Page {

	@FindBy(xpath="//input[@name='findFlights']")
	private WebElement findflights;

	
	
	public void findflights(){
		
		findflights.click();
	}
	
	}

	


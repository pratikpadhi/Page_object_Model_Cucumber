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

public class Login {

	@FindBy(xpath="//input[@name='userName']")
	private WebElement usernameedt;
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordedt;
	@FindBy(name="login")
	private WebElement loginbtn;
	
	
	public void login(){
		Browser.driver.get(constnts.url_b);
		usernameedt.sendKeys(constnts.username_b);
		passwordedt.sendKeys(constnts.password_b);
		loginbtn.click();
	}
	
	}

	


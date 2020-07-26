package com.pageobjectRepoTAP;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.genericLib.Browser;
import com.genericLib.ExcelLib;
import com.genericLib.constnts;

public class BookaFlight {

	@FindBy(xpath="//input[@name='passFirst0']")
	private WebElement firstname;
	@FindBy(xpath="//input[@name='passLast0']")
	private WebElement lastname;
	@FindBy(xpath="//input[@name='creditnumber']")
	private WebElement number;
	@FindBy(xpath="//input[@name='buyFlights']")
	private WebElement loginbtn;
	ExcelLib elib=new ExcelLib();
	
	public boolean book(String last) throws EncryptedDocumentException, InvalidFormatException, IOException{
		firstname.sendKeys(elib.getExceldata("DataSheet.xlsx", "Sheet1",0,1));
		lastname.sendKeys(last);
		Double a=elib.getExceldatanum("DataSheet.xlsx", "Sheet1",0,0);
		int a1=a.intValue();
    	a1--;
    	String e=Integer.toString(a1);
    	number.sendKeys(e);
		loginbtn.click();
		
		/*
		if(success.getText().contentEquals("Invoice saved successfully."))
        	return true;
             else
        	return false;
		 */
		
		return true;
	}
	
	}



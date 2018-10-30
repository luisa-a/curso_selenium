package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import common.BaseTest;

public class PracticaCatch  extends BaseTest{
	
	By lnkFrame =By.linkText("Frames Test");
	By lnkPage =By.linkText("Confirm Page");
	
	public void practica (){

		
		try {
			
			driver.get("http://sahitest.com/demo/");
			driver.findElement(lnkFrame).click();
			driver.findElement(lnkPage).click();
			
			
		} catch (NoSuchElementException e) {
			System.out.println("Ingresé al catch de la excepción");
			driver.switchTo().frame(0);
			driver.findElement(lnkPage).click();
		}
		
	
		
		
	}
	
	public static void main(String[] args) {
		PracticaCatch practicaCatch =new PracticaCatch();
		practicaCatch.practica();
	}

}

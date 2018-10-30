package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import common.BaseTest;

public class MyTest extends BaseTest {

	By linkTestCorrecto = By.linkText("Link Test");
	By linkTestIncorrecto = By.linkText("link Tes");

	public void ingresarSahi() throws InterruptedException {

		try {
			driver.get("http://sahitest.com/demo/");
			driver.findElement(linkTestIncorrecto).click();

		} catch (NoSuchElementException e) {
			System.out.println("Ingresé al catch de la excepción NoSuchElementException");
			driver.findElement(linkTestCorrecto).click();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("Ingresé al catch de la excepción");
		}
	}

	@Test
	public void ingresarSahiThrow() throws NoSuchElementException, InterruptedException {

		try {
			driver.get("http://sahitest.com/demo/");
			driver.findElement(linkTestCorrecto).click();

		} catch (NoSuchElementException e) {
			System.out.println("Ingresé al catch de la excepción NoSuchElementException");
			driver.findElement(linkTestCorrecto).click();
		

			throw new NoSuchElementException("No estaba disponible el elemento linkTestIncorrecto");
		} catch (Exception e) {
			System.out.println("Ingresé al catch de la excepción");
		}

	}

	/*
	 * public static void main(String[] args) throws InterruptedException {
	 * MyTest mytest = new MyTest(); mytest.abrirnavegador();
	 * mytest.ingresarSahiThrow(); mytest.ingresarSahi();
	 * mytest.cerrarNavegador();
	 * 
	 * }
	 */
}

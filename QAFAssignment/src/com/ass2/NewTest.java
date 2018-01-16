package com.ass2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qmetry.qaf.automation.step.QAFTestStep;

public class NewTest extends Ass2_TestPage {

	@QAFTestStep(description = "start the test")
	public void startTheTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("/");
		Thread.sleep(1000);
		getElectronics().click();
		Thread.sleep(1000);
		getApple().click();
		Thread.sleep(1000);
		getIpad().click();
		Thread.sleep(1000);

		List<WebElement> wb = driver.findElements(By.xpath("//div[contains(@class,'col col-7-12')]/div[1]"));

		int nooflinks = wb.size();
		System.out.println(nooflinks);
		for (WebElement pagelink : wb) {
			String linktext = pagelink.getText();
			String link = pagelink.getAttribute("href");
			System.out.println(linktext + " ->");
			System.out.println(link);
		}

		Thread.sleep(2000);

	}

	@QAFTestStep(description = "select lowest price phone")
	public void selectLowestPricePhone() throws InterruptedException {
		getLowprice().click();
		Thread.sleep(1000);
		getFirstphone().click();
		Thread.sleep(1000);

	}

	@QAFTestStep(description = "verify product details")
	public void verifyProductDetails() throws InterruptedException
	{
		Thread.sleep(1000);
		if (driver.findElement(By.xpath("//h1[contains(@class,'_3eAQiD')]")).isDisplayed()) 
		{
			Thread.sleep(1000);
			System.out.println("**********************product details verified**********************");
		} 
		else 
		{
			System.out.println("Element is not present");
		}
		Thread.sleep(1000);
	}

	@QAFTestStep(description = "add to cart")
	public void addToCart() throws InterruptedException 
	{
		getAddtocart().click();
		Thread.sleep(1000);
		getContinueshopping().click();
		Thread.sleep(1000);
		getCart().click();
		Thread.sleep(1000);
	}

	
	@QAFTestStep(description = "verify product added to the cart")
	public void verifyProductAddedToTheCart() throws InterruptedException 
	{
		Thread.sleep(1000);
		try{
			driver.findElement(By.xpath("//*[@id=\'container\']/div/div[1]/div/div/div[1]/div[2]/div/div[1]/div[1]")).isDisplayed(); 
		
			Thread.sleep(1000);
			System.out.println("**********************Product has been added in cart**********************");
		} 
		catch(Exception e) 
		{
			System.out.println("Element is not Present");
		}
		Thread.sleep(1000);
	
	}

}

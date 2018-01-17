/*package com.ass2.steps;

import java.awt.AWTException;
import java.awt.Desktop.Action;

import org.openqa.selenium.interactions.Actions;

import com.ass2.pages.AddTocartTestPage;
import com.ass2.pages.BuyProduct;
import com.ass2.pages.Category;
import com.ass2.pages.HomePage;
import com.ass2.pages.MyCart;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;

public class FlipkartStep extends HomePage {
	HomePage home = new HomePage();
	Category category = new Category();
	Actions act = new Actions(driver);
	BuyProduct prod = new BuyProduct();
	AddTocartTestPage addtocart = new AddTocartTestPage();
	MyCart cart = new MyCart();
	
	//@QAFTestStep(description = "I launch flipkart app")
	public void launchFlipkart() throws AWTException
	{
		home.launchPage();
		
		home.handleLoginPopup();
	}
	@QAFTestStep(description = "I open {0} from main menu")
	public void selectFromMainMenu(String menuName) throws InterruptedException {
		
		
		QAFExtendedWebElement webelement = new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("lnk.mainmenuitem.homepage"),menuName));
		//System.out.println(menuName);
		act.moveToElement(webelement).click().build().perform();
		//webelement.wait();
		Thread.sleep(1000);
	}
	@QAFTestStep(description = "I should see main menu expanded")
	public void verifyMainMenuSelected()
	{
		home.verifyItemsPresent();
	}
	@QAFTestStep(description = "I select {0} from {1}")
	public void selectSubcategory(String subcategory,String menu)
	{
		QAFExtendedWebElement webelement = new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("lnk.mainmenuitem.homepage"),menu));
		
		act.moveToElement(webelement).click().build().perform();
		new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("lnk.mainmenuitem.homepage"),subcategory )).click();
	}
	//@QAFTestStep(description = "I should see all items under {0}")
	public void verifySubCategorySelected()
	{
		category.verifyProductPresent();
	}
	//@QAFTestStep(description = "I click on ipad")
	public void selectProduct() {
		category.selectProduct();
	}
	//@QAFTestStep(description = "I should see list of ipad products")
	public void productList() {
		prod.getProductName();
	}
	//@QAFTestStep(description = "I select first product")
	public void buyProduct()
	{
		prod.selectFirstProduct();
	}
	//@QAFTestStep(description = "I should see product detail page")
	public void storeProductDetail() throws InterruptedException
	{
		
		addtocart.verifyTitle();
	}
	//@QAFTestStep(description = "I add the product to cart")
	public void addToCart()
	{
		addtocart.addToCart();
	}
	//@QAFTestStep(description = "I should see the added product in cart")
	public void verifyProductDetail()
	{
		cart.verifyProdDetailIncartPage();
	}

}
*/
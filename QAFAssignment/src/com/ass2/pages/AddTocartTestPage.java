package com.ass2.pages;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Validator;

import org.hamcrest.Matchers;

import com.ass2.utils.Common;
import com.jayway.jsonpath.Configuration;

public class AddTocartTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {
	Common utility = new Common();
	@FindBy(locator = "btn.cart.addtocartpage")
	private QAFWebElement btncartaddtocartpage;
	@FindBy(locator = "title.selectedproduct.addtocartpage")
	private QAFWebElement titleselectedproductaddtocartpage;
	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}
	
	public QAFWebElement getAddToCartBtn() {
		return btncartaddtocartpage;
	}
	@QAFTestStep(description = "I should see product detail page")
	public void verifyTitle() throws InterruptedException
	{
			
		utility.switchToWindowContainingElement(btncartaddtocartpage);
		btncartaddtocartpage.waitForVisible();
		
		//Validator.verifyThat(titleselectedproductaddtocartpage.getText(), Matchers.containsString("Apple iPad 3"));
		Validator.verifyThat("Flipkart productpage validation", driver.getTitle(),Matchers.containsString("Apple iPad 3")); 
	}
	public void storeProductDetail(String productName, String productPrice)
	{
		ProductInfo info = new ProductInfo();
		info.setProductName(productName);
		info.setProductPrice(productPrice);
		ConfigurationManager.getBundle().setProperty("selected.product", info);
		//System.out.println("Product details: " +ProductInfo.getProductName());
	}
	@QAFTestStep(description = "I add the product to cart")
	public void addToCart() {
		
		utility.switchToWindowContainingElement(btncartaddtocartpage);
		btncartaddtocartpage.waitForVisible();
		btncartaddtocartpage.click();
		
	
	}
	
	

}

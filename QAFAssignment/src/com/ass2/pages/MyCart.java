package com.ass2.pages;

import org.hamcrest.Matchers;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Validator;

public class MyCart extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "lnk.productname.productlistpage")
	private QAFWebElement lnkProductnameProductlistpage;
	@FindBy(locator = "lnk.productprice.productlistpage")
	private QAFWebElement lnkProductpriceProductlistpage;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
		
	}

	

	public QAFWebElement getLnkProductnameProductlistpage() {
		return lnkProductnameProductlistpage;
	}

	public QAFWebElement getLnkProductpriceProductlistpage() {
		return lnkProductpriceProductlistpage;
	}
	@QAFTestStep(description = "I should see the added product in cart")
	public void verifyProdDetailIncartPage() {
		ProductInfo info = (ProductInfo) ConfigurationManager.getBundle().getProperty("selected.product");
		
		Validator.verifyThat("Flipkart product Name In Cart page",info.getProductName(),Matchers.containsString(lnkProductnameProductlistpage.getText()));
		Validator.verifyThat("Flipkart Price of Cart product",info.getProductPrice(),Matchers.containsString(lnkProductpriceProductlistpage.getText()));
	}
}

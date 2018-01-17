package com.ass2.component;

import org.openqa.selenium.By;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebDriver;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class ProductComponent extends QAFWebComponent {

	/*@FindBy(locator = "lnk.applyfilter.productlistpage")
	private QAFWebElement lnkApplyfilterProductlistpage;*/
	@FindBy(locator = "lnk.productname.productlistpage")
	private QAFWebElement lnkProductnameProductlistpage;
	@FindBy(locator = "lnk.productprice.productlistpage")
	private QAFWebElement lnkProductpriceProductlistpage;

	public ProductComponent(String locator) {
		super(locator);

	}

	

	public QAFWebElement getLnkProductnameProductlistpage() {
		return lnkProductnameProductlistpage;
	}

	public QAFWebElement getLnkProductpriceProductlistpage() {
		return lnkProductpriceProductlistpage;
	}
	
	
}

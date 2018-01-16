package com.ass2;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class Ass2_TestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "electronics")
	private QAFWebElement electronics;
	@FindBy(locator = "apple")
	private QAFWebElement apple;
	@FindBy(locator = "ipad")
	private QAFWebElement ipad;
	@FindBy(locator = "lowprice")
	private QAFWebElement lowprice;
	@FindBy(locator = "firstphone")
	private QAFWebElement firstphone;
	@FindBy(locator = "addtocart")
	private QAFWebElement addtocart;
	@FindBy(locator = "continueshopping")
	private QAFWebElement continueshopping;
	@FindBy(locator = "cart")
	private QAFWebElement cart;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getElectronics() {
		return electronics;
	}

	public QAFWebElement getApple() {
		return apple;
	}

	public QAFWebElement getIpad() {
		return ipad;
	}

	public QAFWebElement getLowprice() {
		return lowprice;
	}

	public QAFWebElement getFirstphone() {
		return firstphone;
	}

	public QAFWebElement getAddtocart() {
		return addtocart;
	}

	public QAFWebElement getContinueshopping() {
		return continueshopping;
	}

	public QAFWebElement getCart() {
		return cart;
	}

}

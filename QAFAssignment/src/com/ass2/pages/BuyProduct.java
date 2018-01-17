package com.ass2.pages;

import java.util.List;

import org.hamcrest.Matchers;

import com.ass2.component.ProductComponent;
import com.ass2.utils.Common;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;
import com.ass2.pages.AddTocartTestPage;

public class BuyProduct extends WebDriverBaseTestPage<WebDriverTestPage> {
	List<ProductComponent> result = getProductlist();
	/*@FindBy(locator = "lnk.applyfilter.productlistpage")
	private QAFWebElement lnkApplyfilterProductlistpage;*/
	/*@FindBy(locator = "lnk.productname.productlistpage")
	private QAFWebElement lnkProductnameProductlistpage;
	@FindBy(locator = "lnk.productprice.productlistpage")
	private QAFWebElement lnkProductpriceProductlistpage;*/
	@FindBy(locator = "results.products.productlistpage")
	private List<ProductComponent> resultsproductsproductlistpage;
	
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		
		
	}
	
	public List<ProductComponent> getProductlist()
	{
		return resultsproductsproductlistpage;
	}
	@QAFTestStep(description = "I should see list of ipad products")
	public void getProductName()
	{
		Validator.verifyThat(result.size(), Matchers.greaterThan(0));
		//System.out.println("Size@@@@@@@22"+result.size());
		for(ProductComponent subResult:result) {
			/*System.out.println("1. Name " +subResult.getLnkProductnameProductlistpage().getText());
			System.out.println("2. Price " +subResult.getLnkProductpriceProductlistpage().getText());*/
			Reporter.log("Name" +subResult.getLnkProductnameProductlistpage().getText());
			Reporter.log("Price" +subResult.getLnkProductpriceProductlistpage().getText());
		}
		
	}
	
	
	@QAFTestStep(description = "I select first product")
	public void selectFirstProduct()
	{
		AddTocartTestPage addtocart = new AddTocartTestPage();
		addtocart.storeProductDetail(result.get(0).getLnkProductnameProductlistpage().getText(), result.get(0).getLnkProductpriceProductlistpage().getText());
	
		result.get(0).getLnkProductnameProductlistpage().click();
	}
	
	/*public QAFWebElement getApplyFilterLink() {
		return lnkApplyfilterProductlistpage;
	}*/
	
	
	
}

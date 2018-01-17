package com.ass2.pages;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import org.openqa.selenium.interactions.Actions;

import ch.qos.logback.core.joran.action.Action;

public class Category extends WebDriverBaseTestPage<WebDriverTestPage> {

	
	@FindBy(locator = "lnk.subcategory.categorypage")
	private QAFWebElement lnksubcategorycategorypage;
	

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	

	public QAFWebElement getLnkSubCategoryPage() {
		return lnksubcategorycategorypage;
	}
	@QAFTestStep(description = "I open {0} from main menu")
	public void selectFromMainMenu(String menuName) throws InterruptedException {
		
		Actions act = new Actions(driver);
		QAFExtendedWebElement webelement = new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("lnk.mainmenuitem.homepage"),menuName));
		//System.out.println(menuName);
		act.moveToElement(webelement).click().build().perform();
		//webelement.wait();
		Thread.sleep(1000);
	}
	@QAFTestStep(description = "I click on ipad")
	public void selectProduct() {
		lnksubcategorycategorypage.waitForVisible();
		lnksubcategorycategorypage.click();
	}
	@QAFTestStep(description = "I should see all items under {0}")
	public void verifyProductPresent()
	{
		lnksubcategorycategorypage.isPresent();
	}

	
	

}

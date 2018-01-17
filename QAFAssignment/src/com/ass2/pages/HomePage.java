package com.ass2.pages;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import com.qmetry.qaf.automation.step.NotYetImplementedException;
import com.qmetry.qaf.automation.step.QAFTestStep;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.qmetry.qaf.automation.step.QAFTestStep;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.thoughtworks.selenium.Wait;
public class HomePage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "lnk.mainmenuitem.homepage")
	private QAFWebElement lnkmainmenuitemhomepage;
	@FindBy(locator = "lnk.submenu.homepage")
	private QAFWebElement lnksubmenuhomepage;
	@FindBy(locator = "btn.cancelbutton.homepage")
	private QAFWebElement loginpopupcancleBtn;
	@FindBy(locator = "popup.mainmenu.homepage")
	private QAFWebElement popupmainmenuhomepage;
	
	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
		
	}
	
	@QAFTestStep(description = "I launch flipkart app")
	public void launchPage() throws AWTException {
		driver.manage().deleteAllCookies();
		driver.get("/");
		driver.manage().window().maximize();
		handleLoginPopup();
	}
	
	
	
	public void handleLoginPopup() throws AWTException {
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_ESCAPE);
		rob.keyRelease(KeyEvent.VK_ESCAPE);
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS); 
	}
	
	public QAFWebElement getElectronics() {
		return lnkmainmenuitemhomepage;
	}
	
	
	
	
	public QAFWebElement getApple() {
		return lnksubmenuhomepage;
	}
	@QAFTestStep(description = "I should see main menu expanded")
	public void verifyItemsPresent()
	{
		popupmainmenuhomepage.verifyPresent();
	}
	@QAFTestStep(description = "I select {0} from {1}")
	public void selectSubcategory(String subcategory,String menu)
	{
		Actions act = new Actions(driver);
		QAFExtendedWebElement webelement = new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("lnk.mainmenuitem.homepage"),menu));
		
		act.moveToElement(webelement).click().build().perform();
		new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("lnk.mainmenuitem.homepage"),subcategory )).click();
	}
	

	

}

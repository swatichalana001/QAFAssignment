package com.ass2.utils;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class Common extends WebDriverBaseTestPage<WebDriverTestPage>{
	
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		
		
	}
	public void switchToWindowContainingElement(QAFWebElement element) {
		driver.getWindowHandles();
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
			if(element.isPresent())
				break;
			
		}
		
}
}

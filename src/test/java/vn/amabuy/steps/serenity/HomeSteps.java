package vn.amabuy.steps.serenity;

import net.thucydides.core.annotations.Step;
import vn.amabuy.pages.HomePage;

public class HomeSteps {
	HomePage onHomePage;
	
	@Step
	public void openWebBrowser() {
		onHomePage.open();
	}
	
	@Step
	public void clickOnLoginLink() {
		onHomePage.clickOnLoginLink();
	}
}

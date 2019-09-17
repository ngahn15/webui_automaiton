package vn.amabuy.steps.serenity;

import net.thucydides.core.annotations.Step;
import vn.amabuy.pages.LoginPage;

public class LoginSteps {
	LoginPage loginPage;
	
	@Step
	public void clickOnRegisterPage() {
		loginPage.clickOnRegisterLink();
	}
	
}

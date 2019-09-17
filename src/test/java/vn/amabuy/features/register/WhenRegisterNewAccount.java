package vn.amabuy.features.register;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import vn.amabuy.steps.serenity.HomeSteps;
import vn.amabuy.steps.serenity.LoginSteps;
import vn.amabuy.steps.serenity.RegisterSteps;

@RunWith(SerenityRunner.class)
public class WhenRegisterNewAccount {
	@Managed
	WebDriver driver;

	@Steps
	HomeSteps homeStep;

	@Steps
	LoginSteps loginStep;

	@Steps
	RegisterSteps registerStep;

	@Test
	public void test_Register_New_Account() {
		String password_ErrMesg = "Mật khẩu xác nhận không chính xác";
		homeStep.openWebBrowser();
		homeStep.clickOnLoginLink();

		loginStep.clickOnRegisterPage();

		registerStep.created_New_Account("Hoang Ngoc Nga", "ngocnga.hnn@gmail.com", "0948655597", "hello123",
				"hello12333");
		
		registerStep.warningMesg(password_ErrMesg);
	}
}

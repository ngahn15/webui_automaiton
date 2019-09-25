package vn.amabuy.steps.serenity;

import static org.junit.Assert.assertEquals;

import net.thucydides.core.annotations.Step;
import vn.amabuy.pages.RegisterPage;

public class RegisterSteps {
	RegisterPage registerPage;

	@Step
	public void created_New_Account(String fullname, String email, String tel, String password,
			String comfirm_password) {
//		registerPage.enterTextIntoFullname(fullname);
//		registerPage.enterTextIntoEmail(email);
//		registerPage.enterTextIntoTel(tel);
//		registerPage.enterTextIntoPasword(password);
//		registerPage.enterTextIntoComfirmPasword(comfirm_password);
		enter_fullname(fullname);
		enter_email(email);
		enter_tel(tel);
		enter_pass(password);
		enter_cpass(comfirm_password);
		clickButtonRegister();

	}

	@Step
	private void enter_cpass(String comfirm_password) {
		registerPage.enterTextIntoComfirmPasword(comfirm_password);
	}

	@Step
	private void enter_pass(String password) {
		registerPage.enterTextIntoPasword(password);
	}

	@Step
	private void enter_tel(String tel) {
		registerPage.enterTextIntoTel(tel);
	}

	@Step
	private void enter_email(String email) {
		registerPage.enterTextIntoEmail(email);
	}
	
	@Step
	private void enter_fullname(String fullname) {
		registerPage.enterTextIntoFullname(fullname);
	}
	
	@Step
	public void warningMesg(String expectedErrMesg) {
		assertEquals(expectedErrMesg, registerPage.getErrorMesg());
	}
	
	@Step
	public void clickButtonRegister() {
		registerPage.clickOnButtonRegister();
	}
}

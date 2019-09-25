package vn.amabuy.pages;

import net.serenitybdd.core.pages.PageObject;

public class RegisterPage extends PageObject {

	private static final String Error_Mesg = "//div[@class='alert alert-danger text-center']";
	private static final String FullName = "Họ và tên";
	private static final String Email = "Địa chỉ Email";
	private static final String tel = "Số điện thoại";
	private static final String Password = "Mật khẩu";
	private static final String comfirmPassword = "Nhập lại mật khẩu";

	public void enterTextIntoFullname(String name) {
		$(Target.of(FullName)).type(name);
	}

	public void enterTextIntoEmail(String email) {
		$(Target.of(Email)).type(email);
	}

	public void enterTextIntoTel(String phone) {
		$(Target.of(tel)).type(phone);
	}

	public void enterTextIntoPasword(String password) {
		$(Target.of(Password)).type(password);
	}

	public void enterTextIntoComfirmPasword(String password) {
		$(Target.of(comfirmPassword)).type(password);
	}
	
	public String getErrorMesg() {
		return $(Error_Mesg).getText();
	}

	static class Target {
		private static final String TARGET = "//label[contains(text(),'%s')]/following-sibling::input";

		public static String of(String labelName) {
			return String.format(TARGET, labelName);
		}

	}

	public void clickOnButtonRegister() {
		$("//button[text()='Đăng ký']").click();
	}
}

package vn.amabuy.features;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import vn.amabuy.steps.serenity.HomeSteps;

@RunWith(SerenityRunner.class)
public class WhenOpeningWebBrowser {
	@Managed
	WebDriver driver;
	
	@Steps
	HomeSteps open;
	
	@Test
	
	public void openWeb() {
		open.openWebBrowser();
	}
}

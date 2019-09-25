package vn.amabuy.features;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.util.EnvironmentVariables;
import vn.amabuy.features.properties.MyProperties;

@RunWith(SerenityRunner.class)
public class EnviromentVariable {
	private EnvironmentVariables environments;
	
	@Test
	public void get_properties_from_serenity_config() {
//		Lấy chính xác
		String myProperties = environments.getProperty("serenity.project.name");
		System.out.println("1 " + myProperties);
//		Trường hợp nhiều lựa chọn
		myProperties = environments.optionalProperty("setup.dev").orElse("sai roi");
		System.out.println( "2 " + myProperties);
//		Improve code
		myProperties = environments.optionalProperty(MyProperties.NAME).orElse("sai roi");
		System.out.println( "3 " + myProperties);

	}
}

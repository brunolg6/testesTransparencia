package passosDeTeste;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;

public class Cenario03_AcessivelComTAB {

	WebDriver chromeDriver;

	@After
	public void after() {
		if (this.chromeDriver != null) {
			this.chromeDriver.quit();
		}
	}

}

package auxiliares;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Funcoes {

	public static void teclarTab(int vezes) throws InterruptedException {
		Robot robot;
		try {
			for (int i = 0; i < vezes; i++) {
				robot = new Robot();
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
			}
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	public static void teclarEnter() throws InterruptedException {
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	public static boolean estaVisivel(WebDriver webDriver, String xpath) {
		try {
			return webDriver.findElement(By.xpath(xpath)).isDisplayed();
		} catch (Throwable t) {
			return false;
		}
	}

	public static void moverMouse(WebDriver webDriver, String xpath) {
		Actions builder = new Actions(webDriver);
		WebElement we = webDriver.findElement(By.xpath(xpath));
		builder.moveToElement(we).build().perform();
	}
}

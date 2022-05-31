package Logic;

import static Logic.LaunchBrowsers.driver;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Pages.XPaths;

public class LogicalActions {
	// constructor
	public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

	/**
	 * 1. Method to verify user navigated to home page by fetching current url &
	 * comparing with actual url.
	 */
	public static void verifyHomePageNavigation() throws InterruptedException {
		String homePageUrl = driver.getCurrentUrl();
		Assert.assertEquals(homePageUrl, "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/",
				"Not navigated to Voot home page");
		Thread.sleep(1000);
		System.out.println("Home page url is: " + homePageUrl);
	}

	/**
	 * 2. method to verify voot page by presence of element and comparing fetched
	 * page text with actual text.
	 */
	public static void verifyStep1() throws InterruptedException {

		WebElement page = driver.findElement(XPaths.objAnnualIncome);
		@SuppressWarnings("unused")
		String Text = page.getAttribute("title");
		String title = driver.getTitle();
		System.out.println("Title is: " + title);
		// System.out.println("Text is: " + Text);

	}

	public static void navigatetomypage() throws Exception {

		driver.findElement(XPaths.objAnnualIncome).sendKeys("80000");

		driver.findElement(XPaths.objOtherIncome).sendKeys("10000");

		driver.findElement(XPaths.objLivingExpences).sendKeys("500");

		driver.findElement(XPaths.objOtherLoansRepayments).sendKeys("100");

		driver.findElement(XPaths.objCreditCardLimits).sendKeys("10000");

		driver.findElement(XPaths.objWorkOutHowMuchICouldBorrow).click();

		Thread.sleep(5000);

		driver.findElement(XPaths.objStartOver).click();

		driver.findElement(XPaths.objLivingExpences1).sendKeys("1");

		Thread.sleep(5000);

		driver.findElement(XPaths.objWorkOutHowMuchICouldBorrow1).click();

		Thread.sleep(5000);

		String ExpectedValue = "Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500.";
		String ActualValue = driver.findElement(XPaths.objText).getText();
		Assert.assertEquals(ExpectedValue, ActualValue);
		System.out.println("Test Passed");

	}

}

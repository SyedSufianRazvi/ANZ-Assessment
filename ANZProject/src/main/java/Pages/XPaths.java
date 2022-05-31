package Pages;

import org.openqa.selenium.By;

public class XPaths {

	public static By objAnnualIncome = By.xpath("(//input[contains(@value,'0')])[1]");

	public static By objOtherIncome = By.xpath("(//input[contains(@value,'0')])[2]");

	public static By objLivingExpences = By.xpath("//input[@id='expenses']");

	public static By objOtherLoansRepayments = By.xpath("//input[@id='otherloans']");

	public static By objCreditCardLimits = By.xpath("//input[@id='credit']");

	public static By objWorkOutHowMuchICouldBorrow = By.xpath("//button[@id='btnBorrowCalculater']");

	public static By objStartOver = By.xpath("(//span[contains(@class,'icon icon_restart')])[1]");

	public static By objLivingExpences1 = By.xpath("//input[@id='expenses']");

	public static By objWorkOutHowMuchICouldBorrow1 = By.xpath("//button[@id='btnBorrowCalculater']");

	public static By objText = By.xpath("//div[@class='borrow__error__text']");

}

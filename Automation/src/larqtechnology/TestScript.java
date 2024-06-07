package larqtechnology;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends BaseClass
{
	@Test
	public void execution() throws InterruptedException
	{
		hp = new HomePage(driver);
		hp.getShopAllButton().click();
		hp.getPurificationFunction().click();
		hp.getBottleImage().click();
		hp.getAddToCartButton().click();
		
//		WebElement checkOutNow = driver.findElement(By.xpath("//button[text()='Check out now']"));
//		Actions ac = new Actions(driver);
//		ac.moveToElement(checkOutNow).click();
		hp.getCheckOutNowButton().click();


		
		
		Reporter.log("larq-technology executed",true);
		
	}

}

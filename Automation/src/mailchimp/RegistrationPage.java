package mailchimp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPage 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://mailchimp.com/features/website-builder/?ds_c=DEPT_AOC_Google_Search_ROW_EN_NB_UpRet_Broad_50off_T5&ds_kids=p78377606132&ds_a_lid=aud-1549074331369:kwd-10445831&ds_cid=71700000115522798&ds_agid=58700008586041980&gad_source=1&gclid=CjwKCAjwr7ayBhAPEiwA6EIGxA0KU-q21DMxRYnHjANyUTSXKqLDz1Asyl25VN5t15sywckKtEyWORoCh1MQAvD_BwE&gclsrc=aw.ds");
		driver.findElement(By.xpath("(//a[contains(text(),' Sign Up')])[1]")).click();
		
	}

}

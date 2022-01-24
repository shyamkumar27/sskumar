package shyam;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class git {
	@Test
	public void register() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shyam.sunda\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1= new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("https://phptravels.org/register.php");
		elements el=new elements();
		el.first_name(d1).sendKeys("Shyam");
		el.last_name(d1).sendKeys("Kumar");
		el.e_mail(d1).sendKeys("shyam153@gmail.com");
		el.phone_no(d1).sendKeys("9100236447");
		el.street_adress(d1).sendKeys("Sector 11");
		el.street_adress2(d1).sendKeys("Steel plant");
		el.city(d1).sendKeys("Vishakapatnam");
		el.state(d1).sendKeys("Andhra Pradesh");
		el.post_code(d1).sendKeys("531020");
		el.country(d1);
		el.company_name(d1).sendKeys("HCL");
		el.mobile_no(d1).sendKeys("9100236447");
		Thread.sleep(3000);
		el.password(d1).sendKeys("shyam123@");
		el.confirm_password(d1).sendKeys("shyam123@");
		((JavascriptExecutor)d1).executeScript("scroll(0,1500)");
		Thread.sleep(19000);
		el.register_button(d1).click();
	}

}

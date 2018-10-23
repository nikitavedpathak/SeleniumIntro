import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	    
		//get: to load certain websites
		
		//driver.get("https://www.facebook.com/");
		
		
		//navigate
        //to find element and enter value 
		//Using ID Locator
		/*driver.findElement(By.id("email")).sendKeys("myfirstselemiu");
		driver.findElement(By.id("pass")).sendKeys("myPassword");
		driver.findElement(By.id("loginbutton")).click();
		*/
		/*
		//Using Xpath
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("My first");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Myfirst");
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		
		*/
		
	
		//ASSSIGNMENT ***********************************************************************************************************************88
		
		//SET UP CHROME WEB DRIVER
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp-pc\\Downloads\\Java Framework\\chromedriver\\chromedriver.exe");  // 1st arg: specify driver for explorer and 2nd arg: location where chrome drier is located
		WebDriver driver = new ChromeDriver();
		
		//LOAD AMERICAN AIRLINE WEBSITE
		
		driver.get("https://www.aa.com/");
		
		//SELECT "FROM" CITY/AIRPORT
		
		driver.findElement(By.xpath("//*[@id='reservationFlightSearchForm']/div[3]/div[1]/div/a/span[1]")).click();
		Select s1 = new Select(driver.findElement(By.xpath("//*[@id='countryCode']")));		
		s1.selectByValue("US");		
		Select s2 = new Select(driver.findElement(By.xpath("//*[@id='stateCode']")));		
		s2.selectByValue("MO");		
		driver.findElement(By.xpath("//*[@id='airport_MCI']/span[1]")).click();
		driver.findElement(By.xpath("//*[@id='airport_MCI']/span[1]")).click();
		
		//SELECT "TO" CITY/AIRPORT  //*[@id="airport_MCI"]/span[1]
		
		driver.findElement(By.xpath("//*[@id='reservationFlightSearchForm']/div[3]/div[2]/div/a/span[1]")).click();		
		Select s3 = new Select(driver.findElement(By.xpath("//*[@id='countryCode']")));		
		s3.selectByValue("US");		
        Select s4 = new Select(driver.findElement(By.xpath("//*[@id='stateCode']")));		
		s4.selectByValue("FL");		
		driver.findElement(By.xpath("//*[@id='airport_MIA']/span[1]")).click();
		//driver.findElement(By.xpath("//*[@id='airport_TPA']/span[1]")).click();
		
		//SELECT NO OF PASSENGERS TRAVELLING
		
		Select s5 = new Select(driver.findElement(By.xpath("//*[@name='adultOrSeniorPassengerCount']")));		
		s5.selectByValue("2");
		
		
		//SELECT DEPARTURE DATE
		
		driver.findElement(By.xpath("//*[@id='aa-leavingOn']")).clear();
		driver.findElement(By.xpath("//*[@id='aa-leavingOn']")).sendKeys("08/30/2018");
		
		//SELECT RETURN DATE
		
		driver.findElement(By.xpath("//*[@id='aa-returningFrom']")).clear();		
		driver.findElement(By.xpath("//*[@id='aa-returningFrom']")).sendKeys("09/05/2018");
		
		//SELECT SEARCH BUTTON
		
		driver.findElement(By.xpath("//*[@id='flightSearchForm.button.reSubmit']")).click();
		
		
		
		
	}

}

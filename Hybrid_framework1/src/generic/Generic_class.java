package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_class  implements Framework_constant1
{
 public	 WebDriver driver;
@BeforeMethod
public void open() 
{
	System.setProperty(chrome_key,chrome_value);
	 driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.get(url);
}


@AfterMethod
public void close()
{
  driver.close();
}
	
	
	
}

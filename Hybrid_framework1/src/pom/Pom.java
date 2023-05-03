package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom 
{
@FindBy(id="email")
private WebElement un;

@FindBy(id="pass")
private WebElement pw;

@FindBy(name="login")
private WebElement lgn;

public Pom(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void name(String un1)
{
	un.sendKeys(un1);
}
public void password(String pwd1)
{
	pw.sendKeys(pwd1);
}
public void login()
{
	lgn.click();
}


}

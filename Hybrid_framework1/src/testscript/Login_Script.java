package testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic.Fetch_Data;
import generic.Generic_class;
import pom.Pom;

public class Login_Script extends Generic_class
{
@Test
public void test1() 
{
	String un=Fetch_Data.get_data("Sheet1",0,0);
	String pwd=Fetch_Data.get_data("Sheet1",0,1);
	Pom p=new Pom(driver);
	p.name(un);
	p.password(pwd);
	p.login();
}
}

package org.test;

import java.util.Date;

import org.file.BaseClass;
import org.pojo.Loginfunction;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestNg  extends BaseClass{
	@BeforeClass
	private void befcls() {
		Date d=new Date();
		System.out.println(d);

	}
	@AfterClass
	private void aftercls() {
		Date d=new Date();
		System.out.println(d);
		
	}
	@BeforeMethod
	private void bef() {
	LunchBrowser();
	LoadUrl("https://www.facebook.com/");
	MaxBrowser();
	
	}
	@AfterMethod
	private void aftmetd() {
		Toquite();
	}
	@Test
	private void tc3() {
		Loginfunction l = new Loginfunction();
		Fill(l.getTxtEmail(), "yuvan@123gmail.com");
		Fill(l.getTxtPass(), "yuvan@123");
		Toclick(l.getLoginBtn());

	}
	@Test
	private void tc1() {
		Loginfunction l = new Loginfunction();
		Fill(l.getTxtEmail(), "harishganapathy");
		Fill(l.getTxtPass(), "yuvan@123");
		Toclick(l.getLoginBtn());

	}
	@Test
	private void tc2() {
		Loginfunction l = new Loginfunction();
		Fill(l.getTxtEmail(), "hariprasanth@123gmail.com");
		Fill(l.getTxtPass(), "yuvan@123");
		Toclick(l.getLoginBtn());

	}
	
	

}

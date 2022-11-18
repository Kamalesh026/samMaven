package org.junit;

import org.file.BaseClass;
import org.pojo.Loginfunction;
import org.testng.xml.LaunchSuite;

public class Jsam extends BaseClass {

	@Test

	public void tc1() {
		LunchBrowser();
		LoadUrl("https://www.facebook.com/");
		MaxBrowser();
		Loginfunction l = new Loginfunction();
		Fill(l.getTxtEmail(), "yuvan.kamalesh");
		String user = ToAttribute(l.getTxtEmail());
		Assert.assertTrue(user.contains("yuvan.kamalesh"));
		Fill(l.getTxtPass(), "yuvan@123");
		String pass = ToAttribute(l.getTxtPass());
		Assert.assertEquals("to check paasword feild", "yuvan@123", pass);
		Toclick(l.getLoginBtn());
		Toquite();
	}

	@Ignore
	@Test
	public void tc3() {

		Loginfunction l = new Loginfunction();
		Fill(l.getTxtEmail(), "kamalesh");
		Fill(l.getTxtPass(), "kamalesh@123");
		Toclick(l.getLoginBtn());
	}

	@Test
	public void tc2() {
		LunchBrowser();
		LoadUrl("https://www.facebook.com/");
		MaxBrowser();
		Loginfunction l = new Loginfunction();
		Fill(l.getTxtEmail(), "harishganapathy");
		Fill(l.getTxtPass(), "yuvan@123");
		Toclick(l.getLoginBtn());
		Toquite();

	}

}

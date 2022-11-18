package org.sam;

import org.file.BaseClass;
import org.openqa.selenium.By;
import org.pojo.Loginfunction;

public class Sample extends BaseClass{
public static void main(String[] args) {
	LunchBrowser();
	MaxBrowser();
	CurrentUrl();
	ToTitle();
	LoadUrl("https://www.facebook.com/");
	Loginfunction l=new Loginfunction();
	Fill(l.getTxtEmail(), "yuvankamale");
	Fill(l.getTxtPass(), "yuvan");
	l.getLoginBtn().click();
}
}

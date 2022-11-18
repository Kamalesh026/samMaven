package org.pojo;

import org.file.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Loginfunction extends BaseClass {
	public Loginfunction() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//input[@id='email']")
private WebElement txtEmail;
@FindAll({
	@FindBy(xpath="//input[@id='pass']"),
	
})
private WebElement txtPass;
@FindBy(xpath="//button[@name='login']")
private WebElement loginBtn;
public WebElement getTxtEmail() {
	return txtEmail;
}
public void setTxtEmail(WebElement txtEmail) {
	this.txtEmail = txtEmail;
}
public WebElement getTxtPass() {
	return txtPass;
}
public void setTxtPass(WebElement txtPass) {
	this.txtPass = txtPass;
}
public WebElement getLoginBtn() {
	return loginBtn;
}
public void setLoginBtn(WebElement loginBtn) {
	this.loginBtn = loginBtn;
}

		
		
		
		
		
	
}



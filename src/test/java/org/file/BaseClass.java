package org.file;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.runners.AllTests;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert al;
	public static Select s;

	public static void LunchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void LoadUrl(String url) {
		driver.get(url);

	}

	public static void MaxBrowser() {
		driver.manage().window().maximize();
	}

	public static void ToTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void CurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void Fill(WebElement element, String usertext) {
		element.sendKeys(usertext);
	}

	public static void Toclose() {
		driver.close();

	}

	public static void Toquite() {
		driver.quit();
	}

	public static void Toclick(WebElement element) {
		element.click();
	}

	public static void Towindowhandle() {
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
	}

	public static void Towindowshandling() {
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
	}

	public static void Totext(WebElement element) {
		String text = element.getText();
	}

	public static String ToAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
		return attribute;
	}

	public static void TomoveElement(WebElement element) {

		a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static void TodragandDrop(WebElement src, WebElement dest) {
		a.dragAndDrop(src, dest).perform();

	}

	public static void Todoubleclick(WebElement element) {
		a.doubleClick(element).perform();

	}

	public static void Tocontentclick(WebElement element) {
		a.contextClick(element).perform();
	}

	private void Toenter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void Todownkey(String key) {
		a = new Actions(driver);
		a.keyDown(key).perform();

	}

	public static void Toupkey(String key2) {
		a = new Actions(driver);
		a.keyUp(key2).perform();
	}

	public static void copy() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}

	public static void Topaste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}

	public static void Tocut() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
	}

	public static void up() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);

	}

	public static void down() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	}

	public static void accept(WebDriver alt) {
		al = alt.switchTo().alert();
		al.accept();
	}

	public static void dimiss() {
		al = driver.switchTo().alert();
		al.dismiss();

	}

	public static void selectIndex(WebElement web, int ref) {
		s = new Select(web);
		s.selectByIndex(ref);

	}

	public static void isMultiple(WebElement web) {
		s = new Select(web);
		s.isMultiple();
	}

	public static void getOption(WebElement web) {
		s = new Select(web);
		s.getOptions();

	}

	public static void FirstSelected(WebElement web) {
		s = new Select(web);
		s.getFirstSelectedOption();

	}

	public static void Allselected(WebElement web) {
		s = new Select(web);
		s.getAllSelectedOptions();

	}

	public static void Deselectedvisibletext(WebElement web, String ref) {
		s = new Select(web);
		s.deselectByVisibleText(ref);

	}

	public static void Deslectindex(WebElement web, int index) {
		s = new Select(web);
		s.deselectByIndex(index);

	}

	public static void deselctvalue(WebElement web, String ref) {
		s = new Select(web);
		s.deselectByValue(ref);

	}

	public void Deselectall(WebElement web) {
		s = new Select(web);
		s.deselectAll();

	}

	public static void excelSheet(int rownum, int cellNum, String sheetname) throws IOException {
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\MavenSamp\\src\\test\\java\\Excelsheet\\Book1.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fi);
		Sheet sh = book.getSheet(sheetname);
		Row r = sh.getRow(rownum);
		Cell c = r.getCell(cellNum);

		String value = " ";
		int cellType = c.getCellType();
		if (cellType == 1) {
			value = c.getStringCellValue();

		} else if (DateUtil.isCellDateFormatted(c)) {

			Date d = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd-mm-yy");
			value = sim.format(d);

		} else {
			double dd = c.getNumericCellValue();
			long l = (long) dd;
			value = String.valueOf(l);

		}
		System.out.println(value);
	}

}

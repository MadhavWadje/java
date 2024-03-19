package Com.hrms.lib11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import Com.hrms.utility.Log;

public class General11 extends Global11 {
	public void openappln() {
		driver=new FirefoxDriver();
	driver.navigate().to(url);
		System.out.println("open application");
	}
	public void Enterframe() {
		driver.switchTo().frame("rightMenu");
		Reporter.log("TestNG");
		Log.info("Log4j complete");	}


	public void login() throws Exception {
		driver.findElement(By.name(untbx)).sendKeys(un);
		driver.findElement(By.name(pwtbx)).sendKeys(pw);
		Thread.sleep(1000);
		driver.findElement(By.name(loginbtn)).click();
		Thread.sleep(1000);
		Reporter.log("login complete");
Log.info("login completed");
	}
	public void Add() throws Exception{
		//driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath(addbtn1)).click();
		Thread.sleep(1000);
		driver.findElement(By.name(lntbx)).sendKeys(ln);
		driver.findElement(By.name(fntbx)).sendKeys(fn);
		Thread.sleep(1000);
		driver.findElement(By.id(savebtn)).click();	
		//driver.switchTo().defaultContent();
		Reporter.log("Add complete");
	Log.info("Log4j completed");
	}
	public void Edit() throws Exception{
		//driver.switchTo().frame("rightMenu");
		driver.findElement(By.name(Editbtn2)).click();
		driver.findElement(By.name(Efntbx2)).clear();
		Thread.sleep(1000);
		driver.findElement(By.name(Efntbx2)).sendKeys(Efn);
		driver.findElement(By.name(Elntbx2)).clear();
		Thread.sleep(1000);
		driver.findElement(By.name(Elntbx2)).sendKeys(Eln);
		driver.findElement(By.name(savebtn2)).click();	
		Thread.sleep(1000);
		//driver.findElement(By.id("Editbtn2")).click();	
		Thread.sleep(1000);
		driver.findElement(By.xpath(Backbtn2)).click();	
		//driver.switchTo().defaultContent();
	}
	public void Delete() {
		String searchdropdown;
		//driver.switchTo().frame("rightMenu");
		Select st=new Select(driver.findElement(By.name(searchdropdown4)));
		st.selectByVisibleText(empid3);
		driver.findElement(By.name(checkbx3)).click();
		driver.findElement(By.name(searchbx3)).sendKeys(empidno);
		
		driver.findElement(By.xpath(searchbtn3)).click();
		driver.findElement(By.name(checkbx3)).click();
		driver.findElement(By.xpath(deletebtn3)).click();
		//driver.switchTo().defaultContent();
	}
	public void outframe() {
		driver.switchTo().defaultContent();
	}
	public void logout() {
		driver.findElement(By.linkText(logoutbtn)).click();
	}

	public void closeappln() {
		driver.close();
	}

	}

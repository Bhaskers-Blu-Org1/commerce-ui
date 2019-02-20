package com.ibm.commerce.cmc.ui.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ibm.commerce.cmc.base.TestBase;

public class TestUtil extends TestBase {

	static WebDriverWait wait;
	public static long IMPLICIT_WAIT = 20;

	public static boolean isElementDisplayed(WebElement element) {
		return element.isDisplayed();
	}

	public static boolean isElementSelected(WebElement element) {
		return element.isSelected();
	}

	public static void clickOnElement(WebElement element) {
		//System.out.println("element" + element);
		element.click();
		//System.out.println("element" + element);
	}
	
	public static String getElementText(WebElement element) {
		return element.getText();
	}

	public static boolean isClickable(WebElement element) {
		try {
		 wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			return true;
		} catch (Exception e) {
			return false;
		}

	}
	
	public static void mouseHoverToElement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
	}
	
	public static void enterText(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public static void selectItemFromDropDownByVisibleText(WebElement element, String storeName) {
		Select dd = new Select(element);
		dd.selectByVisibleText(storeName);
	}
	
	public static void selectItemFromDropDownByValue(WebElement element, String storeName) {
		Select dd = new Select(element);
		dd.selectByValue(storeName);
	}
	
	public static void selectItemFromDropDownByIndex(WebElement element, int index) {
		Select dd = new Select(element);
		dd.selectByIndex(index);
	}
	
	public static void selectItemFromAngularDropDown(List<WebElement> elements,String itemToSelect) {
		///html/body/div/div/ibm-dropdown-list/ul/li[1]
				//List<WebElement> x= driver.findElements(By.xpath("//ibm-dropdown-list/ul/li"));
						for ( WebElement element: elements) {
					String text = element.getText();
					if (text.equalsIgnoreCase(itemToSelect)) {
						element.click();
						
						break;
					}
					
	}
				
}
	
	public static boolean isItemSelectedFromAngularDropDown(List<WebElement> elements,String itemToSelect) {
		///html/body/div/div/ibm-dropdown-list/ul/li[1]
				//List<WebElement> x= driver.findElements(By.xpath("//ibm-dropdown-list/ul/li"));
		boolean b=false;
				for ( WebElement element: elements) {
					String text = element.getText();
					if (text.equalsIgnoreCase(itemToSelect)) {
						element.click();
						b=true;
						break;
					}
					
	}
				return b;
}
	
/*	public static void selectItemFromAngularDropDownAndSearch(List<WebElement> elements,String typeToSearch, String textToSearch) {
		///html/body/div/div/ibm-dropdown-list/ul/li[1]
				//List<WebElement> x= driver.findElements(By.xpath("//ibm-dropdown-list/ul/li"));
		boolean b=false;
				for ( WebElement element: elements) {
					String text = element.getText();
					if (text.equalsIgnoreCase(storeName)) {
						element.click();
						b=true;
						break;
					}
					
	}
				return b;
}*/
	
	public static void scrollToElementOnPage(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		
	}
	
	public static void scrollByPixels(int x, int y) {
		//newMasterCategoryPage.scrollToAssociatedAssets();
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy("+x+","+y+")");
	}
}

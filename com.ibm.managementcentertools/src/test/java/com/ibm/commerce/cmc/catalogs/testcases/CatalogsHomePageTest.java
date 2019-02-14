package com.ibm.commerce.cmc.catalogs.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ibm.commerce.cmc.base.TestBase;
import com.ibm.commerce.cmc.ui.catalogs.pages.CatalogsHomePage;
import com.ibm.commerce.cmc.ui.catalogs.pages.NewMasterCategoryPage;

public class CatalogsHomePageTest extends TestBase{
	private static Logger log =LogManager.getLogger(CatalogsHomePageTest.class.getName());
	
	CatalogsHomePage catalogsHomePage;
	NewMasterCategoryPage newMasterCategoryPage;
	
	public CatalogsHomePageTest() {
		super();
	}
	
	
	@BeforeClass
	public void setUp() {
		//System.out.println("Before Class in Catalog Home Page Test");
		initialization();
		log.info("Driver is Initialized");
		catalogsHomePage= new CatalogsHomePage();
	}
	
	@Test(priority=1)
	public void catalogHomePageTitleTest() {
		//System.out.println("in cat priority 1 Test");
		String title = catalogsHomePage.getCatalogsPageTitle();
		Assert.assertEquals(title, "Catalogs");
		log.info("Catalogs Home Page Title is validated");
		
	}
	
	@Test(priority=2)
	public void catalogHomePageHeadingTest() {
		String pageHeading = catalogsHomePage.getPageHeading();
		Assert.assertEquals(pageHeading, "Catalog");
	}
	
	@Test(priority=3)
	public void navigatetoNewMasterCategoryPageTest()	{
		//System.out.println("in cat Priority 2 Test");
		newMasterCategoryPage= catalogsHomePage.clickNewMasterCategoryFromFileMenu();
		
	}
	
	
	@AfterClass
	public void tearDown() {
		//System.out.println("in cat teardown");
		driver.close();
	}
}

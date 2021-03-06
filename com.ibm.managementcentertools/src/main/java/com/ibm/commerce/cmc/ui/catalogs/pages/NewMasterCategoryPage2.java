package com.ibm.commerce.cmc.ui.catalogs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.ibm.commerce.cmc.base.TestBase;
import com.ibm.commerce.cmc.ui.utils.TestUtil;

public class NewMasterCategoryPage2 extends TestBase{

	public NewMasterCategoryPage2(){
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//span[@class='mstrCtgry']")
	WebElement newMasterCategoryPageHeader;
	
	@FindBy(xpath="//button[text()='Save and Preview']")
	WebElement saveandPreview;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement save;
	
	@FindBy(xpath="//button[text()='Close']")	
	WebElement close;
	
	@FindBy(id="n-tab-0-header")	
	WebElement manageCategoryTab;
	
	@FindBy(id="n-tab-1-header")
	WebElement searchEngineOptimizationTab;
	
	@FindBy(id="n-tab-2-header")
	WebElement associatedAssetsTab;
	
	
	@FindBy(id="n-tab-3-header")
	WebElement contentTab;
	
	@FindBy(id="n-tab-4-header")
	WebElement referencesTab;
	
	@FindBy(xpath="//p[text()='Object Properties']")	
	WebElement objectPropertiesAccordion;
	
	@FindBy(xpath="//p[text()='General Category Information']")
	WebElement generalCategoryInformationAccordion;
	
	@FindBy(xpath="//p[text()='Display']")	
	WebElement displayAccordion;
	
	
		
	/*
	 * Following are the elements under Object Properties Accordion of New Master Category Page
	 */
	
	@FindBy(xpath="//ul[@class='bx--accordion']/ibm-accordion-item[1]/div/div/div[1]")
	WebElement associatedStoreFieldText;
	
	@FindBy(xpath="//ul[@class='bx--accordion']/ibm-accordion-item[1]/div/div/div[2]")
	WebElement associatedStoreDisplayed; 
	
	
	/*
	 * Following are the elements under General Category Information Accordion of New Master Category Page
	 */
	
	
	@FindBy(xpath="//ul[@class='bx--accordion']/ibm-accordion-item[2]/div/div[1]/div")
	WebElement uniqueIdCodeFieldText;
	
	@FindBy(xpath="//ul[@class='bx--accordion']/ibm-accordion-item[2]/div/div[2]/input")
	WebElement uniqueIdCodeInputField;
	
	@FindBy(xpath="//ul[@class='bx--accordion']/ibm-accordion-item[2]/div/div[3]/div/span")
	WebElement nameUSEnglishFieldText;
	
	@FindBy(xpath="//ul[@class='bx--accordion']/ibm-accordion-item[2]/div/div[3]/input")
	WebElement nameUSEnglishInputField;

	@FindBy(xpath="//ul[@class='bx--accordion']/ibm-accordion-item[2]/div/div[4]/div/span")
	WebElement shortDescriptionFieldText;

	@FindBy(xpath="//*[@id='accordion-item-1']/div[4]/input")
	WebElement shortDescriptionInputField;
	//*[@id="accordion-item-1"]/div[4]/input
	//*[@id="accordion-item-1"]/div[4]/input
	
	/*
	 * Following are the elements under Display Accordion of New Master Category Page
	 */
	
	@FindBy(xpath="//ul[@class='bx--accordion']/ibm-accordion-item[3]/div/div[1]/div")
	WebElement displayToCustomerFieldText;
	
	//*[@id="checkbox-0"]
	//ul[@class='bx--accordion']/ibm-accordion-item[3]/div/div[1]/ibm-checkbox/label
	//*[@id="accordion-item-2"]/div[1]/ibm-checkbox/label
	@FindBy(xpath="//*[@id='accordion-item-2']/div[1]/ibm-checkbox/label")	
	WebElement displayToCustomerCheckbox;
	
	@FindBy(xpath="//ul[@class='bx--accordion']/ibm-accordion-item[3]/div/div[2]/div")
	WebElement thumbnailFieldText;
	
	@FindBy(xpath="//ul[@class='bx--accordion']/ibm-accordion-item[3]/div/div[2]/input")
	WebElement thumbnailInputField;
	
	@FindBy(xpath="//ul[@class='bx--accordion']/ibm-accordion-item[3]/div/div[3]/div")	
	WebElement fullImageFieldText;
	
	@FindBy(xpath="//ul[@class='bx--accordion']/ibm-accordion-item[3]/div/div[3]/input")
	WebElement fullImageInputField;
	
	
	
	/*
	 * Following are the elements under Search Engine Optimization tab of New Master Category Page
	 */
	
	
	@FindBy(xpath="//*[@id='n-tab-1']/div/div/div[1]/div")
	 WebElement urlKeywordFieldText;
	
	@FindBy(xpath="//*[@id='n-tab-1']/div/div/div[1]/input")
	 WebElement urlKeywordInputField;
	
	
	
	@FindBy(xpath="//*[@id='n-tab-1']/div/div/div[2]/div[1]")	
	 WebElement pageTitleFieldText;
	
	@FindBy(xpath="//*[@id='n-tab-1']/div/div/div[2]/div[2]/div[1]/div/ibm-radio/label")
	 WebElement pageTitleUseDefaultRadioText;
	
	@FindBy(xpath="//*[@id='n-tab-1']/div/div/div[2]/div[2]/div[1]/div/ibm-radio/label/span")
	 WebElement pageTitleUseDefaultRadioButton;
	
	@FindBy(xpath="//*[@id='n-tab-1']/div/div/div[2]/div[2]/div[2]/div/ibm-radio/label")
	 WebElement pageTitleOverrideDefaultRadioText;

	@FindBy(xpath="//*[@id='n-tab-1']/div/div/div[2]/div[2]/div[2]/div/ibm-radio/label/span")
	 WebElement pageTitleOverrideDefaultRadioButton;
	 
	 @FindBy(xpath="//*[@id='n-tab-1']/div/div/div[2]/div[2]/div[3]/input")
	 WebElement pageTitleOverrideDefaultInputField;

	 
	 
	 @FindBy(xpath="//*[@id='n-tab-1']/div/div/div[3]/div[1]")
	 WebElement metaDescriptionFieldText;
	
	 @FindBy(xpath="//*[@id='n-tab-1']/div/div/div[3]/div[2]/div[1]/div/ibm-radio/label")
	 WebElement metaDescriptionUseDefaultRadioText;
	 
	 @FindBy(xpath="//*[@id='n-tab-1']/div/div/div[3]/div[2]/div[1]/div/ibm-radio/label/span")
	 WebElement metaDescriptionUseDefaultRadioButton;
	 
	 @FindBy(xpath="//*[@id='n-tab-1']/div/div/div[3]/div[2]/div[2]/div/ibm-radio/label")
	 WebElement metaDescriptionOverrideDefaultRadioText;
	 
	 @FindBy(xpath="//*[@id='n-tab-1']/div/div/div[3]/div[2]/div[2]/div/ibm-radio/label/span")
	 WebElement metaDescriptionOverrideDefaultRadioButton;
	 
	 @FindBy(xpath="//*[@id='n-tab-1']/div/div/div[3]/div[2]/div[3]/textarea")
	 WebElement metaDescriptionOverrideDefaultInputField;



	 @FindBy(xpath="//*[@id='n-tab-1']/div/div/div[4]/div[1]")
	 WebElement imageAltText;
	 
	 @FindBy(xpath="//*[@id='n-tab-1']/div/div/div[4]/div[2]/div[1]/div/ibm-radio/label")
	 WebElement imageAltTextUseDefaultRadioText;
	 
	 @FindBy(xpath="//*[@id='n-tab-1']/div/div/div[4]/div[2]/div[1]/div/ibm-radio/label/span")
	 WebElement imageAltTextUseDefaultRadioButton;
	 
	 @FindBy(xpath="//*[@id='n-tab-1']/div/div/div[4]/div[2]/div[2]/div/ibm-radio/label")
	 WebElement imageAltTextOverrideDefaultRadioText;
	 
	 @FindBy(xpath="//*[@id='n-tab-1']/div/div/div[4]/div[2]/div[2]/div/ibm-radio/label/span")
	 WebElement imageAltTextOverrideDefaultRadioButton;
	 
	 @FindBy(xpath="//*[@id='n-tab-1']/div/div/div[4]/div[2]/div[3]/input")
	 WebElement imageAltTextOverrideDefaultInputField;


	 /*
	  * Following are the elements under Associated Assets tab of New Master Category Page
	  */
	
	 @FindBy(xpath="//*[@id='n-tab-2']/div")
		WebElement associatedAssetsFieldText;

	 
	 
	 /*
	  * Following are the elements under Content tab of New Master Category Page
	  */
	
	
	 /*
	  * Following are the elements under References tab of New Master Category Page
	  */
	
	
	
	
	
	public String getNewMasterCategoryPageHeading() {
		String pageHeading = newMasterCategoryPageHeader.getText();
		return pageHeading;
	}
	
	public boolean isSaveandPreviewButtonDisplayed() {
		
		return TestUtil.isElementDisplayed(saveandPreview);
	}
	
	public boolean isSaveButtonDisplayed() {
		
		return TestUtil.isElementDisplayed(save);
	}
	
	public boolean isCloseButtonDisplayed() {
		
		return TestUtil.isElementDisplayed(close);
	}
	
	
	public boolean isManageCategoryTabExists() {
		//return manageCategoryTab.isDisplayed();
		return TestUtil.isElementDisplayed(manageCategoryTab);
	}
	
	
	public boolean isSearchEngineOptimizationTabExists() {
		//return searchEngineOptimizationTab.isDisplayed();
		return TestUtil.isElementDisplayed(searchEngineOptimizationTab);
	}
	
	public boolean isAssociatedAssetsTabExists() {
		//return associatedAssetsTab.isDisplayed();
		return TestUtil.isElementDisplayed(associatedAssetsTab);
	}
	
	public boolean isContentTabExists() {
		//return contentTab.isDisplayed();
		return TestUtil.isElementDisplayed(contentTab);

	}
	
	public boolean isReferencesTabExists() {
		//return referencesTab.isDisplayed();
		return TestUtil.isElementDisplayed(referencesTab);

	}
	
	public void clickManageCategoryTab() {
		//manageCategoryTab.click();
		TestUtil.clickOnElement(manageCategoryTab);
	}
	
	public void clickSearchEngineOptimazationTab() {
		//searchEngineOptimizationTab.click();
		TestUtil.clickOnElement(searchEngineOptimizationTab);

	}
	
	public void clickAssociatedAssertsTab() {
		//associatedAssetsTab.click();
		TestUtil.clickOnElement(associatedAssetsTab);

	}
	
	public void clickContentTab() {
		//contentTab.click();
		TestUtil.clickOnElement(contentTab);

	}
	
	public void clickReferencesTab() {
		//referencesTab.click();
		TestUtil.clickOnElement(referencesTab);

	}


	
	public void clickObjectPropertiesAccordion() {
		//objectPropertiesAccordion.click();
		TestUtil.clickOnElement(objectPropertiesAccordion);

	}
	
		
	public String getAssociatedStoreFieldText() {
		//return associatedStoreFieldText.getText();
		return TestUtil.getElementText(associatedStoreFieldText);
	}
	
	
	public String getAssociatedStoreDisplayed() {
		//return associatedStoreDisplayed.getText();
		return TestUtil.getElementText(associatedStoreDisplayed);

	}
	
	public void clickGeneralCategoryInformationAccordion() {
		//generalCategoryInformationAccordion.click();
		TestUtil.clickOnElement(generalCategoryInformationAccordion);

	}
	
	public void clickDisplayAccordion() {
		//displayAccordion.click();
		TestUtil.clickOnElement(displayAccordion);

	}
	
	public String getUniqueIDCodeFieldText() {
		//return uniqueIdCodeFieldText.getText();
		return TestUtil.getElementText(uniqueIdCodeFieldText);

	}
	
	public String getNameFieldText() {
		//return nameUSEnglishFieldText.getText();
		return TestUtil.getElementText(nameUSEnglishFieldText);

	}
	
	public String getShortDescriptionFieldText() {
		//return shortDescriptionFieldText.getText();
		return TestUtil.getElementText(shortDescriptionFieldText);
	}
	
	
	
	public  void inputGeneralCategoryInformation(String categoryId, String categoryName, String categoryDescription) {
		uniqueIdCodeInputField.sendKeys(categoryId);
		nameUSEnglishInputField.sendKeys(categoryName);
		shortDescriptionInputField.sendKeys(categoryDescription);
		
	}
	
	public String getDisplayToCustomerFieldText() {
		//return displayToCustomerFieldText.getText();
		return TestUtil.getElementText(displayToCustomerFieldText);

	}
	
	public String getThumbnailFieldText() {
		//return thumbnailFieldText.getText();
		return TestUtil.getElementText(thumbnailFieldText);

	}
	
	public String getFullImageFieldText() {
		//return fullImageFieldText.getText();
		return TestUtil.getElementText(fullImageFieldText);

	}
	
	
	public void inputDisplayInformation(String thumbnail, String fullImage) {
		displayToCustomerCheckbox.click();
		thumbnailInputField.sendKeys(thumbnail);
		fullImageInputField.sendKeys(fullImage);
		
	}
	
	public String getURLKeywordFieldText() {
		//return urlKeywordFieldText.getText();
		return TestUtil.getElementText(urlKeywordFieldText);

	}
	
	
	
	
	public String getPageTileFieldText() {
		//return pageTitleFieldText.getText();
		return TestUtil.getElementText(pageTitleFieldText);

	}
	
	public String getPageTitleUseDefaultRadioText() {
		//return pageTitleUseDefaultRadioText.getText();
		return TestUtil.getElementText(pageTitleUseDefaultRadioText);

	}
	
	public boolean isPageTitleUseDefaultRadioSelected() {
		return TestUtil.isElementSelected(pageTitleUseDefaultRadioButton);
		
	}
	
	
	public String getPageTitleOverrideDefaultRadioText() {
		//return pageTitleOverrideDefaultRadioText.getText();
		return TestUtil.getElementText(pageTitleOverrideDefaultRadioText);

	}
	
	public boolean isPageTitleOverrideDefaultRadioSelected() {
		return TestUtil.isElementSelected(pageTitleOverrideDefaultRadioButton);
	}
	
	
	public void clickOnPageTitleOverrideDefaultInputField() {
		TestUtil.clickOnElement(pageTitleOverrideDefaultInputField);
	}
	
	
	
	public String getMetaDescriptionFieldText() {
		//return metaDescriptionFieldText.getText();
		return TestUtil.getElementText(metaDescriptionFieldText);

	}
	
	public String getMetaDescriptionUseDefaultRadioText() {
		//return metaDescriptionUseDefaultRadioText.getText();
		return TestUtil.getElementText(metaDescriptionUseDefaultRadioText);

	}
	public boolean isMetaDescriptionUseDefaultRadioSelected() {
		return TestUtil.isElementSelected(metaDescriptionUseDefaultRadioButton);
	}
	
	
	public String getMetaDescriptionOverrideDefaultRadioText() {
		//return metaDescriptionOverrideDefaultRadioText.getText();
		return TestUtil.getElementText(metaDescriptionOverrideDefaultRadioText);

	}
	public boolean isMetaDescriptionOverrideDefaultRadioSelected() {
		return TestUtil.isElementSelected(metaDescriptionOverrideDefaultRadioButton);
	}
	
	public void clickOnMetaDescriptionOverrideDefaultInputField() {
		TestUtil.clickOnElement(metaDescriptionOverrideDefaultInputField);
	}
	
	
	public String getImageAltTextFieldText() {
		//return imageAltText.getText();
		return TestUtil.getElementText(imageAltText);

	}
	
	public String getImageAltUseDefaultRadioText() {
		//return imageAltTextUseDefaultRadioText.getText();
		return TestUtil.getElementText(imageAltTextUseDefaultRadioText);

	}
	public boolean isImageAltTextUseDefaultRadioSelected() {
		return TestUtil.isElementSelected(imageAltTextUseDefaultRadioButton);
	}
	
	public String getImageAltOverrideDefaultRadioText() {
		//return imageAltTextOverrideDefaultRadioText.getText();
		return TestUtil.getElementText(imageAltTextOverrideDefaultRadioText);

	}
	public boolean isImageAltTextOverrideDefaultRadioSelected() {
		return TestUtil.isElementSelected(imageAltTextOverrideDefaultRadioButton);
	}
	
	public void clickOnImageAltTextOverrideDefaultInputField() {
		TestUtil.clickOnElement(imageAltTextOverrideDefaultInputField);
	}
	
	public void inputSearchEngineOptimizationInformation(String urlKeyword, String pageTitle, String metaDescription, String imageAltText) {
		urlKeywordInputField.sendKeys(urlKeyword);
		pageTitleOverrideDefaultInputField.sendKeys(pageTitle);
		metaDescriptionOverrideDefaultInputField.sendKeys(metaDescription);
		imageAltTextOverrideDefaultInputField.sendKeys(imageAltText);
		
	}
	
	public void clickOnSaveandPreviewButton() {
		TestUtil.clickOnElement(saveandPreview);
	}
	
	public void clickOnSaveButton() {
		TestUtil.clickOnElement(save);
	}
	
	public void clickOnCloseButton() {
		TestUtil.clickOnElement(close);
	}
	
	
}
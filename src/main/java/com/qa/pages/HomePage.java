package com.qa.pages;

import com.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(xpath=".//*[@id='top-header-menu']/div[2]/span[1]")
    //@CacheLookup
            WebElement userNameLabel;

    @FindBy(xpath="//a[contains(text(), 'Contacts')]")
    WebElement contactsLink;

    @FindBy(xpath="//a[contains(text(), 'New Contact')]")
    WebElement newContactsLink;

    @FindBy(xpath="//a[contains(text(), 'Deals')]")
    WebElement dealsLink;

    @FindBy(xpath="//a[contains(text(), 'Tasks'])")
    WebElement tasksLink;

    //Initializing Page Objects/OR:
    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public String verifyHomePageTitle(){
        return driver.getTitle();

    }

    public String verifyCorrectUserName() {
        // TODO Auto-generated method stub
        return  userNameLabel.getText();
    }

    public void clickOnNewContactlink() {
        Actions action = new Actions(driver);
        action.moveToElement(contactsLink).build().perform();
        newContactsLink.click();

    }

}

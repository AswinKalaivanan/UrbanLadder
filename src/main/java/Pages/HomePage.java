package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class HomePage {


    @FindBy(xpath = "//*[@class='subnav_item 14423']/a/span")
    WebElement kidsstrogecabinet;

    @FindBy(xpath = "//*[@class='subnav_item 14417']/a/span")
    WebElement kidsbunkbed;

    @FindBy(xpath = "//*[@class='withsubtext']")
    WebElement assertbunkbed;



    public void assertStorageCabinet()
    {
        Assert.assertEquals("kids storage cabinet not vissible",true,kidsstrogecabinet.isEnabled());
    }
    public void clickBunkBeds()
    {
        kidsbunkbed.click();
    }
    public void assertBunkBeds()
    {
        Assert.assertEquals("Not in Bunk Beds Page",true,assertbunkbed.isDisplayed());
    }

}

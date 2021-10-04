package Pages;

import io.cucumber.java.bs.A;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class KidsBunkBeds {
    @FindBy(xpath = "//*[@id='filters_availability_In_Stock_Only']")
    WebElement OutOfStock;

    @FindBy(xpath = "(//*[@class='text'])[1]")
    WebElement assertStock;

    @FindBy(xpath = "(//*[@class='gname'])[2]")
    WebElement sort;

    @FindBy(xpath = "(//*[@class='option'])[3]")
    WebElement price;

    @FindBy(xpath = "(//*[@class='item'])[2]")
    WebElement assertPrice;

    @FindBy(xpath = "(//*[@class='gname'])[1]")
    WebElement filterPrice;

    @FindBy(xpath = "//*[@id='price_limit_35000-38496']")
    WebElement radio1;

    @FindBy(xpath = "//*[@id='price_limit_38497-41992']")
    WebElement radio2;

    @FindBy(xpath = "//*[@id='price_limit_41993-45488']")
    WebElement radio3;

    @FindBy(xpath = "//input[@value='45489-48984']")
//    @FindBy(xpath = "//*[@id='price_limit_45489-48984']")
    WebElement radio4;

    @FindBy(xpath = "//*[@id='price_limit_48985-52480']")
    WebElement radio5;

    @FindBy(xpath = "//ul[@class='list']")
    WebElement assertFinal;

    public void clickOutofStock()
    {
        OutOfStock.click();
    }

    public void assertStock()
    {
//        Assert.assertEquals("Check box not clicked",true,OutOfStock.isEnabled());
        Assert.assertEquals("Exclude out of stock not applied",true,assertStock.isEnabled());
    }
    public void clickSort()
    {
        sort.click();
        price.click();
    }
    public void assertPrice() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("Price: High to Low",assertPrice.getText());
    }
    public void clickFilterPrice(WebDriver driver) throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-250)", "");
        Actions act = new Actions(driver);
        act.moveToElement(filterPrice).perform();

    }
    public void assertRadioButtons()
    {
        Assert.assertEquals("Radio button 1 not Enabled",true,radio1.isEnabled());
        Assert.assertEquals("Radio button 2 not Enabled",true,radio2.isEnabled());
        Assert.assertEquals("Radio button 3 not Enabled",true,radio3.isEnabled());
        Assert.assertEquals("Radio button 4 not Enabled",true,radio4.isEnabled());
        Assert.assertEquals("Radio button 5 not Enabled",true,radio5.isEnabled());

    }
    public void clickRadio4(WebDriver driver)
    {
        radio4.click();
    }
    public void assertFinalPrice()
    {
        Assert.assertEquals("Given range Not selected",true,assertFinal.isEnabled());
        Assert.assertEquals("Exclude out of stock not applied",true,assertStock.isEnabled());
    }


}

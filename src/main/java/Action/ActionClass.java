package Action;

import Pages.HomePage;
import Pages.KidsBunkBeds;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ActionClass {
    HomePage homePage;
    KidsBunkBeds kidsBunkBeds;
    WebDriver driver;

    public ActionClass(WebDriver driver)
    {
        this.driver=driver;
        homePage= PageFactory.initElements(driver,HomePage.class);
        kidsBunkBeds=PageFactory.initElements(driver,KidsBunkBeds.class);
    }
    public void hoverKidsRoom()
    {
        homePage.hoverKidsRoom(driver);
    }
    public void assertStorageCabinet()
    {
        homePage.assertStorageCabinet();
    }
    public void clickBunkBeds()
    {
        homePage.clickBunkBeds();
    }
    public void assertBunkBeds()
    {
        homePage.assertBunkBeds();
    }
    public void clickOutofStock()
    {
        kidsBunkBeds.clickOutofStock();
    }
    public void assertStock()
    {
        kidsBunkBeds.assertStock();
    }
    public void clickSort()
    {
        kidsBunkBeds.clickSort();
    }
    public void assertPrice() throws InterruptedException {
        kidsBunkBeds.assertPrice();
    }
    public void clickFilterPrice() throws InterruptedException {
        kidsBunkBeds.clickFilterPrice(driver);
    }
    public void assertRadioButtons()
    {
        kidsBunkBeds.assertRadioButtons();
    }
    public void clickRadio4()
    {
        kidsBunkBeds.clickRadio4(driver);
    }
    public void assertFinalPrice()
    {
        kidsBunkBeds.assertFinalPrice();
    }


}

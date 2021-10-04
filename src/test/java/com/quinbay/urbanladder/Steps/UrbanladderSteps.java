package com.quinbay.urbanladder.Steps;

import Action.ActionClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UrbanladderSteps {
    WebDriver driver;
    ActionClass actionClass;
    @Given("I am on Urbanladder Home page")
    public void iAmOnUrbanladderHomePage()
    {
        System.setProperty("webdriver.chrome.driver","/Users/apaswinkalaivanan/IdeaProjects/UrbanLadder/src/main/resources/chromedriver");
        System.setProperty("webdriver.chrome.driver", "/Users/apaswinkalaivanan/IdeaProjects/BliBliAddToCart/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.urbanladder.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        actionClass = new ActionClass(driver);
    }

    @When("I hover Kids room")
    public void iHoverKidsRoom() {
        actionClass.hoverKidsRoom();
    }

    @Then("Check Kids Storage Cabinets")
    public void checkKidsStorageCabinets() {
        actionClass.assertStorageCabinet();
    }

    @And("I click kids bunk beds")
    public void iClickKidsBunkBeds() {
        actionClass.clickBunkBeds();
    }

    @Then("Check the current page as Kids Bunk Beds")
    public void checkTheCurrentPageAsKidsBunkBeds() {
        actionClass.assertBunkBeds();
    }

    @And("I click on exclude out of stock")
    public void iClickOnExcludeOutOfStock() {
        actionClass.clickOutofStock();
    }

    @Then("Check checkbox clicked")
    public void checkCheckboxClicked() {
        actionClass.assertStock();
    }

    @And("I click sort")
    public void iClickSort() {
        actionClass.clickSort();
    }

    @Then("Assert whether price:High to Low applied")
    public void assertWhetherPriceHighToLowApplied() throws InterruptedException {
        actionClass.assertPrice();
    }

    @And("I click price filter")
    public void iClickPriceFilter() throws InterruptedException {
        actionClass.clickFilterPrice();
    }

    @And("Close Driver")
    public void closeDriver() {
        driver.close();
    }

    @Then("Assert Radio buttons")
    public void assertRadioButtons() {
        actionClass.assertRadioButtons();
    }

    @And("I click on price range")
    public void iClickOnPriceRange() {
        actionClass.clickRadio4();
    }

    @Then("Assert Final Price")
    public void assertFinalPrice() {
        actionClass.assertFinalPrice();
    }
}

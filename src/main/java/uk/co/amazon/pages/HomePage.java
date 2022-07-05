package uk.co.amazon.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.amazon.utility.Utility;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='sp-cc-accept']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(xpath = "//select[@id='searchDropdownBox']")
    WebElement searchDropdown;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"searchDropdownBox\"]/option[12]")
    WebElement Books;

    @CacheLookup
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    WebElement searchbox;

    @CacheLookup
    @FindBy(id = "nav-search-submit-button")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]")
    List<WebElement> listOgBooks;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[10]")
    List<WebElement> hardcoverBook;

    public void clickOnAcceptCookies() {
        log.info("I clicked on Accept cookies: " + acceptCookies.toString());
        clickOnElement(acceptCookies);
    }

    public void clickOnsearchDropdown() {
        log.info("I click on search in dropdown : " + searchDropdown.toString());
        clickOnElement(searchDropdown);
    }

    public void selectBooks(String books) {
        log.info("I select books from the dropdown : " + Books.toString());
        selectByVisibleTextFromDropDown(searchDropdown, books);
    }

    public void enterBitcoinInsearchBox(String searchText) {
        log.info("Enter Bitcoin in the search : " + searchText.toString());
        sendTextToElement(searchbox, searchText);
    }

    public void clickOnSearchButton() {
        log.info("I clicked on search Button:" + searchButton.toString());
        clickOnElement(searchButton);
    }

//    public void booksList() {
//        for (WebElement menu : listOgBooks) {
//            //System.out.println(menu.getText());
//            if (menu.getText().contains("The Bitcoin Standard – The Decentralized Alternative to Central Banking")) {
//                {
//                    if (menu.getText().contains("Hardcover")) {
//                        System.out.println("true");
//                    }
//                }
//
//            }
//        }
//
//    }


    public void findbook()
    {
      //  System.out.println(hardcoverBook.getText());
        for(WebElement element : hardcoverBook)
        {
            System.out.println(element.getText() + "+++++++++++");
        }
    }
}
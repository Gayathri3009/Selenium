package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AmazonSite {
    WebDriver driver;

    public AmazonSite() {
        this.driver = Driverfactory.getdriver();
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement searchBox;
    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    public WebElement searchButton;
    @FindBy(xpath = "//span[@id='productTitle']")
    public WebElement productName;

    @FindBy(xpath="//span[@class='a-price-whole']/preceding::div[@class = 'a-section a-spacing-none puis-padding-right-small s-title-instructions-style']")
    public List<WebElement> prodName;



    public void Search(String laptop) {
        searchBox.sendKeys(laptop);
        searchButton.click();
    }

    public void OrderBy() {
        List<WebElement> priceElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < priceElements.size(); i++) {
            CommonMethods.scrollToElement(driver, priceElements.get(i));

            if (priceElements.get(i).getText() != null) {

                map.put(prodName.get(i).getText(), Integer.parseInt(priceElements.get(i).getText().replaceAll(",", "")));
            }

        }



        List<Map.Entry<String, Integer>> le = new ArrayList<>(map.entrySet());
        le.sort(Map.Entry.comparingByValue());
        for (Map.Entry e : le) {
            System.out.println(e.getValue());

        }


        int highPrice = le.get(le.size()-1).getValue();
        String highPriceProduct=le.get(le.size()-1).getKey();
        System.out.println("highest price: " + highPrice);
        System.out.println("Product name:"+highPriceProduct);
        /*le.get(le.size() - 1).getKey().click();
        CommonMethods.switchToTab(driver, 2);
        productName.getText();
        System.out.println("productname:" + productName.getText());*/



    }
}















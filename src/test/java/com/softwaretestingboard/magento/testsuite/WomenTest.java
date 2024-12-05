package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.WomenMenuPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {
    WomenMenuPage womenMenuPage= new WomenMenuPage();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        // Accept Consent
        womenMenuPage.acceptConsent();
        // Mouse Hover on the ‘Women’ Menu
        womenMenuPage.hoverOnWomenMenu();
        // Mouse Hover on the ‘Tops’
        womenMenuPage.hoverOnTops();
        // Click on the ‘Jackets’
        womenMenuPage.clickOnJackets();
       // List<String> jacketsNameListBefore = womenMenuPage.getJacketsNamesList();
        // Select Sort By filter “Product Name”
        womenMenuPage.selectSortByFilter("Product Name");
        Thread.sleep(1000);
        // Get Jackets Names After Sorting
       // List<String> jacketsNameListAfter = womenMenuPage.getJacketsNamesList();
        Thread.sleep(1000);
        // Verify the jackets names are sorted in alphabetical order
       // womenMenuPage.verifySortedOrder(jacketsNameListBefore, jacketsNameListAfter);
    }


    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {
        // Accept Consent
        womenMenuPage.acceptConsent();
        // Mouse Hover on the ‘Women’ Menu
        womenMenuPage.hoverOnWomenMenu();
        // Mouse Hover on the ‘Tops’
        womenMenuPage.hoverOnTops();
        // Click on the ‘Jackets’
        womenMenuPage.clickOnJackets();
        // Select Sort By filter “Price”
        womenMenuPage.selectSortByFilter("Price");
        Thread.sleep(1000);
        // Verify the product price displayed in Low to High
        // Verify that the products are sorted by price in ascending order
    }
}

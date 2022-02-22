package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductPage {
    Methods methods;
    Random rand = new Random();
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage() {
        methods = new Methods();
    }

    public void selectProduct() {
        methods.sendKey(By.id("search-input"), "oyuncak");
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(3);

        methods.scrollWithAction(By.xpath("//div[@class='product-list']//div[@class='product-cr'][7]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][5]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][6]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][7]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][8]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);

        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='product-list']//div[@class='product-cr'][5]//i[@class='fa fa-heart red']")));
        methods.waitBySeconds(1);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='product-list']//div[@class='product-cr'][6]//i[@class='fa fa-heart red']")));
        methods.waitBySeconds(1);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='product-list']//div[@class='product-cr'][7]//i[@class='fa fa-heart red']")));
        methods.waitBySeconds(1);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='product-list']//div[@class='product-cr'][8]//i[@class='fa fa-heart red']")));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//img[@title='kitapla buluşmanın en kolay yolu!']"));
        methods.waitBySeconds(1);
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".menu.top.login>ul>li>a"));
        methods.waitBySeconds(5);
        methods.click(By.xpath("//span[text()='Favorilerim']"));
        methods.waitBySeconds(5);
        methods.click(By.cssSelector("img[alt='kitapyurdu.com']"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".lvl1catalog"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector("img[title='Puan Kataloğundaki Türk Klasikleri']"));

        methods.waitBySeconds(3);
        methods.selectByText(By.cssSelector("div[class='sort']>select[onchange='location = this.value;']"), "Yüksek Oylama");
        methods.waitBySeconds(3);
        methods.click(By.xpath("//span[text()='Tüm Kitaplar']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//a[text()='Hobi']"));

        methods.waitBySeconds(3);
        selectRandomProduct();
        methods.click(By.xpath("//span[text()='Sepete Ekle']"));
        //clickRandomProduct();
        //listemelerden favori
        methods.scrollWithAction(By.xpath(("//a[@class = 'common-sprite' and contains(text(), 'Listelerim')]")));
        methods.click(By.linkText("Favorilerim"));
        methods.waitBySeconds(3);

        methods.click(By.xpath("//div[@class='product-cr'][3]//i[@class='fa fa-heart-o']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//h4[text()='Sepetim']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//a[@id='js-cart']"));
        methods.waitBySeconds(1);
        methods.findElement(By.xpath("//input[@name='quantity']")).clear();
        methods.waitBySeconds(1);
        methods.sendKey(By.xpath("//input[@name='quantity']"), "4");
        methods.waitBySeconds(1);
        methods.clickWithJavaScript(By.xpath("//i[@title='Güncelle']"));
        methods.waitBySeconds(1);
        methods.click(By.cssSelector("div[class='right']>a[class='button red']")); //satın alma
        methods.waitBySeconds(1);

        methods.sendKey(By.id("address-firstname-companyname"), "Eda");
        methods.waitBySeconds(1);
        methods.sendKey(By.id("address-lastname-title"), "Ayan");
        methods.waitBySeconds(1);
        methods.selectByText(By.cssSelector("#address-zone-id"), "İstanbul");
        methods.waitBySeconds(1);
        methods.selectByText(By.cssSelector("#address-county-id"), "PENDİK");
        methods.waitBySeconds(1);
        methods.sendKey(By.id("address-address-text"), "Testinium");
        methods.waitBySeconds(1);
        methods.sendKey(By.id("address-telephone"), "1111111111");
        methods.waitBySeconds(1);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(5);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(3);
        methods.sendKey(By.id("credit-card-owner"), "Eda Ayan");
        methods.sendKey(By.id("credit_card_number_1"), "1111");
        methods.sendKey(By.id("credit_card_number_2"), "1111");
        methods.sendKey(By.id("credit_card_number_3"), "1111");
        methods.sendKey(By.id("credit_card_number_4"), "1111");
        methods.waitBySeconds(1);
        methods.sendKey(By.id("credit-card-expire-date-month"), "01");
        methods.waitBySeconds(1);
        methods.sendKey(By.id("credit-card-expire-date-year"), "2025");
        methods.waitBySeconds(1);
        methods.sendKey(By.id("credit-card-security-code"), "112");
        methods.waitBySeconds(1);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(1);
        String errorText = methods.getText(By.cssSelector("#form-credit-card > div.credit-card-form-content > table > tbody > tr:nth-child(5) > td > span"));
        if (errorText != null) {
            System.out.println(errorText);
            methods.click(By.cssSelector("#logo > a > img"));//Homepage
            //Logout
            methods.scrollWithJavaScript(By.cssSelector("#header-top > div > div.welcome.fl > div.menu.top.login > ul > li > a"));
            methods.clickWithJavaScript(By.cssSelector("#header-top > div > div.welcome.fl > div.menu.top.login > ul > li > div > ul > li:nth-child(4) > a"));
        } else if (errorText == null) {
            System.out.println("Satın alma işlemi gerçekleşiyor.");
        }
        methods.click(By.cssSelector("#header-top>.container_12>.welcome.fl>.menu.top.login"));
        methods.scrollWithAction(By.cssSelector("#header-top > div > div.welcome.fl > div.menu.top.login > ul > li > a"));
        methods.clickWithJavaScript(By.cssSelector("#header-top > div > div.welcome.fl > div.menu.top.login > ul > li > div > ul > li:nth-child(4) > a"));


    }




    public void selectRandomProduct() {
        List<WebElement> productList = methods.findElements(By.cssSelector(".pr-img-link"));
        // List<WebElement> productList = methods.findAllElements(By.cssSelector(".add-to-cart"));
        int randNum = rand.nextInt(productList.size()); //0 - productList.size()
        productList.get(randNum).click();
    }

}

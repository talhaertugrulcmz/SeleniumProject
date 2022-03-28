package com.testinium.seleniumproject.page;

import com.testinium.seleniumproject.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage() {
        methods = new Methods();
    }

    public void selectProduct() {
        methods.sendKeys(By.id("search-input"), "Oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(2);
        methods.scrollWithAction(By.xpath("(//*[@class='product-cr'])[8]"));
        methods.waitBySeconds(1);

        methods.scrollWithAction(By.xpath("(//*[@class='fa fa-heart'])[5]"));
        methods.findElement(By.xpath("(//*[@class='fa fa-heart'])[5]")).click();
        methods.waitBySeconds(1);

        methods.scrollWithAction(By.xpath("(//*[@class='fa fa-heart'])[6]"));
        methods.findElement(By.xpath("(//*[@class='fa fa-heart'])[6]")).click();
        methods.waitBySeconds(1);

        methods.scrollWithAction(By.xpath("(//*[@class='fa fa-heart'])[7]"));
        methods.findElement(By.xpath("(//*[@class='fa fa-heart'])[7]")).click();
        methods.waitBySeconds(1);

        methods.scrollWithAction(By.xpath("(//*[@class='fa fa-heart'])[8]"));
        methods.findElement(By.xpath("(//*[@class='fa fa-heart'])[8]")).click();
        methods.waitBySeconds(1);

        methods.findElement(By.xpath("//*[@id='header-bottom']//div[@class='logo-text']")).click();
        methods.waitBySeconds(1);

        methods.findElement(By.xpath("//*[@class='lvl1catalog']")).click();
        methods.waitBySeconds(1);

        methods.findElement(By.xpath("//*[@title='Puan Kataloğundaki Türk Klasikleri']")).click();
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("//*[@class='sort']//select//option[contains(text(),\"Yüksek Oylama\")]")).click();
        methods.waitBySeconds(2);
        methods.hoverElement(By.xpath("(//*[contains(text(),\"Tüm Kitaplar\")])[3]"));
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("//a[contains(@href, 'kategori/kitap-hobi/1_212.html')]")).click();
        methods.waitBySeconds(2);

        methods.hoverElement(By.xpath("//div[@class=\"menu top my-list\"]//a[@class=\"common-sprite\"]"));
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("//a[contains(@href, 'https://www.kitapyurdu.com/index.php?route=account/favorite&selected_tags=0')]")).click();
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("(//*[@class=\"fa fa-heart-o\"])[3]\n")).click();
        methods.waitBySeconds(3 );
        methods.findElement(By.cssSelector("#cart-items")).click();
        methods.waitBySeconds(3);
        methods.findElement(By.cssSelector("#js-cart")).click();
        methods.waitBySeconds(3);
        methods.findElement(By.cssSelector("[name=\"quantity\"]")).clear();
        methods.waitBySeconds(2);
        methods.findElement(By.cssSelector("[name=\"quantity\"]")).sendKeys("7");
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("//*[@class=\"fa fa-refresh green-icon\"] ")).click();
        methods.waitBySeconds(5);
        methods.findElement(By.cssSelector(".right>a")).click();
        methods.waitBySeconds(1);
        methods.findElement(By.xpath("//a[contains(@href, '#tab-shipping-new-adress')]\t")).click();
        methods.waitBySeconds(1);
        methods.findElement(By.cssSelector("[name=\"firstname_companyname\"]")).sendKeys("Talha Ertuğrul");
        methods.waitBySeconds(1);
        methods.findElement(By.cssSelector("[name=\"lastname_title\"]")).sendKeys("Çömez");
        methods.waitBySeconds(1);
        methods.selectByText(By.cssSelector("[name=\"zone_id\"]"),"Kocaeli");
        methods.waitBySeconds(1);
        methods.selectByText(By.cssSelector("[name=\"county_id\"]"),"GEBZE");
        methods.waitBySeconds(1);
        methods.findElement(By.cssSelector("[name=\"district\"]")).sendKeys("Osman Yılmaz Mah. ");
        methods.waitBySeconds(1);
        methods.findElement(By.cssSelector("[name=\"address\"]")).sendKeys("614.Sok. No:17 Daire:6");
        methods.waitBySeconds(1);
        methods.findElement(By.cssSelector("[name=\"postcode\"]")).sendKeys("41400");
        methods.waitBySeconds(1);
        methods.findElement(By.cssSelector("[name=\"telephone\"]")).sendKeys("2124442434");
        methods.waitBySeconds(1);
        methods.findElement(By.cssSelector("[name=\"mobile_telephone\"]")).sendKeys("5312017356");
        methods.waitBySeconds(3);
        methods.findElement(By.xpath("//*[@id=\"button-checkout-continue\"]\t")).click();
        methods.waitBySeconds(3);
        methods.findElement(By.xpath(" //*[@id=\"button-checkout-continue\"]\t")).click();
        methods.waitBySeconds(3);
        methods.findElement(By.cssSelector("[name=\"credit_card_owner\"]")).sendKeys("Talha Ertuğrul Çömez");
        methods.waitBySeconds(1);
        methods.findElement(By.cssSelector("[name=\"credit_card_number_1\"]")).sendKeys("4444");
        methods.waitBySeconds(1);
        methods.findElement(By.cssSelector("[name=\"credit_card_number_2\"]")).sendKeys("5444");
        methods.waitBySeconds(1);
        methods.findElement(By.cssSelector("[name=\"credit_card_number_3\"]")).sendKeys("6444");
        methods.waitBySeconds(1);
        methods.findElement(By.cssSelector("[name=\"credit_card_number_4\"]")).sendKeys("7444");
        methods.waitBySeconds(1);
        methods.selectByText(By.cssSelector("[name=\"credit_card_expire_date_month\"]"),"04");
        methods.waitBySeconds(1);
        methods.selectByText(By.cssSelector("[name=\"credit_card_expire_date_year\"]"),"2025");
        methods.waitBySeconds(2);
        methods.selectByText(By.cssSelector("[name=\"credit_card_security_code\"]"),"756");
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".button>i"));
        methods.waitBySeconds(2);



    }


}
package com.testinium.seleniumproject.test;

import com.testinium.seleniumproject.driver.BaseTest;
import com.testinium.seleniumproject.driver.BaseTest;
import com.testinium.seleniumproject.page.LoginPage;
import com.testinium.seleniumproject.page.ProductPage;
import org.junit.Test;

public class ProductTest  extends BaseTest {

    @Test
    public void productTest(){
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();

        loginPage.login();
        productPage.selectProduct();

    }


    }


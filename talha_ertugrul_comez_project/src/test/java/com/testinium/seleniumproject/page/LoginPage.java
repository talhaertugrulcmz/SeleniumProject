package com.testinium.seleniumproject.page;

import com.testinium.seleniumproject.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {
    Methods methods;

    public LoginPage(){
        methods = new Methods();
    }

    public void login(){
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".menu-top-button.login>a"));
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-email"),"talhaertugrul.comez@testinium.com");
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("login-password"),"115pYDqT");
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(1);
        Assert.assertTrue(methods.isElementVisible(By.cssSelector(".attention")));
    }
}




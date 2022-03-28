package com.testinium.seleniumproject.test;

import com.testinium.seleniumproject.driver.BaseTest;
import com.testinium.seleniumproject.page.LoginPage;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){
        LoginPage LoginPage = new LoginPage();
        LoginPage.login();
    }
}

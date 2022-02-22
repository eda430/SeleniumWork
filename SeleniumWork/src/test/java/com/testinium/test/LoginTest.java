package com.testinium.test;

import com.testinium.page.LoginPage;
import org.junit.Test;

public class LoginTest {
    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }


}

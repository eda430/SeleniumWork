package com.testinium.page;

import com.testinium.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage {
    Methods methods;
    public LoginPage(){
        methods = new Methods();

    }
    public void login(){
        methods.click(By.cssSelector(".menu-top-button.login>a"));
        methods.waitBySeconds(5);
        methods.sendKey(By.id("login-email"),"edanurayan430@gmail.com");
        methods.waitBySeconds(3);
        methods.sendKey(By.id("login-password"),"1q2w3e4r5t");
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(20);
        Assert.assertTrue(methods.isElementVisible(By.cssSelector(".section")));
        methods.waitBySeconds(3);
    }

}

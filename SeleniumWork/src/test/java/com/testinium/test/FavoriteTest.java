package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.FavoritePage;
import com.testinium.page.LoginPage;
import org.junit.Test;

public class FavoriteTest extends BaseTest {
    @Test
    public void FavoriteTest(){
        LoginPage loginPage = new LoginPage();
        FavoritePage favoritePage = new FavoritePage();
        loginPage.login();

        favoritePage.clickFavorite();

    }
}

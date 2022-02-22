package com.testinium.page;

import com.testinium.methods.Methods;
import org.openqa.selenium.By;


public class FavoritePage {
        Methods method;
        public FavoritePage(){
            method = new Methods();

        }
        public void clickFavorite(){

            method.click(By.cssSelector("common-sprite"));
            method.waitBySeconds(5);


        }


    }


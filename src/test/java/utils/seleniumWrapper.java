package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class seleniumWrapper {

    WebDriver driver = new EdgeDriver();

       public boolean clickElement(By locator){
        driver.findElement(locator).click();
        return true;

    }

    //function 2 - isDisplayed
    public boolean displayElement(By locator){
       boolean flag=driver.findElement(locator).isDisplayed();
        return flag;
    }

    //function 3 - quit browser
    public boolean quitElement(){
        driver.quit();
        return true;
    }


    //function 4 - close current tab
    public boolean closeElement() {
        driver.close();
        return true;
    }
}

package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumWrapper {

    public WebDriver driver = new EdgeDriver();

    public boolean clickElement(By locator) {
        driver.findElement(locator).click();
        return true;
    }

    //function 2 - isDisplayed
    public boolean isDisplayed(By locator) {
        return driver.findElement(locator).isDisplayed();

    }

    //function 3 - quit browser
    public boolean quitBrowser() {
        driver.quit();
        return true;
    }

    //function 4 - close current tab
    public boolean closeCurrentBrowserWindow() {
        driver.close();
        return true;
    }

    public int getWindowsCount() {
        return driver.getWindowHandles().size();
    }

    public boolean waitForNumberOfOpenWindowsToBe(int noOfWindows, int timeOutInSeconds){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutInSeconds));
        wait.until(ExpectedConditions.numberOfWindowsToBe(noOfWindows));
        return true;
    }
}

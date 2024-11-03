import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import utils.SeleniumWrapper;


public class SeleniumMain {

    public static void main(String[] args) {
        SeleniumWrapper seleniumWrapper = new SeleniumWrapper();

        //driver.get("https://www.geeksforgeeks.org/");
        //PAN reg number do not delete, do not commit 0165969288, ack no. 881151100765600
        System.setProperty("web driver.edge.driver", "C:\\Users\\GURPREET KAUR\\Downloads\\MyFirstProject\\src\\test\\resources\\drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");
        boolean flag = driver.findElement(By.id("selenium143")).isDisplayed();
        Assert.assertTrue("Home page is not opened", flag);
        driver.findElement(By.id("selenium143")).click();


        seleniumWrapper.waitForNumberOfOpenWindowsToBe(2,10);


        //Check url of new tab is correct to validate the new tab is opened
        //Step 1 - check 2 tabs are open
        int windowsCount = seleniumWrapper.getWindowsCount();
        Assert.assertEquals("Second window not opened", 2, windowsCount);// check /verify/validate means assertion lani

        //Step 2 - Switch to last opened tab (ie 2nd in our case)
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());


        //Step 3 - Get the url of new tab


        //Step 4 - Assert the url got in step 3 matches the expected url
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://selenium143.blogspot.com/";
        // Assert.isTrue(flag,"new page not opened");
        Assert.assertEquals("new page not opened", expectedUrl, actualUrl);
        driver.quit();
        // package name.class name "obj" is the object we created to call functions
        boolean isBrowserClosed = seleniumWrapper.closeCurrentBrowserWindow();
        Assert.assertTrue("browser not closed", isBrowserClosed);
    }
}
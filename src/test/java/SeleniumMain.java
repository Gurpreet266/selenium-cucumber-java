import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import utils.seleniumWrapper;

import java.time.Duration;

public class SeleniumMain {

    public static void main(String[] args) throws InterruptedException {

        //driver.get("https://www.geeksforgeeks.org/");

//         By pageOneLinkLocator = By.linkText("Page One");
//         driver.findElement(pageOneLinkLocator).click();
//        By omyIdLocator = By.id("header-inner");
//        driver.findElement(omyIdLocator).click();
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getPageSource());
//        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getClass());
//        System.out.println(driver.getWindowHandles());
//        System.out.println(driver.getWindowHandle());
//        System.out.println(driver.navigate());
//        System.out.println(driver.manage());
//        System.out.println(driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)));
//        driver.quit();
        // Test 1: verify pageOne new page is opened when user clicks on pageOne link
        // open browser
        System.setProperty("webdriver.edge.driver", "C:\\Users\\GURPREET KAUR\\Downloads\\MyFirstProject\\src\\test\\resources\\drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");
        boolean flag = driver.findElement(By.id("selenium143")).isDisplayed();
        Assert.assertTrue("Home page is not opened",flag);
        driver.findElement(By.id("selenium143")).click();


        //Check url of new tab is correct to validate the new tab is opened
        //Step 1 - check 2 tabs are open
        int windowsCount =  driver.getWindowHandles().size();
        Assert.assertEquals("Second window not opened", 2, windowsCount);

        //Step 2 - Switch to last opened tab (ie 2nd in our case)
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());


        //Step 3 - Get the url of new tab


        //Step 4 - Assert the url got in step 3 matches the expected url
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://selenium143.blogspot.com/";
       // Assert.isTrue(flag,"new page not opened");
        Assert.assertEquals("new page not opened",expectedUrl, actualUrl);
        driver.quit();
        seleniumWrapper obj = new seleniumWrapper(); // package name.class name "obj" is the object we created to call functions
        obj.closeElement();                                      // of the class "seleniumWrapper"

//        // open website
//        driver.get("https://omayo.blogspot.com/");
//
//        // verify home page is opened                   (we will find a unique element i.e. "Page One" as in this e.g.)
//        boolean flag =  driver.findElement(By.linkText("Page One")).isDisplayed();
//        Assert.isTrue(flag,"Home page is not opened");
//
//
//        // click on pageOne link
//        driver.findElement(By.linkText("Page One")).click();
//
//        // verify new pageOne page is opened             (for this check the actualUrl)
//        String actualUrl = driver.getCurrentUrl();
//        String expectedUrl = "https://omayo.blogspot.com/2013/05/page-one.html";
//
//        flag = actualUrl.equals(expectedUrl);
//        Assert.isTrue(flag,"new page not opened");
//
//        driver.quit();
    }
}


//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;

//public class Geeksforgeeks {
//   public static void main(String args[])
//{
//      System.setProperty("webdriver.edge.driver", "C:\Users\GURPREET KAUR\Downloads\MyFirstProject\src\test\java\drivers\\msedgedriver.exe");
// Instantiate a WebDriver class.
//   WebDriver driver = new EdgeDriver();
//      Maximize the browser
//  driver.manage().window().maximize();
//  Launch Website
//driver.get("https://www.geeksforgeeks.org/");
//   System.out.println(driver.findElement(By.id()));
//    }
//}  driver.get vs driver.navigate.to()


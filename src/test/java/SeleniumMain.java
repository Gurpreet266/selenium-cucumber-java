import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class SeleniumMain {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\GURPREET KAUR\\Downloads\\MyFirstProject\\src\\test\\resources\\drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.geeksforgeeks.org/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getClass());
        System.out.println(driver.getWindowHandles());
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.navigate());
        System.out.println(driver.manage());
        System.out.println(driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)));
        driver.quit();
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

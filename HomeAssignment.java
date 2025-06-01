package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class HomeAssignment {
	
    public static void main(String[] args) {
        //Creating an object driver
        ChromeDriver driver = new ChromeDriver();

        //Passing the URL to launch FB on Chrome
        driver.get("https://www.facebook.com");

        //Maximizing the window
        driver.manage().window().maximize();

        //Clicking on Create a new account
        driver.findElement(By.linkText("Create new account")).click();

        //Enter First Name
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Surender");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

        //Selecting DropDown
        WebElement dayDrop = driver.findElement(By.xpath("//select[@id='day']"));
        Select dayDropDown = new Select(dayDrop);
        dayDropDown.selectByIndex(15);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

        WebElement monthDrop = driver.findElement(By.xpath("//select[@id='month']"));
        Select monDropDown = new Select(monthDrop);
        monDropDown.selectByValue("9");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

        WebElement yearDrop = driver.findElement(By.xpath("//select[@id='year']"));
        Select yearDropDown = new Select(yearDrop);
        yearDropDown.selectByVisibleText("1990");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

        //Selecting Radio button
        WebElement radioButton = driver.findElement(By.xpath("//input[@value='2']"));
        radioButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));


        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("johnsurender@ymail.com");
        driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Rambo@12345");
        driver.findElement(By.linkText("Sign Up")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

        
    }
}


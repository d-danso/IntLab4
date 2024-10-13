package org.example.part3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;

public class WebAppTest {

    @Test
    public void testLogin() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Open web application
        driver.get("http://example.com/login");

        // Find username and password fields and login button
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        // Enter credentials
        usernameField.sendKeys("myUsername");
        passwordField.sendKeys("myPassword");

        // Click login button
        loginButton.click();

        // Add assertions here if needed

        // Close browser
        driver.quit();
    }
}

package com.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Steps {
	WebDriver driver;

    @Given("user is on the login page")
    public void user_is_on_login_page() {
    	System.setProperty("webdriver.chrome.driver", "../OrionAutomation/src/test/resources/driver/chromedriver.exe");
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--no-proxy-server");
    	options.addArguments("--start-maximized");
    	options.addArguments("--remote-allow-origins=*");
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
    }

	/*
	 * @When("User enters valid credentials") public void
	 * user_enters_valid_credentials() {
	 * driver.findElement(By.id("username")).sendKeys("testuser");
	 * driver.findElement(By.id("password")).sendKeys("testpass");
	 * driver.findElement(By.id("loginButton")).click(); }
	 * 
	 * @Then("User is redirected to the dashboard") public void
	 * user_is_redirected_to_the_dashboard() { assert
	 * driver.getCurrentUrl().contains("dashboard"); driver.quit(); }
	 */
}

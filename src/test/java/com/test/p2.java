package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class p2 {
	WebDriver driver;
	
	@Given("user access the registration page")
	public void user_access_the_registration_page() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://10.232.237.143/TestMeApp/");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		driver.findElement(By.linkText("SignUp")).click();
	}

	@When("user enters {string} , {string} , {string} , {string} , {string} , {string} , {string} , {string} ,{string} ,{string},{string},{string}")
	public void user_enters(String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8, String string9, String string10, String string11,
			String string12) {
		driver.findElement(By.name("userName")).sendKeys(string);
		driver.findElement(By.name("firstName")).sendKeys(string2);
		driver.findElement(By.name("lastName")).sendKeys(string3);
		driver.findElement(By.name("password")).sendKeys(string4);
		driver.findElement(By.name("confirmPassword")).sendKeys(string5);
		driver.findElement(By.xpath("//*[@name='gender' and @value='Female']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys(string6);
		driver.findElement(By.name("mobileNumber")).sendKeys(string7);
		driver.findElement(By.name("dob")).sendKeys(string8);
		driver.findElement(By.name("address")).sendKeys(string9);
		driver.findElement(By.name("securityQuestion")).sendKeys(string10);
		driver.findElement(By.name("answer")).sendKeys(string11);
		driver.findElement(By.name("Submit")).click();
		System.out.println("Registration Success");
	}
	@Then("user navigtes to login page")
	public void user_navigtes_to_login_page() {

		System.out.println("User navigated to login page");

	}
}

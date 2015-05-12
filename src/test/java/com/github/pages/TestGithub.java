package com.github.pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.github.utils.Utils;

public class TestGithub {

	@Test
	public void loginGithubAndCreateRepo() {

		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.github.com");
		driver.findElement(By.linkText("Sign in")).click();

		LoginPage loginPage = new LoginPage(driver);
		String username = "Ksushabstu";
		String pass = "ksusha123";
		String rep_name = "123" + Utils.getRandomString(5);
		loginPage.login(username, pass);

		driver.get("https://github.com/new");
		CreateRepositori newRepo = new CreateRepositori(driver);
		newRepo.create(rep_name);

	}

}

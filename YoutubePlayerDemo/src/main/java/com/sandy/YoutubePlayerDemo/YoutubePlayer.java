package com.sandy.YoutubePlayerDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubePlayer {
	
	private static final String BASEURL="https://www.youtube.com/";
	private static final String CHROMEPATH=System.getProperty("user.dir") + "/ChromeDriver/chromedriver.exe";
	private WebDriver driver;
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", CHROMEPATH);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(BASEURL);
	}
	
	public void search(String searchTerm)
	{
		driver.findElement(By.id("search")).sendKeys(searchTerm);
		driver.findElement(By.id("search-icon-legacy")).click();
	}
	
	public void play()
	{
		driver.findElement(By.cssSelector("ytd-video-renderer.style-scope")).click();
	}

}

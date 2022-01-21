package com.sandy.YoutubePlayerDemo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get(BASEURL);
	}
	
	public void search(String searchTerm)
	{
		driver.findElement(By.cssSelector("input#search")).sendKeys(searchTerm);
		System.out.println("done");
		if(driver.findElement(By.cssSelector("button[class='style-scope ytd-searchbox']")).isDisplayed())
			{
			System.out.println("found");
			driver.findElement(By.cssSelector("button[class='style-scope ytd-searchbox']")).click();
			}
		else
		{
			driver.quit();
		}
		//driver.findElement(By.cssSelector("input#search")).sendKeys(Keys.ENTER);
		System.out.println("done");
	}
	
	public void play() throws InterruptedException
	{
		driver.findElement(By.cssSelector("div#title-wrapper")).click();
		System.out.println("done");
		Thread.sleep(2000);
		if(driver.findElement(By.cssSelector("div.ytp-left-controls>div[class='ytp-time-display notranslate']>span> span.ytp-time-duration")).isDisplayed())
		{
			System.out.println(driver.findElement(By.cssSelector("div.ytp-left-controls>div[class='ytp-time-display notranslate']>span> span.ytp-time-duration")).getText());
		}
		else
		{
			driver.quit();
		}
	}

}

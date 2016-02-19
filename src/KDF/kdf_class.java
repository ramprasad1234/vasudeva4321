package KDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class kdf_class {
	
public WebDriver driver;
	
	public void launch()
	{
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
	}
	
	public void navigate(String url)
	{
		driver.get(url);
	}
	
	public void wait(int tu)
	{
		driver.manage().timeouts().implicitlyWait(tu,TimeUnit.SECONDS);
	}
	
	public void enter(String element,String text)
	{
		driver.findElement(By.id(element)).sendKeys(text);
	}
	
	public void clickb(String element)
	{
		driver.findElement(By.id(element)).click();
	}

    public void clickl(String linktext)
    {
    	driver.findElement(By.linkText(linktext)).click();
    	
    }
    
    public void close() throws Exception
    {
    	Thread.sleep(5000);
    	driver.quit();
    }


}

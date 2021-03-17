package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonUtils.CommomUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		prop = new Properties();
		String path = System.getProperty("user.dir")+
				"/src/test/resources/config/javaTest.properties";
		FileInputStream fin ;
		try {
			
			fin= new FileInputStream(path);
			prop.load(fin);
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void initialize() {
		String browser = prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else {}
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(CommomUtils.IMPLICT_TOMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(CommomUtils.PAGELOAD_TIME, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
	
	}
	

}

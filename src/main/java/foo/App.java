package foo;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.ANY);
		
		WebDriver dr = new FirefoxDriver();//new RemoteWebDriver(new URL("http://localhost:4444"), cap);
		dr.get("http://google.com");
		dr.quit();
    }
}

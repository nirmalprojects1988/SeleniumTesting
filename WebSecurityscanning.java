
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class WebSecurityscanning{

  
  @Test
	public void ecomesecutity() {
    private WebDriver driver;
ChromeOptions options=new ChromeOptions();
options.addArguments("--no-sandbox");
options.addArguments("--disable-dev-shm-usage");
options.addArguments("--headless");
options.setAcceptInsecureCerts(true);
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver(options);
driver.get("http://automationpractice.com/index.php");
String j = driver.getTitle();
  System.out.println("Your page title Is : "+j);
    driver.quit();
  }
}

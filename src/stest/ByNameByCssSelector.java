package stest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByNameByCssSelector {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://Program Files//chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://moodle.kluniversity.in/login/index.php");
        driver.findElement(By.name("username")).sendKeys("180040639");
                driver.findElement(By.name("password")).sendKeys("test123");
                driver.findElement(By.cssSelector("button[type='submit']")).click();
                Thread.sleep(10000);
                driver.quit();
	}

}

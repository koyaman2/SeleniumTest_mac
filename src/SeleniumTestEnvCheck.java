import java.io.File;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class is used to check all programs required for the hands-on have been
 * installed completely. To check the installation, run this class as a JUnit
 * program on the Eclipse.
 */
public class SeleniumTestEnvCheck {

    private String chromeDriverPath() {
        // File chromeDriver = new File("chromedriver/win/chromedriver.exe"); // for win
        File chromeDriver = new File("chromedriver/mac/chromedriver"); // for mac
        return chromeDriver.getAbsolutePath();
    }

    @Test
    public void environmentCheckTest() {
//        File html = new File("reserveApp/index.html");
//        String url = "file:///" + html.getAbsolutePath();
		String url = "http://google.co.jp";

        System.setProperty("webdriver.chrome.driver", chromeDriverPath());
        WebDriver driver = new ChromeDriver();
        try {
            driver.get(url);
//            WebElement reserveYear = driver.findElement(By.id("reserve_year"));
//            reserveYear.click();
        } finally {
            driver.quit();
        }
    }
}

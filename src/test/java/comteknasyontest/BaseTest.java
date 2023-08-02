package comteknasyontest;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseTest {

        protected static WebDriver driver;
        public BaseTest() {
        }

        @BeforeScenario
        public void setUp() {

            ChromeOptions options = new ChromeOptions();
            options.addArguments(new String[]{"start-maximized"});
            options.addArguments(new String[]{"--disable-notifications"});
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
            driver = new ChromeDriver(options);
            driver.get("https://www.google.com/");
            driver.manage().timeouts().pageLoadTimeout(60L, TimeUnit.SECONDS);
        }

        @AfterScenario
        public void tearDown() {
        }

        public static WebDriver getWebDriver() {
            return driver;
        }

    }

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    @Test
    public void firstSeleniumTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://school-for-automation.tech");
        webDriver.manage().window().maximize();

        WebElement usernameInput = webDriver.findElement(By.id("username"));
        WebElement passwordInput = webDriver.findElement(By.id("password"));
        WebElement loginButton = webDriver.findElement(By.id("submit"));

        usernameInput.sendKeys("tester");
        passwordInput.sendKeys("test1234");
        loginButton.click();

        WebElement getStartedButton = webDriver.findElement(By.id("get-started"));
        Assert.assertTrue(getStartedButton.isDisplayed());

        webDriver.close();
    }
}

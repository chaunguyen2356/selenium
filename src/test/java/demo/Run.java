package demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Run
{
    WebDriver driver;

    @Test(priority = 1)
    public void TC_01(){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://chau-test.cvreferral.asia");
        driver.quit();
    }

    @Test(priority = 2)
    public void TC_02() throws InterruptedException {


        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://skale.vn/signin");

        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/form/div[1]/div[1]/div/input"))
                .sendKeys("chautest1@yopmail.com");

        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/form/div[1]/div[2]/div/input"))
                .sendKeys("123123");

        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/form/div[2]/div[2]/button"))
                        .click();
        Thread.sleep(1);
        driver.quit();
    }

}

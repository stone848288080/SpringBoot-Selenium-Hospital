package top.ximimi.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import top.ximimi.util.CommonUtils;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;


@Component
@Order(value = 1)
public class AutomationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ApplicationRunner的run方法");

        System.out.println(CommonUtils.getResourcePath());

        System.setProperty("webdriver.gecko.driver", CommonUtils.getResourcePath()+"browserdriver/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            driver.get("http://zhidu.womanhospital.cn:8090/index/index/view/id/109/m/3/c1/1/c2/27/r/104/state/4.html");
            //driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
            //WebElement firstResult = wait.until(presenceOfElementLocated(By.cssSelector("h3>div")));
           // System.out.println(firstResult.getAttribute("textContent"));
            if(driver.getCurrentUrl().equals("http://zhidu.womanhospital.cn:8090/index/index/view/id/109/m/3/c1/1/c2/27/r/104/state/4.html")){

            }else {
               driver.findElement(By.id("account")).sendKeys("4042");
               driver.findElement(By.id("password")).sendKeys("654321");
               driver.findElement(By.className("btn-primary")).click();
            }
            // A B C D
            List<WebElement> ulSecondList = driver.findElements(By.xpath(""));
            ulSecondList.get(0).sendKeys(Keys.ENTER);
            //driver.findElement(By.)



            //List<WebElement> ulList = driver.findElements(By.className("ul-txt3"));
            //String liSpanText = ulList.get(0).findElement(By.tagName("span")).getText();
            //System.out.println(liSpanText);




        } finally {
            //driver.quit();
        }
    }

}

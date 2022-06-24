package Abdessalam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class windowsHandle {

        WebDriver driver;

        @BeforeMethod

        public void setUp(){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\Apr2022-web-automation-framework-master (2)\\Apr2022-web-automation-framework-master\\driver\\windows\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driver.manage().window().maximize();
//            driver.get("https://www.asus.com/us/");
            driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        }

        @AfterMethod
        public void TearDown(){
            driver.close();
        }

        public void Wait(int sec) {
            try {
                Thread.sleep(sec * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

            @Test
    public void clickOnRadioButton(){
        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='radioButton']"));
        for (int i = 0; i < radioButtons.size(); i++) {
            radioButtons.get(i).click();
            Wait(3);
        }
//        for (WebElement radioButton: radioButtons) {
//            if (radioButton.getAttribute("value").equalsIgnoreCase("radio1")){
//                radioButton.click();
            }
//        }
//    }


      //  @Test
        public void windowHandle()  {
            String parentWindow = driver.getWindowHandle();
            System.out.println("ParentWindow  - "+parentWindow);
//            driver.findElement(By.xpath("//*[@class='btn-asus btn-ok btn-read-ck']")).click();
            driver.findElement(By.cssSelector("#openwindow")).click();
//            driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
            Set<String> NewWindowToHandle = driver.getWindowHandles();
            for(String NewWindow : NewWindowToHandle) {
                System.out.println(NewWindow);
                if (!NewWindow.equals(parentWindow)) {
                    driver.switchTo().window(NewWindow);
//                    driver.findElement(By.cssSelector("#rogProduct > div > div > div > div.Header__headerWrapper__2jH8a.Header__upscrolled__B00tj > div.Header__headerContainer__1hIKH > header > div.Header__iconBlock__339d9 > button")).click();
//                    driver.findElement(By.cssSelector("#search")).sendKeys("Keyboard", Keys.ENTER);
                    Wait(10);
                    driver.findElement(By.xpath("//*[text()='NO THANKS']")).click();
                    Wait(3);
                    driver.findElement(By.xpath("//a[text()='About']")).click();
                    Wait(2);
                    driver.close();
                }
            }
                driver.switchTo().window(parentWindow);
//                driver.findElement(By.xpath("//a[contains(text(),'Shop')]")).click();
                Wait(3);
                driver.close();
            }

        }



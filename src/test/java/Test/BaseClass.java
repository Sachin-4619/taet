package Test;

import Pages.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {


        static WebDriver driver;
        protected static PageFactory Pagefactory;
        public static void setup(){
            driver=new ChromeDriver();
            System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
            driver.get("https://www.marksandspencer.com/");
            Pagefactory=new PageFactory(driver);
        }

        public void close() {
            driver.close();
        }


    }


}

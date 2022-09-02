package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePage {

    WebDriver driver;
    By Women=By.xpath("
            "(//a[@class='nav-primary__menu-link icon--hdr-arrow-right'])[2]");
    public HomePage(WebDriver driver) {
        this.driver=driver;
    }



    public void Click() throws InterruptedException{
        driver.manage().window().maximize();

        driver.findElement(Women);
    }

}









package Pages;

import Test.UserVerifyHome;
import org.openqa.selenium.WebDriver;

import javax.jws.soap.SOAPBinding;

public class PageFactory {
    WebDriver driver;

    private void UserVerifyHome {

    }

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public static UserVerifyHome getUserVerifyHome() {
    }

    public UserVerifyHome getUserVerifyhome() {
        UserVerifyHome UserVerifyHome;
        if(UserVerifyHome==null){
            UserVerifyHome =new(driver);
        }
        return UserVerifyHome ;
    }
}



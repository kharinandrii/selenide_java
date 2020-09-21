package us.abstracta.opencart;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;

public abstract class BaseTest {
    static {
        Configuration.baseUrl = "http://opencart.abstracta.us";
        Configuration.browser = WebDriverRunner.FIREFOX;
        Configuration.startMaximized = true;
        //Configuration.headless = true;
    }
}

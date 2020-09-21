package us.abstracta.opencart;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import Pages.MainPage;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class RegisterTests extends BaseTest {
    Params params = new Params();
    MainPage mainPage = new MainPage();
    @BeforeEach
    void openSite() {
        open("/");
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
    }

    @Test
    public void testRegisterUser() {
        mainPage.clickOnMyAccount()
                .clickOnRegisterButton();
    }
}

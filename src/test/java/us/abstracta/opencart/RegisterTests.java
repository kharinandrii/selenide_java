package us.abstracta.opencart;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class RegisterTests {
    Params params = new Params();
    @BeforeEach
    void openSite() {
        open(params.URL);
    }

    @Test
    public void testRegisterUser() {
        $x("//*[text() = 'My Account']").click();
        $x("//*[text() = 'Register']").click();

    }
}

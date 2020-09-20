package us.abstracta.opencart;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class RegisterTests {
    Params params = new Params();

    @Test
    public void testRegisterUser() {
        open(params.URL);
        $(By.xpath("//*[text() = 'My Account']")).click();
        $(By.xpath("//*[text() = 'Register']")).click();

    }
}

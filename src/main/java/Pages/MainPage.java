package Pages;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private  SelenideElement myAccount = $(By.xpath("//*[text() = 'My Account']"));
    private SelenideElement registerButton = $x("//*[text() = 'Register']");

    public MainPage clickOnMyAccount() {
    myAccount.click();
    return this;
}
public MainPage clickOnRegisterButton() {
    registerButton.click();
    return this;
}


}

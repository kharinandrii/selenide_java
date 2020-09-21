package us.abstracta.opencart;

import com.codeborne.selenide.Configuration;

public abstract class BaseTest {
    static {
        Configuration.baseUrl = "http://opencart.abstracta.us";
    }
}

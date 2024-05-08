package qa.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;

import io.qameta.allure.selenide.AllureSelenide;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import qa.helper.Attach;
import qa.pageobjects.MainScreenPO;
import qa.pageobjects.NavigationPO;
import qa.pageobjects.SearchPO;
import qa.pageobjects.components.UniversalActionsComponent;

import java.util.Map;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {
    NavigationPO navigationPO = new NavigationPO();
    MainScreenPO mainScreenPO = new MainScreenPO();
    SearchPO searchPO = new SearchPO();
    @BeforeAll
    static void beforeAll(){
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com/";

//        Configuration.browser = "chrome";
//        Configuration.browserVersion = "124.0";
//        Configuration.remote = "http://localhost:4444/wd/hub";
//
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
//                "enableVNC", true
//        ));
//
//        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    void beforeEach(){
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    void afterEach(){
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.addVideo();

        closeWebDriver();
    }
}

package qa.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;

import io.qameta.allure.selenide.AllureSelenide;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import org.openqa.selenium.remote.DesiredCapabilities;
import qa.config.WebConfig;
import qa.helper.Attach;
import qa.pageobjects.MainScreenPO;
import qa.pageobjects.NavigationPO;
import qa.pageobjects.SearchPO;

import java.util.Map;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {
    NavigationPO navigationPO = new NavigationPO();
    MainScreenPO mainScreenPO = new MainScreenPO();
    SearchPO searchPO = new SearchPO();

    private final WebConfig config;
    public TestBase(){
        this.config = ConfigFactory.create(WebConfig.class, System.getProperties());
    }

    public TestBase setUp(){
        Configuration.browser = config.getBrowser();
        Configuration.browserVersion = config.getBrowserVersion();
        Configuration.browserSize = config.getBrowserSize();

        if(config.isRemote()){
            Configuration.remote = "https://"+config.getUsername()+":"+config.getPassword()+"@"+System.getProperty("selenoidUrl", config.getRemoteUrl());

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                    "enableVNC", true
            ));

            Configuration.browserCapabilities = capabilities;
        }

        return this;
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

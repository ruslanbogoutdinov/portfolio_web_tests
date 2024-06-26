package qa.config;

import org.aeonbits.owner.Config;

public interface WebConfig extends Config {
    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("browserVersion")
    @DefaultValue("124.0")
    String getBrowserVersion();

    @Key("username")
    @DefaultValue("user1")
    String getUsername();

    @Key("password")
    @DefaultValue("1234")
    String getPassword();

    @Key("isRemote")
    @DefaultValue("false")
    boolean isRemote();

    @Key("remoteUrl")
    @DefaultValue("selenoid.autotests.cloud/wd/hub")
    String getRemoteUrl();
}

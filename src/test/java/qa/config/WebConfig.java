package qa.config;

import org.aeonbits.owner.Config;

public interface WebConfig extends Config {
    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browserSize")
    @DefaultValue("800x600")
    String getBrowserSize();

    @Key("browserVersion")
    @DefaultValue("122.0")
    String getBrowserVersion();

    @Key("username")
    @DefaultValue("user1")
    String getUsername();

    @Key("password")
    @DefaultValue("1234")
    String getPassword();

    @Key("isRemote")
    boolean isRemote();

    @Key("remoteUrl")
    @DefaultValue("selenoid.autotests.cloud/wd/hub")
    String getRemoteUrl();
}

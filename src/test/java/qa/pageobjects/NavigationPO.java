package qa.pageobjects;

import static com.codeborne.selenide.Selenide.open;

public class NavigationPO {
    String URL = "https://github.com/";

    public NavigationPO openMainPage(){
        open(URL);

        return this;
    }
}

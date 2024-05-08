package qa.pageobjects.components;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class UniversalActionsComponent {
    public void neededItemByTextShouldBeVisible(String text){
        $(byText(text)).shouldBe(visible);
    }
}

package qa.pageobjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import qa.pageobjects.components.UniversalActionsComponent;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainScreenPO {
    UniversalActionsComponent universalActionsComponent = new UniversalActionsComponent();

    private final SelenideElement
            dropdownMenuWideFrame = $(".dropdown-menu-wide"),
            signInButton = $(".HeaderMenu-link--sign-in"),
            authForm = $(".auth-form"),
            signUpButton = $(".HeaderMenu-link--sign-up"),
            signUpFrame = $(".signup-text-suggester");

    private final ElementsCollection
        headerMenuItems = $$(".HeaderMenu-item");

    public MainScreenPO productItemDropdownOpensCheck(){
        headerMenuItems.get(0).hover();
        dropdownMenuWideFrame.shouldBe(visible);

        return this;
    }

    public MainScreenPO solutionsItemDropdownOpensCheck(){
        headerMenuItems.get(1).hover();
        universalActionsComponent.neededItemByTextShouldBeVisible("For");
        universalActionsComponent.neededItemByTextShouldBeVisible("By Solution");
        universalActionsComponent.neededItemByTextShouldBeVisible("Resources");

        return this;
    }

    public MainScreenPO openSourceItemDropdownOpensCheck(){
        headerMenuItems.get(2).hover();
        universalActionsComponent.neededItemByTextShouldBeVisible("GitHub Sponsors");
        universalActionsComponent.neededItemByTextShouldBeVisible("The ReadME Project");
        universalActionsComponent.neededItemByTextShouldBeVisible("Repositories");

        return this;
    }

    public MainScreenPO openAuthPage(){
        signInButton.click();
        authForm.shouldBe(enabled);

        return this;
    }

    public MainScreenPO openRegistrationPage(){
        signUpButton.click();
        signUpFrame.shouldBe(enabled);

        return this;
    }
}

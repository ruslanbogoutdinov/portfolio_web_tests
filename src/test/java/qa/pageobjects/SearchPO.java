package qa.pageobjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SearchPO {
    private final SelenideElement
        searchFieldButtonMainScreen = $(".header-search-button"),
        searchField = $("#query-builder-test"),
        repoSearchResult = $("[data-testid=results-list]"),
        openedRepoPage = $(".Layout-main"),
        contributorItemPopover = $(".Popover-message");

    private final ElementsCollection
        repoItemInFoundList = $$("[data-testid=results-list] > div"),
        contributorsItem = $("div.Layout-sidebar").$(byText("Contributors"))
                .closest("div").$$("ul li");;

    public SearchPO searchRepo(String repo){
        searchFieldButtonMainScreen.click();
        searchField.setValue(repo).pressEnter();

        return this;
    }

    public SearchPO verifyListOfReposOpens(){
        repoSearchResult.shouldBe(enabled);

        return this;
    }

    public SearchPO openFirstRepoInFoundList(){
        repoItemInFoundList.first().$("a").click();

        return this;
    }

    public SearchPO verifyRepoPageOpens(){
        openedRepoPage.shouldBe(enabled);

        return this;
    }

    public SearchPO openSelenideRepoPage(){
        open("https://github.com/selenide/selenide");

        return this;
    }

    public SearchPO firstContributorItemHover(){
        contributorsItem.first().hover();

        return this;
    }

    public SearchPO verifyContributorsPopoverAppears(){
        contributorItemPopover.shouldBe(visible);

        return this;
    }
}

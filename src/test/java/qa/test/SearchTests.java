package qa.test;

import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import qa.test.annotations.Layer;

import static io.qameta.allure.Allure.step;

@Layer("web tests")
@Feature("Функционал поиска репозитория")
public class SearchTests extends TestBase{
    @BeforeEach
    void beforeEach(){
        setUp();
    }

    private static final String repo = "Selenide";

    @Test
    @Story("Поиск репозитория")
    @Owner("ruslanbogoutdinov")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка успешного поиска репозитория")
    void searchRepositoryTest(){
        step("Открытие главной страницы сайта", () -> {
            navigationPO.openMainPage();
        });

        step("Вводим поисковой запрос в поле поиска и кликаем по 'Enter'", () -> {
            searchPO.searchRepo(repo);
        });

        step("Проверяем на корректное открытие страницы репозитория", () -> {
            searchPO.verifyListOfReposOpens();
        });
    }

    @Test
    @Story("Поиск репозитория")
    @Owner("ruslanbogoutdinov")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Открытие нужного репозитория в списке найденных")
    void openFoundRepositoryTest(){
        step("Открываем нужную страницу с найденными репозиторияеми", () -> {
            navigationPO.openMainPage();
            searchPO.searchRepo(repo);
        });

        step("Открываем нужный репозиторий в списке найденных", () -> {
            searchPO.openFirstRepoInFoundList();
        });

        step("Проверяем на корректное открытие страницы репозитория", () -> {
            searchPO.verifyRepoPageOpens();
        });
    }

    @Test
    @Story("Поиск репозитория")
    @Owner("ruslanbogoutdinov")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка отображения определенного контрибьютора при наведении мышкой")
    void contributorHoverTest(){
        step("Открываем страницу с репозиторием 'Selenide'", () -> {
            searchPO.openSelenideRepoPage();
        });

        step("Наводим мышкой по контрибьюторам репозитория", () -> {
            searchPO.firstContributorItemHover();
        });

        step("Проверяем на корректное отображение всплывающего окна при наведении мышкой", () -> {
            searchPO.verifyContributorsPopoverAppears();
        });
    }
}

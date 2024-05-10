package qa.test;

import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import qa.test.annotations.Layer;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Layer("web tests")
@Feature("Функицонал начальной страницы сайта")
public class MainScreenTests extends TestBase{
    @BeforeEach
    void beforeEach(){
        setUp();
    }

    @Test
    @Story("Проверка горизонтального меню на главной странице сайта")
    @Owner("ruslanbogoutdinov")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка выпадающего меню у горизонтального меню при наведении мышкой")
    void horizontalMenuDropdownTest(){
        step("Открытие главной страницы сайта", () -> {
            navigationPO.openMainPage();
        });

        step("Проверка открытия выпадающего меню при наведении мышкой у раздела 'Product'", () -> {
            mainScreenPO.productItemDropdownOpensCheck();
        });

        step("Проверка открытия выпадающего меню при наведении мышкой у раздела 'Solutions'", () -> {
            mainScreenPO.solutionsItemDropdownOpensCheck();
        });

        step("Проверка открытия выпадающего меню при наведении мышкой у раздела 'Open Source'", () -> {
            mainScreenPO.openSourceItemDropdownOpensCheck();
        });
    }

    @Test
    @Story("Проверка перехода по горизонтальному меню для авторизации и регистрации")
    @Owner("ruslanbogoutdinov")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка на корреткное открытие окон авторизации и регистрации")
    void openAuthAndRegistrationPagesTest(){
        step("Открытие главной страницы сайта", () -> {
            navigationPO.openMainPage();
        });

        step("Проверка открытия страницы авторизации и возврат на главную страницу сайта", () -> {
            mainScreenPO.openAuthPage();
            back();
        });

        step("Проверка открытия страницы регистрации", () -> {
            mainScreenPO.openRegistrationPage();
        });
    }
}

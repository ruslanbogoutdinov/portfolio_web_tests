# Демо-проект по автоматизации тестирования сайта [GitHub](https://github.com/)

<p align="center">
  <img title="GitHub" src="src/test/resources/media/images/GitHub.webp" alt="GitHub">
</p>

##	Содержание

- [Реализованныe проверки](#реализованные-проверки)
- [Запуск тестов из терминала](#запуск-тестов-из-терминала)
- [Запуск тестов в Jenkins](#запуск-тестов-в-jenkins)
- [Отчет о результатах тестирования в Allure Report](#отчет-о-результатах-тестирования-в-Allure-report)
- [Интеграция с Allure TestOps](#интеграция-с-allure-testops)
- [Уведомления в Telegram с использованием бота](#уведомления-в-telegram-с-использованием-бота)
- [Пример запуска теста в Selenoid](#пример-запуска-теста-в-selenoid)

## Реализованные проверки

- [x] Проверка успешного поиска репозитория
- [x] Открытие нужного репозитория в списке найденных
- [x] Проверка отображения определенного конрибьютора при наведении мышкой
- [x] Проверка выпадающего меню у горизонтального меню при наведении мышкой
- [x] Проверка на корректное открытие окон авторизации и регистрации

## Запуск тестов из терминала
### Локальный запуск тестов

```bash
gradle clean test
```

### Удаленный запуск тестов

```bash
gradle clean test

-Dbrowser=${browser}
-DbrowserVersion=${browserVersion}
-DbrowserSize=${browserSize}
-DremoteUrl=${remoteUrl}
```

### Параметры запуска

<code>browser</code> – браузер, в котором будут выполняться тесты (_по умолчанию - <code>chrome</code>_).

<code>browserVersion</code> – версия браузера (_по умолчанию - <code>100</code>_).

<code>browserSize</code> – размер окна браузера, в котором будут выполняться тесты (_по умолчанию - <code>1920x1080</code>_).

<code>remoteURL</code> - адрес удаленного сервера, где будут запускаться тесты.

## <img src="src/test/resources/media/logos/Jenkins.svg" alt="Jenkins" width="25" height="25"/> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/portfolio_web_tests/)

#### Главная страница Jenkins

<p align="center">
  <img title="Jenkins" src="src/test/resources/media/screenshots/Jenkins.png" alt="Jenkins" width="800">
</p>

#### Настройка параметров

<p align="center">
  <img title="Jenkins parameters" src="src/test/resources/media/screenshots/Jenkins_build.png" alt="Jenkins parameters" width="800">
</p>

> Для запуска сборки необходимо открыть страницу с параметрами, нажав кнопку <code><strong>*Build with Parameters*</strong></code>. 
> Далее указать значения параметров и нажать кнопку <strong>*Build*</strong>.

#### Значки Allure Report и Allure TestOps

<p align="center">
  <img title="Allure buttons in Jenkins" src="src/test/resources/media/screenshots/AllureButtons.png" alt="Allure buttons in Jenkins" width="800">
</p>

> Клик по иконкам <strong>*Allure TestOps*</strong> и <strong>*Allure Report*</strong> позволяет перейти
> на просмотр страниц с тестовой документацией и отчетов.

Результаты сборки можно посмотреть в Allure отчёте, кликнув на значок <code><strong>*Allure Report*</strong></code>.

## <img src="src/test/resources/media/logos/AllureReport.svg" alt="Allure Report" width="25" height="25"/></a> Отчет о результатах тестирования в [Allure Report](https://jenkins.autotests.cloud/job/portfolio_web_tests/allure/)

#### Главная страница Allure Report

<p align="center">
  <img title="Allure Report overview" src="src/test/resources/media/screenshots/AllureReportMain.png" alt="Allure Report overview" width="800">
</p>

#### Тесты

<p align="center">
  <img title="Allure Report tests" src="src/test/resources/media/screenshots/AllureTests.png" alt="Allure Report tests" width="800">
</p>

#### Графики

<p align="center">
  <img title="Allure Report graphs" src="src/test/resources/media/screenshots/AllureGraphs.png" alt="Allure Report graphs" width="800">
</p>

## <img src="src/test/resources/media/logos/AllureTestOps.svg" width="25" height="25"/></a> Интеграция с [Allure TestOps](https://allure.autotests.cloud/launch/38844)

В <code><strong>*Allure TestOps*</strong></code> есть возможность наблюдать за выполнением тестов в реальном времени.

#### Ход выполнения теста

<p align="center">
  <img title="Allure TestOps launch" src="src/test/resources/media/screenshots/AllureTestOpsLaunch.png" alt="Allure TestOps launch" width="800">
</p>

#### Тест-кейсы

<p align="center">
  <img title="Allure TestOps tests" src="src/test/resources/media/screenshots/AllureTestOpsTests.png" alt="Allure TestOps tests" width="800">
</p>

#### Дашборды

<p align="center">
  <img title="Allure TestOps dashboards" src="src/test/resources/media/screenshots/AllureTestOpsDashboards.png" alt="Allure TestOps dashboards" width="800">
</p>

## <img src="src/test/resources/media/logos/Telegram.svg" width="25" height="25"/></a> Telegram уведомление

#### Оповещение о результатах сборки

<p>
  <img title="Telegram notification" src="src/test/resources/media/screenshots/Telegram.png" alt="Telegram notification" width="500">
</p>

## Пример запуска теста

К каждому тесту в отчете прилагается видео.

На данном видео выполняется:

- Проверка функции добавления товара в Избранные

<p align="center">
  <img title="Selenoid Video" src="media/gif/test.gif">
</p>
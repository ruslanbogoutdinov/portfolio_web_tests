# Демо-проект по автоматизации тестирования сайта [GitHub](https://github.com/)

<p align="center">
  <img src="src/test/resources/media/images/GitHub.webp" alt="GitHub">
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

## Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/portfolio_web_tests/)

#### Главная страница Jenkins

<p align="center">
  <img src="src/test/resources/media/images/screenshots/Jenkins.png" alt="Jenkins" width="800">
</p>

Для запуска сборки необходимо указать значения параметров и нажать кнопку <code><strong>*Собрать*</strong></code>.

#### Настройка параметров

<p align="center">
  <img src="media/screen/jenkins_param.png" alt="jenkins_param" width="800">
</p>

Результаты сборки можно посмотреть в Allure отчёте, кликнув на значок <code><strong>*Allure Report*</strong></code>.

#### Значок Allure Report

<p align="center">
  <img src="media/screen/jenkins_allure.png" alt="jenkins_allure" width="800">
</p>

## Отчет о результатах тестирования в [Allure Report](https://jenkins.autotests.cloud/job/bookcity_final/19/allure/)

#### Главная страница Allure Report

<p align="center">
  <img src="media/screen/allure_main.PNG" alt="allure_main" width="800">
</p>

#### Тесты

<p align="center">
  <img src="media/screen/allure-tests.PNG" alt="allure_tests" width="800">
</p>

#### Графики

<p align="center">
  <img src="media/screen/allure_graphs.PNG" alt="allure_graphs" width="800">
</p>

## Интеграция с [Allure TestOps](https://allure.autotests.cloud/launch/18399)

В <code><strong>*Allure TestOps*</strong></code> есть возможность наблюдать за выполнением тестов в реальном времени.

#### Ход выполнения теста

<p align="center">
  <img src="media/screen/testops_launches.png" alt="testops_launches" width="800">
</p>

#### Тест-кейсы

<p align="center">
  <img src="media/screen/testops_tests.PNG" alt="testops_tests" width="800">
</p>

#### Дашборды

<p align="center">
  <img src="media/screen/dashboards.PNG" alt="dashboards" width="800">
</p>

## Интеграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-501)

#### Задача в Jira

<p align="center">
  <img src="media/screen/jira.PNG" alt="jira" width="800">
</p>

## Уведомления в Telegram с использованием бота

#### Оповещение о результатах сборки

<p align="center">
  <img src="media/screen/telegram.PNG" alt="telegram" width="800">
</p>

## Пример запуска теста в Selenoid

К каждому тесту в отчете прилагается видео.

На данном видео выполняется:

- Проверка функции добавления товара в Избранные

<p align="center">
  <img title="Selenoid Video" src="media/gif/test.gif">
</p>
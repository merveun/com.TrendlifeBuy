@smoke
@demo
Feature: US00101 Bir kullanıcı olarak ana sayfaya erişebilmeliyim

  Scenario:TC0101 URL girildiğinde ana sayfa erişilebilir olmalıdır.

    Given kullanici "url" sayfasina git
    Then subscribe popupu kapatilir
    Then  istenen sayfaya gittigi dogrulanir
    Then sayfayi kapat

  Scenario: TC0102 Siteye girerken title'ın Trendlifebuy Online Shopping olduğundan emin olunmalıdır.
    Given kullanici "url" sayfasina git
    Then  subscribe popupu kapatilir
    Then Anasayfada title in Trendlifebuy Online Shopping oldugunu kontrol eder
    Then sayfayi kapat








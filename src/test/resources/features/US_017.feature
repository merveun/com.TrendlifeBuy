@run
Feature:US_017.feature
  Scenario:kullanici siparislerini gösteren bir sayfaya erisebilmeli

    Given qa.trendlifebuy.com sayfasinda login olur
    Then Dashboard butonuna tiklar
    Then my order butonuna tiklar
    Then my order linkine gittiği test edilir


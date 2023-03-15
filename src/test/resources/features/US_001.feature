
 Feature: US00101 Bir kullanıcı olarak ana sayfaya erişebilmeliyim

   Scenario:TC0101 URL girildiğinde ana sayfa erişilebilir olmalıdır.

     Given kullanici "url" sayfasina git
     Then subscribe popupu kapatilir
     Then  istenen sayfaya gittigi dogrulanir


   Scenario: TC0102 Siteye girerken title'ınTrendlifebuy Online Shopping olduğundan emin olunmalıdır.

     Given  kullanici "url" sayfasina git
     Then  Siteye girerken title'ın Trendlifebuy Online Shopping olduğundan emin olunmalıdır.

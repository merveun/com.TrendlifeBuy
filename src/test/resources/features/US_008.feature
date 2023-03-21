

@ysn
Feature:Bir kullanici olarak alisveris yaptigim siteden, siparislerimin son durumunu sorgulatabilecegim
        bir bölümün olmasini istiyorum.


  Scenario: US_008 ---> TC_001 Kullanicilarin siparislerini Order Tracking Number TextBox'ına
            Order Tracking Number'i yazarak sorgulama yapabildikleri dogrulanmali.

    Given kullanici trendlifeUrl anasayfaya gider
    Then subscribe popup kapatilir
    Then click on login button
    Then Gecerli email adresi giriliry.
    Then Gecerli Passwordu password textboxina  girer
    Then Sign in butonu tiklaniry.
    Then  Uygulamaya giris yaptigini dogrular.
    And   Track your order butonu tıklanir.
    Then  Order Tracking Number textboxa girilir.
    And   Track Now butonu tiklanir.
    Then  Siparis takip sayfasinin açildigi dogrulanir.








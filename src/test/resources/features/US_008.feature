

@ysn
Feature:Bir kullanici olarak alisveris yaptigim siteden, siparislerimin son durumunu sorgulatabilecegim
        bir bölümün olmasini istiyorum.


  Scenario: US_008 ---> TC_001 Kullanicilarin siparislerini Order Tracking Number TextBox'ına
            Order Tracking Number'i yazarak sorgulama yapabildikleri dogrulanmali.

      Given kullanici "url" sayfasina git
      Then subscribe popup kapatilir
      Then  Login butonu tiklanir.
      Then  Email adresini girer.
      And   Password unu girer.
      Then  Sign in butonu tıklanir.
      Then  Uygulamaya giris yaptigini dogrular.
      And   Track your order butonu tıklanir.
      Then  Order Tracking Number textboxa girilir.
      And   Track Now butonu tiklanir.
      Then  Siparis takip sayfasinin açildigi dogrulanir.
      And  sayfayi kapat









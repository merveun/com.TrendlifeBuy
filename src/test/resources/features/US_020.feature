Feature: Bir kullanici olarak alisverislerde kullandigim kuponlarimi görebilecegim ve
  hesabima yeni kuponlar ekleyebilecegim bir sayfanin olmasini istiyorum.

  Background:
  Given kullanici trendlifeUrl anasayfaya gider
  Then subscribe popup kapatilir
  Then click on login button
  Then Gecerli email adresi giriliry.
  Then Gecerli Passwordu password textboxina  girer
  Then Sign in butonu tiklaniry.
  And Uygulamaya giris yaptigini dogrular.
  Then Dashboard butonuna tiklaniry.
  And My coupons butonu tiklaniry.




  Scenario: US_020 ---> TC_001 My Coupon sayfasinin erisilebilir oldugu dogrulanmali.
    Then My Coupons sayfasinin acildigi dogrulanir


  Scenario : US_020 ---> TC_002 My Coupon sayfasindaki Add Coupons bölümündeki textBox'a doğru kupon kodu ile
  giriş yapıldığında, bu kupon kodunun listeye eklendiği dogrulanmali.

    And   My Coupons sayfasinin acildigi dogrulanir
    Then  Code textboxina kupon girisi yapilir
    Then  Add Coupon butonu tıklanir
    And   Kuponun listeye eklendigi dogrulanir.


















Feature: Bir kullanici olarak alisverislerde kullandigim kuponlarimi görebilecegim ve
  hesabima yeni kuponlar ekleyebilecegim bir sayfanin olmasini istiyorum.

  Scenario: US_020 ---> TC_001 My Coupon sayfasinin erisilebilir oldugu dogrulanmali.
    Given kullanici "url" sayfasina git
    Then subscribe popup kapatilir
    Then Login butonu tiklanir.
    Then  Email adresini girer.
    And   Password unu girer.
    Then  Sign in butonu tıklanir.
    Then  Uygulamaya giris yaptigini dogrular.
    When  Dashboard butonu tiklanir
    Then  My coupons butonu tiklanir.
    And   My Coupons sayfasinin acildigi dogrulanir

  Scenario : US_020 ---> TC_002 My Coupon sayfasindaki Add Coupons bölümündeki textBox'a doğru kupon kodu ile
  giriş yapıldığında, bu kupon kodunun listeye eklendiği dogrulanmali.

    Given kullanici "url" sayfasina git
    Then Subscribe popup kapatilir
    Then Login butonu tiklanir.
    Then  Email adresini girer.
    And   Password unu girer.
    Then  Sign in butonu tıklanir.
    Then  Uygulamaya giris yaptigini dogrular.
    When  Dashboard butonuna tiklar
    Then  My coupons butonu tiklanir.
    And   My Coupons sayfasinin acildigi dogrulanir
    Then  Code textboxina kupon girisi yapilir
    Then  Add Coupon butonu tıklanir
    And   Kuponun listeye eklendigi dogrulanir.

  Scenario: US_020 ---> TC_003 Collected Coupons listesinde toplanan kuponlar Coupon Value, Store Name,
  Coupon Code, Validity, Action bilgilerine gore listelendigi dogrulanmali

    Given kullanici "url" sayfasina git
    Then Subscribe popup kapatilir
    Then Login butonu tiklanir.
    Then  Email adresini girer.
    And   Password unu girer.
    Then  Sign in butonu tıklanir.
    Then  Uygulamaya giris yaptigini dogrular.
    When  Dashboard butonuna tiklar
    Then  My coupons butonu tiklanir.
    And   My Coupons sayfasinin acildigi dogrulanir
    Then  Code textboxina kupon girisi yapilir
    Then  Add Coupon butonu tıklanir
    Then  Coupon Value, Store Name, Coupon Code, Validity, Action bilgilerine gore listelendigi dogrula











Feature: Bir yönetici olarak site verilerine erisebilmek,
  siteyi duzenleyebilmek, musteri isteklerine
  cevap verebilmek icin bir admin panelinin olmasini istiyorum


  Scenario: TC_001-Admin panelinin URL'ine erisilebilir oldugu dogrulanmali.


    Given Kullanici Admin Anasayfa "urlAdmin" 'ine gider.
    Then  Admin panelinin URL'ine erisilebilir oldugu dogrulanir
    And   Sayfayi kapatir



    Scenario: TC_002-Gecerli admin Username ve gecerli admin Password girildiginde
              admin Dashboard sayfasina login olundugu dogrulanmali.

      Given Kullanici Admin Anasayfa "urlAdmin" 'ine gider.
      Then  Gecerli bir admin "adminEmailM" ve "adminPasswordM" girer
      And   Signed(ad) in butonuna basar
      Then  Admin Dashboard sayfasina login olundugu dogrulanir
      And   Sayfayi kapatir


    Scenario: TC_003-Dashboard sayfasinin üst bölümünde Search TextBox'ınin görünür oldugu ve
              Search TextBox'i kullanilarak site icinde arama yapilabildigi dogrulanmali.

      Given Kullanici Admin Anasayfa "urlAdmin" 'ine gider.
      Then  Gecerli bir admin "adminEmailM" ve "adminPasswordM" girer
      And   Signed(ad) in butonuna basar
      Then  Sayfanin ust bolumunde Search TextBox'inin gorunur oldugu dogrulanir
    #bug: textbox arama yapmıyor#
      And   Search TextBox'i kullanilarak site icinde arama yapilabildigi dogrulanmali
      And   Sayfayi kapatir


    Scenario: TC_004-Dashboard ana sayfasinda menü ikonuna tiklandiginda
              Dashboard Side Bar'inin daralip genisledigi dogrulanmali.

      Given Kullanici Admin Anasayfa "urlAdmin" 'ine gider.
      Then  Gecerli bir admin "adminEmailM" ve "adminPasswordM" girer
      And   Signed(ad) in butonuna basar
      Then  Menu ikonuna tiklandiginda Dashboard Side Bar'inin daralip genisledigi dogrulanmali
      And   Sayfayi kapatir


    Scenario: TC_005-Dashboard ana sayfasinda bulunan Website botununa tıklandığında
              sitenin kullanici arayüzüne yönlendirdigi dogrulanmali.

      Given Kullanici Admin Anasayfa "urlAdmin" 'ine gider.
      Then  Gecerli bir admin "adminEmailM" ve "adminPasswordM" girer
      And   Signed(ad) in butonuna basar
      Then  Website botununa tiklanir
      And   Sitenin kullanici arayuzune yonlendirdigi dogrulanmali
      And   Sayfayi kapatir

  @must
    Scenario: TC_006-Dashboard ana sayfasinda bulunan
              Today,This Week, This Mounth ve This Year butonlarına tıklandığında
              Summary Boarddaki verilerin secilen degere göre degistigi doğrulanmalı

      Given Kullanici Admin Anasayfa "urlAdmin" 'ine gider.
      Then  Gecerli bir admin "adminEmailM" ve "adminPasswordM" girer
      And   Signed(ad) in butonuna basar
      Then  İlgili butonlarina sirayla tiklandiginda Summary Boarddaki verilerin secilen degere gore degistigi dogrulanir
      #And   Sayfayi kapatir
@wish


Feature: US_22 Bir kullanici olarak siteye kaydolurken girdigim bilgilerimi görmek,
  degistirmek veya silmek icin bir account sayfasinin olmasini istiyorum




  Scenario: TC_001 My Account sayfasini erisilebilir oldugu dogrulanmalı.

    And kullanici "url" sayfasina gider
    And subscribe popup kapatir
    And login linkine tiklar
    And Kullanici adi ve şifresi girilir
    And Giris butonuna tiklanir
    And Gösterge paneli tiklanir
    And My Account linki tiklanir


    Then My Account sayfasini erisilebilir oldugunu test eder
    And Choose File butonuna tiklanir
    And resim yüklenir
    Then profil resminin update edilebildigi test eder

  Scenario: TC_002 My Account sayfasindaki Choose File butonuna tiklayarak
  profil resminin update edilebildigi dogrulanmali.


  Scenario:TC_003 Basic Info sekmesinde First Name, Last Name, Email Address,
  Phone Number, Date of Birth ve Description TextBoxlarının oldugu dogrulanmali.

    Then First Name, Last Name, Email Address, Phone Number, Date of Birth ve Description Textboxların görünür olduğunu test eder

  Scenario:TC_004 Basic Info sekmesindeki bilgilerin (First Name, Last Name, Email Address,) kullanicinin bilgileri oldugunu test eder
    Then First Name, Last Name, Email Address kullanicinin bilgileri oldugunu test eder


  Scenario:TC_005 Basic Info sekmesindeki TextBox'lara bilgi girerek profil update edilebildigi dogrulanmali.
    Then Basic info sekmesindeki TextBoxlara bilgi girerek profil update edilebildi test edilir

  Scenario: TC_006 Change Password sekmesinde Current Password New Password
  Re enter New Password TextBoxlarinin oldugu dogrulanmali.
    And Change Password sekmesi tiklanir
    Then Current Password New Password Re enter New Password TextBoxlarinin oldugunu test eder

  Scenario: TC_007 Change Password sekmesindeki Current Password textBoxina mevcut sifre New Password ve Re enter New Password textBox'larina yeni sifre
  yazildiginda Update butonu kullanilarak sifrenin update edilebildigi dogrulanmali
    And Change Password sekmesi tiklanir
    And Current Password textBoxina mevcut sifre yazilir
    And New Password ve Re enter New Password textBoxlarina yeni sifre yazilir
    And Update butonuna basilir
    Then sifrenin update edilebildigini test eder

  Scenario:TC_008 Adress sekmesindeki Full Name, Address, Region, E-mail,
  Phone Number bilgilerinin kullanicinin oldugu dogrulanmali.
    And Adres sekmesi tıklanır
    Then Adress sekmesindeki Full Name, Address, Region, E-mail, Phone Number bilgilerinin kullanicinin oldugunu test eder

  Scenario:TC_009 Adress listesindeki edit ikonu kullanilarak Update Adress sekmesine ulasildigi dogrulanmali.
    And Adres sekmesi tiklanir
    And Adress listesindeki edit ikonu tiklanir
    Then Update butonu gözüktügünü test eder

  Scenario: TC_010 Update Adress sekmesinde Type, Name , Email Address, Phone Number,
  Country, State, City, Postal code, Street Address textBox'larinin oldugu dogrulanmali.
    And Adres sekmesi tiklanir
    And Adress listesindeki edit ikonu tiklanir.
    Then Type, Name , Email Address, Phone Number, Country, State, City, Postal code, Street Address textBox'larin görünür olduğunu test eder

  Scenario: TC_011 Type bölümünden adres type secilip textBox'lara güncel bilgiler girildiginde
  Update butonu kullanilarak adresin update edilebildigi dogrulanmali.


    And Type, Name , Email Address, Phone Number, Country, State, City, Postal code, Street Address textBox'lari  bilgileri girilir
    And update butonuna tıklanır
    Then Update butonu kullanilarak adresin update edilebildigini test eder.

  Scenario: TC_012 Add New Adress butonu ile profile yeni bir adres eklenebildigi dogrulanmali.

    And Add New Adress butonu tiklanir
    And Adres bilgileri girilip create  butonuna tiklanir
    Then Add New Adress butonu ile profile yeni bir adres eklenebildigini test eder












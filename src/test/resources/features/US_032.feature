Feature: Bir yönetici olarak Dashboard panelindeki sayfalara kolay erisim saglayabilmek icin
  sayfalarin kategoriler altinda bir Side Bar'da listelenmesini istiyorum.


  Scenario: US_032 ---> TC_001 Dashboard Side Bar'da Dashboard menü basliginin görünür oldugu dogrulanmali.
    Given Kullanici "urlAdmin" sayfasina giris yaparak login sayfasini acar.
    Then  Gecerli email adresini mail textboxina girer
    Then  Gecerli Passwordu password textboxina  girer
    Then  Sign in butonu tiklaniry.

    Then Dashboard Side Bar'da Dashboard menu basligini gorulmeli

  Scenario: US_032 ---> TC_002 Dashboard Side Bar'daki Dashboard kategorisi altindaki Dashboard yazisina
  tiklandiginda admin-dashboard sayfasına yönlendirdigi dogrulanmali.
    Given Kullanici "urlAdmin" sayfasina giris yaparak login sayfasini acar.
    Then  Gecerli email adresini mail textboxina girer
    Then  Gecerli Passwordu password textboxina  girer
    Then  Sign in butonu tiklaniry.
    Then Dashboard menu butonu tiklanir.
    And  Admin-dashboard sayfasına yonlendirdigi dogrulanir.

  Scenario: US_032 ---> TC_003 Dashboard Side Bar'da User Manages kategorisinin görünür oldugu dogrulanmali.
    Given Kullanici "urlAdmin" sayfasina giris yaparak login sayfasini acar.
    Then  Gecerli email adresini mail textboxina girer
    Then  Gecerli Passwordu password textboxina  girer
    Then  Sign in butonu tiklaniry.
    Then User Manages kategorisinin gorunur oldugu dogrulanir

  Scenario: US_032 ---> TC_004 Dashboard Side Bar'da User Manages kategorisi altında
  Customer ve Human Resource acilir menülerinin oldugu dogrulanmali.
    Given Kullanici "urlAdmin" sayfasina giris yaparak login sayfasini acar.
    Then  Gecerli email adresini mail textboxina girer
    Then  Gecerli Passwordu password textboxina  girer
    Then  Sign in butonu tiklaniry.
    Then Customer butonu tiklanir.
    Then All customer butonunun gorulmesi beklenir.
    Then Customer butonu tekrar tiklanir
    Then Menunun kapandıgı dogrulanir.
    Then Human Resource butonu tiklanir
    Then Staff butonunun goruldugu dogrulanir
    Then Human  Resource butonu tekrar tiklanir
    And  Human resource menusunun kapandigi dogrulanir.


  Scenario: US_032 ---> TC_005 Dashboard Side Bar'da Order Manages kategorisinin görünür oldugu dogrulanmali.
    Given Kullanici "urlAdmin" sayfasina giris yaparak login sayfasini acar.
    Then  Gecerli email adresini mail textboxina girer
    Then  Gecerli Passwordu password textboxina  girer
    Then  Sign in butonu tiklaniry.
    Then Order Manages kategorisinin gorunur oldugu dogrulanir.

  Scenario: US_032 ---> TC_006 Dashboard Side Bar'da Order Manages kategorisi altında Order Manage
  acilir penceresinin oldugu dogrulanmali.
    Given Kullanici "urlAdmin" sayfasina giris yaparak login sayfasini acar.
    Then  Gecerli email adresini mail textboxina girer
    Then  Gecerli Passwordu password textboxina  girer
    Then  Sign in butonu tiklaniry.
    Then Order Manage butonu tiklanir.
    Then Menusunun acilarak Total order in goruldugu dogrulanir.
    Then Order manage butonu tekrar tiklanir.
    Then Menunun kapandigi Total order in gorulmedigi dogrulanir.

  Scenario: US_032 ---> TC_007 Dashboard Side Bar'da Product Manage kategorisinin görünür oldugu dogrulanmali.

    Given Kullanici "urlAdmin" sayfasina giris yaparak login sayfasini acar.
    Then  Gecerli email adresini mail textboxina girer
    Then  Gecerli Passwordu password textboxina  girer
    Then  Sign in butonu tiklaniry.
    Then Product Manage kategorisinin gorunur oldugu dogrulanir.

  Scenario: US_032 ---> TC_008 Dashboard Side Bar'da Product Manage kategorisi altında Products
  acilir penceresinin oldugu dogrulanmali.
    Given Kullanici "urlAdmin" sayfasina giris yaparak login sayfasini acar.
    Then  Gecerli email adresini mail textboxina girer
    Then  Gecerli Passwordu password textboxina  girer
    Then  Sign in butonu tiklaniry.
    Then Product Manage butonu tiklanir.
    Then Product Manage menusunun acilarak Product List in goruldugu dogrulanir.
    Then Product Manage butonu tekrar tiklanir.
    Then Menunun kapandigi Product List in gorulmedigi dogrulanir.


  Scenario: US_032 ---> TC_009 Dashboard Side Bar'da Promotional kategorisinin görünür oldugu dogrulanmali.

    Given Kullanici "urlAdmin" sayfasina giris yaparak login sayfasini acar.
    Then  Gecerli email adresini mail textboxina girer
    Then  Gecerli Passwordu password textboxina  girer
    Then  Sign in butonu tiklaniry.
    Then Promotional kategorisinin gorunur oldugu dogrulanir


  Scenario: US_032 ---> TC_010 Dashboard Side Bar'da Promotional kategorisi altında Marketing ve Gift Card
  acilir pencerelerinin oldugu dogrulanmali.

    Given Kullanici "urlAdmin" sayfasina giris yaparak login sayfasini acar.
    Then  Gecerli email adresini mail textboxina girer
    Then  Gecerli Passwordu password textboxina  girer
    Then  Sign in butonu tiklaniry.
    Then Marketing butonu tiklanir.
    Then New User Zone Button butonunun gorulmesi beklenir.
    Then Marketing butonu tekrar tiklanir
    Then Marketing menunun kapandigi dogrulanir.
    Then Gift Card butonu tiklanir
    Then Gift Card List butonunun goruldugu dogrulanir
    Then Gift Card butonu tekrar tiklanir
    And  Gift Card menusunun kapandigi dogrulanir.

  Scenario: US_032 ---> TC_011 Dashboard Side Bar'da Finance kategorisinin görünür oldugu dogrulanmali.
    Given Kullanici "urlAdmin" sayfasina giris yaparak login sayfasini acar.
    Then  Gecerli email adresini mail textboxina girer
    Then  Gecerli Passwordu password textboxina  girer
    Then  Sign in butonu tiklaniry.
    Then Finance kategorisinin gorunur oldugu dogrulanir.

  Scenario: US_032 ---> TC_012 Dashboard Side Bar'da Finance kategorisi altında Account acilir
  penceresinin oldugu dogrulanmali.

    Given Kullanici "urlAdmin" sayfasina giris yaparak login sayfasini acar.
    Then  Gecerli email adresini mail textboxina girer
    Then  Gecerli Passwordu password textboxina  girer
    Then  Sign in butonu tiklaniry.
    Then Account butonu tiklanir.
    Then Account menusunun acilarak Income in goruldugu dogrulanir.
    Then Account butonu tekrar tiklanir.
    Then Menunun kapandigi Income in gorulmedigi dogrulanir.

  Scenario: US_032 ---> TC_013  Dashboard Side Bar'da Content kategorisinin görünür oldugu dogrulanmali.
    Given Kullanici "urlAdmin" sayfasina giris yaparak login sayfasini acar.
    Then  Gecerli email adresini mail textboxina girer
    Then  Gecerli Passwordu password textboxina  girer
    Then  Sign in butonu tiklaniry.
    Then Content kategorisinin gorunur oldugu dogrulanir.

  Scenario: US_032 ---> TC_014  Dashboard Side Bar'da Content kategorisi altında
  Admin Reports ve Support Ticket acilir pencerelerinin oldugu dogrulanmali.

    Given Kullanici "urlAdmin" sayfasina giris yaparak login sayfasini acar.
    Then  Gecerli email adresini mail textboxina girer
    Then  Gecerli Passwordu password textboxina  girer
    Then  Sign in butonu tiklaniry.
    Then Admin Reports butonu tiklanir.
    Then Visitor  butonunun gorulmesi beklenir.
    Then Admin Reports butonu tekrar tiklanir
    Then Admin Reports menunun kapandigi dogrulanir.
    Then Support Ticket butonu tiklanir
    Then Status butonunun goruldugu dogrulanir
    Then Support Ticket butonu tekrar tiklanir
    And  Support Ticket menusunun kapandigi dogrulanir.























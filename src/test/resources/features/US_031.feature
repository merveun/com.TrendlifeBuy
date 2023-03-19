Feature: US_031 Bir yonetici olarak profil bilgilerime erisebilmek ve logout islemini yapabilmek icin login oldugum profilin dashboard anasayfasinin üst barinda görünür olmasini istiyorum.

  Scenario: US_031--->TC_03101 Dashboard ana sayfasinin üst barinda profil ikonunun görünür oldugu dogrulanmali.


    Then AdminLogin butonuna tiklar
    Then AdmindeDashboard linkine tiklanir
    And Dashboard ana sayfasinin ust barinda profil ikonunun gorunmeli
    Then  sayfayi kapat


  Scenario: US031--->TC_03102 Profil ikonuna tiklaninca acilan pencerede login olunan hesabin Name bilgisinin göründugu dogrulanmali.

    Then AdminLogin butonuna tiklar
    Then Dashboardda profil ikonuna tiklanir
    Then Profil ikonuna tiklaninca acilan pencerede login olunan hesabin Name bilgisinin gorundugu dogrulanmali
    Then sayfayi kapat

  Scenario: US_031--->TC_03103 Profil ikonuna tiklaninca acilan pencerede My profil ve Log out linklerinin görünür oldugu dogrulanmali

    Given AdminLogin butonuna tiklar
    Then Dashboardda profil ikonuna tiklanir
    And Profil ikonuna tiklaninca acilan pencerede My profil ve Log out linklerinin gorunur oldugu dogrulanmali.
    Then sayfayi kapat

  Scenario: US_031--->TC_03104 My Profil linkine tiklaninca profile sayfasina gidildigi dogrulanmali.

    Given AdminLogin butonuna tiklar
    Then Dashboardda profil ikonuna tiklanir
    And My Profil linkine tiklaninca profile sayfasina gidillmeli
    Then sayfayi kapat

  Scenario: US_031--->TC_03105 Profil sayfasindaki Basic Info bölümünde First Name, Last Name, E-mail Adress, Phone Number, Date of Bird bilgilerinin oldugu dogrulanmali.

    Given AdminLogin butonuna tiklar
    Then Dashboardda profil ikonuna tiklanir
    And My Profil linkine tiklaninca profile sayfasina gidillmeli
    Then  Profil sayfasindaki Basic Info bolumunde First Name, Last Name, E-mail Adress, Phone Number, Date of Bird bilgilerinin gorunmeli
    Then sayfayi kapat

  Scenario: US_031--->TC_03106 Profil sayfasindaki Basic Info bölümünde First Name, Last Name, E-mail Adress, Phone Number, Date of Bird bilgilerinin update edilebildigi dogrulanmali.

    Given AdminLogin butonuna tiklar
    Then Dashboardda profil ikonuna tiklanir
    And My Profil linkine tiklaninca profile sayfasina gidillmeli
    Then Profil sayfasindaki Basic Info bolumunde First Name, Last Name, E-mail Adress, Phone Number, Date of Bird bilgileri update edilmesi icin bilgiler girilmeli ve update now butonuna tiklanmali
    Then sayfayi kapat


  Scenario: US_031--->TC_03107 Profil sayfasindaki Adress butonuna tiklaninca acilan sayfada adres bilgisinin göründügü dogrulanmali.

    Given AdminLogin butonuna tiklar
    Then Dashboardda profil ikonuna tiklanir
    And My Profil linkine tiklaninca profile sayfasina gidillmeli
    Then MyProfil sayfasina gidilir Adress butonuna tiklaninca acilan sayfada adres bilgisine tiklanmali ve sayfa gelmeli
    Then sayfayi kapat


  Scenario: US_031--->TC_03108 Add New Adress butonuna tiklandiginda acilan sayfadan login olan hesaba yeni adres eklenebildigi ve eklenen adreslerin adress sayfasinda görünür oldugu dogrulanmali.

    Given AdminLogin butonuna tiklar
    Then Dashboardda profil ikonuna tiklanir
    And My Profil linkine tiklaninca profile sayfasina gidillmeli
    Then MyProfil sayfasina gidilir Adress butonuna tiklaninca acilan sayfada adres bilgisine tiklanmali ve sayfa gelmeli
    Then Add New Adress butonuna tiklanir
    Then Add New Adress butonuna tiklandiginda acilan sayfadan login olan hesaba yeni adres eklenebildigi ve eklenen adreslerin adress sayfasinda görünür oldugu dogrulanmali.
    Then sayfayi kapat
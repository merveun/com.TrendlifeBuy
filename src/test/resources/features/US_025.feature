Feature: US_025 Bir kullanici olarak sitede alisverisimi tamamladiktan sonra siteden logout yapabilmek istiyorum.
  @smokeDemo
  Scenario: US_025--->TC_02501 Ana sayfada Logout linkinin görünür oldugu dogrulanmali.

    Given Login butonuna tiklar
    Then Logout linkinin gorunurlugu test edilmeli
  @smokeDemo
  Scenario: US_025--->TC_02502 Ana sayfadaki Logout linkine tiklayinca hesaptan cikis yapildigi dogrulanmali.

    Given Login butonuna tiklar
    Then LogOut butonuna tiklaninca sayfadan cikis yapmali
    Then  cikis yaptigi dogrulanmali

  Scenario: US_025--->TC_02503 Dashboard Side Bar'da Logout linkinin oldugu dogrulanmali.

    Given Login butonuna tiklar
    Then Dashboard linkine tiklanir sayfaya yönlendirilir
    Then Dashboard Side Bar'da Logout linki kontrol edilir ve linkin oldugu dogrulanir

  Scenario: US_025--->TC_02504 Dashboard Side Bar'daki Logout linkine tiklaninca hesaptan cikis yapildigi dogrulanmali.

    Given Login butonuna tiklar
    Then Dashboard linkine tiklanir sayfaya yönlendirilir
    Then Dashboardda logOut butonuna tiklanir hesaptan cikis yaptigi dogrulanir
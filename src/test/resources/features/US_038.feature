
Feature: US_038 Bir yönetici olarak sitede kullanilan keywordler hakkindaki raporlari görebilecegim bir sayfanin olmasini istiyorum

  #FAILED
  Scenario: US_038--->TC_03801 Quick Search TextBOx'i ile Keyword search report listesinde arama yapilabildigi dogrulanmali

    Given AdminLogin butonuna tiklar
    Then Quick Search textbox kismina arama yapililr
    Then Quick Searchta aranan verinin geldigi dogrulanir
    Then sayfayi kapat

  Scenario: US_038--->TC_03802 Admin Reports Keywords Search sayfasinda Keyword search report Listesinin oldugu dogrulanmali

    Given AdminLogin butonuna tiklar
    Then Admin Reports Keywords Search butonuna tiklanir ve  sayfasinda Keyword search report Listesinin oldugu dogrulanmali
    Then sayfayi kapat

 Scenario: US_038--->TC_03803 Keyword search report Listesinde Keyword ve Number of Time basliklarinin bulundugu dogrulanmali
   Given AdminLogin butonuna tiklar
   Then Admin Reports Keywords Search butonuna tiklanir ve  sayfasinda Keyword search report Listesinin oldugu dogrulanmali
   Then Keyword search report Listesinde Keyword ve Number of Time basliklarinin bulundugu dogrulanmali
    Then sayfayi kapat



   Scenario: US_038--->TC_03804 Keyword search report Listesindeki sayfalar arasinda gecislerin yapilabildigi dogrulanmali

     Given AdminLogin butonuna tiklar
     Then Admin Reports Keywords Search butonuna tiklanir ve  sayfasinda Keyword search report Listesinin oldugu dogrulanmali
     Then Then Admin Reports Keywords Search butonuna tiklanir ve  sayfasinda Keyword search report Listesinin oldugu dogrulanmali
    Then  Sayfalar arasi gecis yaptıgı dogrulanmali
    Then sayfayi kapat

  Scenario: US_038--->TC_03805 Keyword search report Listesindeki her bir sayfada maximum 10 keyword bilgisi oldugu dogrulanmali

    Given AdminLogin butonuna tiklar
    Then Admin Reports Keywords Search butonuna tiklanir ve  sayfasinda Keyword search report Listesinin oldugu dogrulanmali
    Then Keyword search report Listesindeki her bir sayfada maximum 10 keyword bilgisi oldugu dogrulanmali
    Then sayfayi kapat
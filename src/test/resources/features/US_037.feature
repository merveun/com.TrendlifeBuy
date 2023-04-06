Feature: US_037 - Bir yönetici olarak sitedeki aktivite verilerinin daha anlasilabilir
  olmasi icin sitedeki verileri grafikler ve listeler seklinde görebilmek istiyorum.

  @smokeDemo
  Scenario: US_037 --> TC_001 - Dashboard ana sayfasindaki Products,Orders Summary,Guest/Authorized Order Today,Today Order summary
  başlıklarındaki grafiklerin görünür olduğunu doğrulanmali.

    Given kullanici "adminLogin" sayfasina git
    Given kullanici bilgilerini gir
    Given sign in butonuna tiklar
    And gerekli grafiklerin gorunur oldugunu dogrular
    And sayfayi kapat

  @demo
  @smokeDemo
  Scenario: US_037 --> TC_004 -Top 10 Product, New Customers, Recently Added Products, Top Refferers, Latest Order,
  Latest Search Keyword, Appealed Disputed Top Customers,
  Recent Reviews Product Reviews listelerinin görünür olduğu doğrulanmali.

    Given kullanici "adminLogin" sayfasina git
    Given kullanici bilgilerini gir
    Given sign in butonuna tiklar
    And gerekli listelerin gorunur oldugunu dogrular
    And sayfayi kapat

    @brkr
  Scenario: US_037 --> TC_005 -Top 10 Product, New Customers, Recently Added Products, Top Refferers, Latest Order,
  Latest Search Keyword, Appealed Disputed Top Customers,
  Recent Reviews Product Reviews listelerinin görünür olduğu doğrulanmali.

    Given kullanici "adminLogin" sayfasina git
    Given kullanici bilgilerini gir
    Given sign in butonuna tiklar
    Then new customerstaki details butonuna tiklar
      And ilgili customer sayfasina yonlendirildigini dogrulanir
      Then latest orderdaki details butonuna tiklar
      And ilgili siparis sayfasina yonlendirildigini dogrular
      And sayfayi kapat


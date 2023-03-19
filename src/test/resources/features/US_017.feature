Feature: Bir kullanici olarak siparislerimle ilgili islemleri gerceklestirebilmek icin
  siparislerimi gösteren bir sayfanin olmasini istiyorum.

  Scenario: US_017--> TC001 - Dashboard sayfasinda bulunan side bar'daki My Order linkinin
  Order sayfasina yönlendirdigi dogrulanmali.

    Given "url" sayfasinda login olur
    Then Dashboard butonuna tiklar
    Then My order butonuna tiklar
    Then My order linkine gittiği test edilir
    And sayfayi kapat


  Scenario: US_017--> TC002 - My Order sayfasinda siparislerimi gormek ister

    Given "url" sayfasinda login olur
    Then Dashboard butonuna tiklar
    Then My order butonuna tiklar
    Then All-To butonuna tiklar ve urunlerin gorundugunu test eder
    Then Pay-To butonuna tiklar ve urunlerin gorundugunu test eder
    Then Ship-To butonuna tiklar ve urunlerin gorundugunu test eder
    And Recieve butonuna tiklar ve urunlerin gorundugunu test eder


  Scenario: US_017--> TC003 - My Order sayfasinda My Order listesindeki ürünlerin Order ID, Status, Order date,
  Order Amount ve Paid By bilgilerinin goruntulendigi dogrulanmali


    Given "url" sayfasinda login olur
    Then Dashboard butonuna tiklar
    Then My order butonuna tiklar
    Then Order ID butonuna tiklar gorundugunu test eder
    Then Status butonuna tiklar gorundugunu test eder
    Then Order date butonuna tiklar gorundugunu test eder
    Then ORder amount butonuna tiklar gorundugunu test eder
    And  Paid by butonuna tiklar gorundugunu test eder


  @run
  Scenario: US_017--> TC004 - Order sayfasinda gösterilecek ürünlerin adedini (last 5 orders, last 10 orders,
  last 20 orders, last 40 orders) belirlenebildigi dogrulanmali.


    Given "url" sayfasinda login olur
    Then Dashboard butonuna tiklar
    Then My order butonuna tiklar
    Then Last5 orders butonuna tiklar ve gorundugunu test eder
    Then last20 orders butonuna tiklar ve gorundugunu test eder
    And  last40 orders butonuna tiklar ve gorundugunu test eder

  Scenario: US_017--> TC005 - Görüntülenen ürünler eger tek sayfada degilse sayfalar arasinda
  (prew-next yapilarak) gecislerin yapilabildigi dogrulanmali.


    Given "url" sayfasinda login olur
    Then Dashboard butonuna tiklar
    Then My order butonuna tiklar
    Then Prev butonuna tıklar geri gittiğini test eder
    Then Next butonuna tıklar ileri gittiğini test eder.
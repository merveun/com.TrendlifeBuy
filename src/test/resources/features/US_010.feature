Feature: Bir kullanici olarak alisveris yaparken satin almayi dusundugum ürünleri atacagim
  ve devaminda alisveris islemlerimi gerceklestirebilecegim bir sepet sayfasi olmasini istiyorum.
@brkr
  Scenario: TC_001 - Shipping charge free from,
            Order Summary,Subtotal,Shipping Charge,
            Discount,VAT/TAX/GST ve Total yazılarınin görünür oldugu dogrulanmali.

    Given kullanici "url" sayfasina git
    Then subscribe popup kapatilir
    Then All categories butonuna tiklar
    Then copmuter ve accessories menusunun uzerinde bekler
    Then computer menusune tiklar
    Then ilk urunun uzerinde bekler
    Then add to cart butonuna tiklar
    Then view cart butonuna tiklar
    * gerekli yazilarin gorunur oldugunu dogrular
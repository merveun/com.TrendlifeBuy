@smoke
Feature: Bir kullanici olarak alisveris yaparken satin almayi dusundugum ürünleri atacagim
  ve devaminda alisveris islemlerimi gerceklestirebilecegim bir sepet sayfasi olmasini istiyorum.
  @demo
  @smokeDemo
  Scenario: US_010 --> TC_001 - Shipping charge free from,
            Order Summary,Subtotal,Shipping Charge,
            Discount,VAT/TAX/GST ve Total yazılarınin görünür oldugu dogrulanmali.

    Given kullanici "url" sayfasina git
    Then subscribe popup kapatilir
    Then All categories butonuna tiklar
    Then copmuter ve accessories menusunun uzerinde bekler
    Then computer menusune tiklar
    Then acilen yeni sekmeye gecer
    Then ilk urunun uzerinde bekler
    Then add to cart butonuna tiklar
    Then view cart butonuna tiklar
    And shipping charge free yazisinin gorunur oldugunu dogrula
    And order summary yazisinin gorunur oldugunu dogrula
    And subtotal yazisinin gorunur oldugunu dogrula
    And shipping charge yazisinin gorunur oldugunu dogrula
    And discount yazisinin gorunur oldugunu dogrula
    And vatTaxGst yazisinin gorunur oldugunu dogrula
    And total yazisinin gorunur oldugunu dogrula
    And sayfayi kapat
  @demo
  @smokeDemo
  Scenario:US_010 --> TC_002 - Quantity bölümünden alınacak ürünün adedinin degistirilebildigi dogrulanmali.
    Given kullanici "url" sayfasina git
    Then subscribe popup kapatilir
    Then All categories butonuna tiklar
    Then copmuter ve accessories menusunun uzerinde bekler
    Then computer menusune tiklar
    Then acilen yeni sekmeye gecer
    Then ilk urunun uzerinde bekler
    Then add to cart butonuna tiklar
    Then view cart butonuna tiklar
    And adet degisiminin yapilabildigini dogrula
    And sayfayi kapat

    Scenario: US_010 --> TC_003 - Quantity bölümündeki adet sayisina göre Total ücretin degistigi dogrulanmali.
      Given kullanici "url" sayfasina git
      Then subscribe popup kapatilir
      Then All categories butonuna tiklar
      Then copmuter ve accessories menusunun uzerinde bekler
      Then computer menusune tiklar
      Then acilen yeni sekmeye gecer
      Then ilk urunun uzerinde bekler
      Then add to cart butonuna tiklar
      Then view cart butonuna tiklar
      And total ucretin degisebilir oldugunu dogrular
      And sayfayi kapat

  Scenario: US_010 --> TC_004 - Price bölümünde ürünün birim fiyati ve varsa indirim miktarinin yazdigi dogrulanmali.
    Given kullanici "url" sayfasina git
    Then subscribe popup kapatilir
    Then All categories butonuna tiklar
    Then copmuter ve accessories menusunun uzerinde bekler
    Then computer menusune tiklar
    Then acilen yeni sekmeye gecer
    Then ilk urunun uzerinde bekler
    Then add to cart butonuna tiklar
    Then view cart butonuna tiklar
    And urun fiyati ve indirimin oraninin gorunur oldugunu dogrular
    And sayfayi kapat

  Scenario: US_010 --> TC_005 - Proceed to checkout butonuna tiklandiginda ilgili sayfaya yönlendirdigi dogrulanmali.
    Given kullanici "url" sayfasina git
    Then subscribe popup kapatilir
    Then All categories butonuna tiklar
    Then copmuter ve accessories menusunun uzerinde bekler
    Then computer menusune tiklar
    Then acilen yeni sekmeye gecer
    Then ilk urunun uzerinde bekler
    Then add to cart butonuna tiklar
    Then view cart butonuna tiklar
    Then Proceed to checkout butonuna tiklar
    And ilgili sayfaya gidildigini dogrular
    And sayfayi kapat

  Scenario: US_010 --> TC_006 - Continue Shopping butonuna basıldığında anasayfaya yönlendirdigi dogrulanmali.
    Given kullanici "url" sayfasina git
    Then subscribe popup kapatilir
    Then All categories butonuna tiklar
    Then copmuter ve accessories menusunun uzerinde bekler
    Then computer menusune tiklar
    Then acilen yeni sekmeye gecer
    Then ilk urunun uzerinde bekler
    Then add to cart butonuna tiklar
    Then view cart butonuna tiklar
    Then continue shopping butonuna tiklar
    And anasayfaya gidildigini dogrular
    And sayfayi kapat

  Scenario: US_010 --> TC_007 - Remove bölümündeki delete ikonuna tiklandiginda sepetteki ürünün silindigi ve total fiyatin degistigi dogrulanmali.
    Given kullanici "url" sayfasina git
    Then subscribe popup kapatilir
    Then All categories butonuna tiklar
    Then copmuter ve accessories menusunun uzerinde bekler
    Then computer menusune tiklar
    Then acilen yeni sekmeye gecer
    Then ilk urunun uzerinde bekler
    Then add to cart butonuna tiklar
    Then view cart butonuna tiklar
    Then urun silme butonuna tiklar
    And total fiyatin degistigini dogrular
    And sayfayi kapat


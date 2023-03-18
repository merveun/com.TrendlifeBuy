Feature: All Categories menüsü altındaki tüm kategorilerin görünür ve aktif olduğunu doğrulayın.

  Scenario: TC_001-Computer & Accessories, Electronics Devices,
            Watches & Accessories, Fashions, Toys,Kids&Babies,
            Bag&Shoes, Lifestyle&Home, TV & Home Appliances,
            Auto Mobiles & bikes kategorilerinin görünür olduğunu doğrulayın

    Given Kullanici Anasayfa "url" 'ine gider.
    Then  Subscribe popup kapatilir
    Then  All Categories dropdown menu’yu tiklar
    And   All Categories menusu altindaki tum kategorileri goruntulenir
    And   Sayfayi kapatir


    Scenario: TC_002-Computer & Accessories, Electronics Devices,
              Watches & Accessories, Fashions, Toys,Kids&Babies,
              Bag&Shoes, Lifestyle&Home, TV & Home Appliances,
              Auto Mobiles & bikes kategorilerinin aktif olduğunu doğrulayın

      Given Kullanici Anasayfa "url" 'ine gider.
      Then  Subscribe popup kapatilir
      Then  All Categories dropdown menu’yu tiklar
      And   All Categories menusu altindaki tum kategorilerin aktif oldugu dogrulanir
      And   Sayfayi kapatir
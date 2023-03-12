Feature: All Categories menüsü altındaki tüm kategorilerin görünür ve aktif olduğunu doğrulayın.

  Scenario: TC_001 -Computer & Accessories, Electronics Devices,
            Watches & Accessories, Fashions, Toys,Kids&Babies,
            Bag&Shoes, Lifestyle&Home, TV & Home Appliances,
            Auto Mobiles & bikes kategorilerinin görünür olduğunu doğrulayın

    Given Kullanici Anasayfa "url" 'ine gider.
    Then  All Categories dropdown menü’yü tıklar
    And   All Categories menüsü altındaki tüm kategorileri görüntülenir
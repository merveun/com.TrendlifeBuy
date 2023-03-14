Feature: Bir kullanici olarak satin alma gecmisimi görüntüleyebilmek icin
         Purchase History sayfasinin olmasini istiyorum.

  Scenario: TC_001-Dashboard sayfasinda bulunan side bar'daki Purchase History Linkinin
            Purchase History sayfasina yönlendirdigi dogrulanmali.

    Given Kullanici Anasayfa "url" 'ine gider.
    Then  Subscribe popup kapatilir
    Then  Login butonuna basar
    Then  Gecerli bir "customerEmail" ve "customerPassword" girer
    And   Signed in butonuna basar
    Then  DashBoard butonuna tiklar
    Then  Purchase History Linki tiklanir
    And   Purchase History sayfasina yonlendirdigi dogrulanir
    And   Sayfayi kapatir
  @must
  Scenario: TC_002-Purchase History sayfasindaki Purchase History listesinde
            görüntülenecek iceriklerin All History acilir penceresinde All History, Pending Orders,
            Confirmed Orders, Completed Orders, Refused&Cancelled Orders
            seceneklerine gore filtrelendigi dogrulanmali.

    Given Kullanici Anasayfa "url" 'ine gider.
    Then  Subscribe popup kapatilir
    Then  Login butonuna basar
    Then  Gecerli bir "customerEmail" ve "customerPassword" girer
    And   Signed in butonuna basar
    Then  DashBoard butonuna tiklar
    Then  Purchase History Linki tiklanir
    Then  All History dropdown tiklanir
    Then  ilgili seceneklere gore filtrelendigi gorulur
    And   Sayfayi kapatir


    Scenario: TC_003-Purchase History sayfasinda Purchase History listesindeki
              Actions sütunundan siparis özetlerinin görüntülenebildigi ve
              siparis faturasinin indirilebildigi dogrulanmali.

      Given Kullanici Anasayfa "url" 'ine gider.
      Then  Subscribe popup kapatilir
      Then  Login butonuna basar
      Then  Gecerli bir "customerEmail" ve "customerPassword" girer
      And   Signed in butonuna basar
      Then  DashBoard butonuna tiklar
      Then  Purchase History Linki tiklanir
      #pencereler arasi gecis



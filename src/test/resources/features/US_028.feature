Feature: Bir kullanici olarak begendigim ürünleri daha sonra degerlendirmek ve
         belkide satin almak icin bir sayfada listelenmesini istiyorum.


  Scenario: TC_001-Kullanicinin My Wishlist sayfasina erisebildigi dogrulanmali.

    Given Kullanici Anasayfa "url" 'ine gider.
    Then  Subscribe popup kapatilir
    Then  Login butonuna basar
    Then  Gecerli bir "customerEmailM" ve "customerPasswordM" girer
    And   Signed in butonuna basar
    Then  DashBoard butonuna tiklar
    Then  My Wishlist Linki tiklanir
    And   My Wishlist sayfasina yonlendirdigi dogrulanir
    And   Sayfayi kapatir


    Scenario: TC_002-My Wishlist sayfasinda kullanicinin begendigi ürünlerin listelendigi dogrulanmali.

      Given Kullanici Anasayfa "url" 'ine gider.
      Then  Subscribe popup kapatilir
      Then  Login butonuna basar
      Then  Gecerli bir "customerEmailM" ve "customerPasswordM" girer
      And   Signed in butonuna basar
      Then  DashBoard butonuna tiklar
      Then  My Wishlist Linki tiklanir
      And   My Wishlist sayfasinda kullanicinin begendigi ürünlerin listelendigi dogrulanir
      And   Sayfayi kapatir


    Scenario: TC_003-Wishlist'te ürünlerin New, Old, Price(Low to high), Price (High to low)
              seceneklerine göre siralanarak listelendigi dogrulanmali.

      Given Kullanici Anasayfa "url" 'ine gider.
      Then  Subscribe popup kapatilir
      Then  Login butonuna basar
      Then  Gecerli bir "customerEmailM" ve "customerPasswordM" girer
      And   Signed in butonuna basar
      Then  DashBoard butonuna tiklar
      Then  My Wishlist Linki tiklanir
      And   Urunlerin ilgili seceneklerine göre siralanarak listelendigi dogrulanir
      And   Sayfayi kapatir

  @must
      Scenario: TC_004-Wishlist sayfasinda gosterilecek Item sayisini
                8, 12, 16, 24, 32 olarak degistirilebilir oldugu dogrulanmali.

        Given Kullanici Anasayfa "url" 'ine gider.
        Then  Subscribe popup kapatilir
        Then  Login butonuna basar
        Then  Gecerli bir "customerEmailM" ve "customerPasswordM" girer
        And   Signed in butonuna basar
        Then  DashBoard butonuna tiklar
        Then  My Wishlist Linki tiklanir
        And   Urunlerin listeleme sayisini ilgili seceneklerine göre degistirilebilir oldugu dogrulanir
        And   Sayfayi kapatir
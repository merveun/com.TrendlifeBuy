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


    Scenario: TC_005-Wishlist'te ürünlerin üzerine gelindiginde Compare ikonunun göründügü ve
              Compare ikonuna tiklandiginda ilgili ürünü Compare sayfasina yükledigi dogrulanmali.

      Given Kullanici Anasayfa "url" 'ine gider.
      Then  Subscribe popup kapatilir
      Then  Login butonuna basar
      Then  Gecerli bir "customerEmailM" ve "customerPasswordM" girer
      And   Signed in butonuna basar
      Then  Wishlist Linki tiklanir
      Then  Buradaki urunlerin uzerine gelindiginde Compare ikonunun gorundugu dogrulanir
      And   Compare ikonuna tiklandiginda ilgili urunu Compare sayfasina yükledigi dogrulanir
      And   Sayfayi kapatir


    Scenario: TC_006-Wishlist'te ürünlerin üzerine gelindiginde Show ikonunun göründügü ve
              Show ikonuna tiklandiginda ilgili ürünün show penceresi acildigi dogrulanmali.

      Given Kullanici Anasayfa "url" 'ine gider.
      Then  Subscribe popup kapatilir
      Then  Login butonuna basar
      Then  Gecerli bir "customerEmailM" ve "customerPasswordM" girer
      And   Signed in butonuna basar
      Then  Wishlist Linki tiklanir
      Then  Buradaki urunlerin uzerine gelindiginde Show ikonunun gorundugu dogrulanir
      And   Show ikonuna tiklandiginda ilgili ürünün show penceresi acildigi dogrulanir
      And   Sayfayi kapatir

  @must
    Scenario: TC_007-Wishlist'te ürünlerin üzerine gelindiginde Delete ikonunun göründügü ve
              Delete ikonuna tiklandiginda acilan Delete penceresinden ilgili ürünün
              Wishlist'ten silindigi dogrulanmali.

      Given Kullanici Anasayfa "url" 'ine gider.
      Then  Subscribe popup kapatilir
      Then  Login butonuna basar
      Then  Gecerli bir "customerEmailM" ve "customerPasswordM" girer
      And   Signed in butonuna basar
      And   Yeni urun Wishliste eklenir
      Then  Wishlist Linki tiklanir
      Then  Buradaki urunlerin uzerine gelindiginde Delete ikonunun gorundugu dogrulanir
      And   Delete ikonuna tiklandiginda ilgili ürünün Wishlist'ten silindigi dogrulanir
      #And   Sayfayi kapatir

Feature: Siteye kayitli bir kullanici olarak siteden alis veris yapabilmek istiyorum.

  Scenario: Anasayfadan urun secerek alısverisin yapılmasi ve anasayfaya dönülmesi


    Given Kullanici Anasayfa "url" 'ine gider.
    Then Subscribe popup kapatilir
    Then Login butonu tiklanir.
    Then  Email adresini girer.
    And   Password unu girer.
    Then  Sign in butonu tıklanir.
    Then  Uygulamaya giris yaptigini dogrular.
    And Anasayfadaki urunlerden birinin ustune gelir.
    Then Add to cart butonun gorunurlugu dogrulanir.
    And Add to cart butonu tiklanir.
    Then Acilan popupda add to cart tiklanir.
    Then Item added to your cart penceresinde View Cart butonunun görünür oldugu dogrulanir.
    Then View cart butonu tiklanir.
    And Cart sayfasina yönlendirdigi dogrulanmali.
    Then Cart sayfasinda Proceed to Checkout butonunun gorunur oldugu dogrulanmali.
    Then Proceed to Checkout butonu tiklanir.
    And Proceed to Checkout butonuna tiklandiginda Checkout sayfasina yönlendirdigi dogrulanir.
    And Checkout sayfasinda Continue to Shipping butonunun gorunur oldugu dogrulanmali.
    Then Continue to Shipping butonunu tiklanir.
    And Shipping sayfasina yonlendirdigi dogrulanmali.
    And Free shipping radio button tiklanir.
    Then Continue to Payment butonunun gorunur oldugu dogrulanmali.
    And Continue to Payment butonu tiklanir.
    Then Payment sayfasina yonlendirdigi dogrulanmali.
    And Payment sayfasinda Pay Now butonunun gorunur oldugu dogrulanmali.
    Then Same as shipping adress secilir.
    Then Pay now butonu tiklanir.
    Then Thank you for your purchase! yazisi gorulerek siparisin alindigi dogrulanir.
    Then Order Summary sayfasinda Continue Shopping butonunun gorunur oldugu dogrulanir
    And Continue Shopping buttonuna tiklaninca ana sayfaya yonlendirdigi dogrulanir.



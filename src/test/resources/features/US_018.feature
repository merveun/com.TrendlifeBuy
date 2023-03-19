Feature: Bir kullanici olarak verdigim siparislerimin son durumunu takip edebilmek icin siparis detaylarini görebilecegim bir sayfanin olmasini istiyorum.

  Scenario:US_018--->TC_01801 My Order sayfasindaki urun boardindan Order Details butonuna tiklayinca ilgili siparisin detay sayfasina gidildigi dogrulanmali.

    Then Login butonuna tiklar
    Then Dashboard linkine tiklanir sayfaya yönlendirilir
    Then MyOrder linkine tiklanir
    Then My Order sayfasindaki urun boardindan Order Details butonuna tiklanir
    Then My Order sayfasindaki urun boardindan Order Details butonuna tiklayinca ilgili siparisin detay sayfasina gidildigi dogrulanmali.


  Scenario:US_018--->TC_01802 Order Details sayfasinda ilgili siparisin Order ID, Status, Order date, Order Amount, Package, Price, Shipping Info,Billing Info, Payment Info bilgilerinin goruntulendigi dogrulanmali

    Then Login butonuna tiklar
    Then Dashboard linkine tiklanir sayfaya yönlendirilir
    Then MyOrder linkine tiklanir
    Then My Order sayfasindaki urun boardindan Order Details butonuna tiklanir
    Then Order Details sayfasinda ilgili siparisin Order ID, Status, Order date, Order Amount, Package, Price, Shipping Info,Billing Info, Payment Info bilgilerinin goruntulendigi dogrulanmali

  Scenario: US_018--->TC_01803 Order Details sayfasinda ilgili siparis süreci ile ilgili Pending, Processing, Shipped, Recieved, Delivered asamalari görünür oldugu dogrulanmali.

    Then Login butonuna tiklar
    Then Dashboard linkine tiklanir sayfaya yönlendirilir
    Then MyOrder linkine tiklanir
    Then My Order sayfasindaki urun boardindan Order Details butonuna tiklanir
    Then Order Details sayfasinda ilgili siparis süreci ile ilgili Pending, Processing, Shipped, Recieved, Delivered asamalari görünür oldugu dogrulanmali.


  Scenario:  US_018--->TC_01804 Order Details sayfasinda Pending, Processing, Shipped, Recieved, Delivered asamalarinin aciklamalarini iceren textlerin görünür oldugu dogrulanmali.
    Then Login butonuna tiklar
    Then Dashboard linkine tiklanir sayfaya yönlendirilir
    Then MyOrder linkine tiklanir
    Then My Order sayfasindaki urun boardindan Order Details butonuna tiklanir
    Then Order Details sayfasinda Pending, Processing, Shipped, Recieved, Delivered asamalarinin aciklamalarini iceren textlerin görünür oldugu kontrol edilmeli


  Scenario:  US_018--->TC_01805 (Eger tamamlanmamis bir siparis ise) My Order sayfasindaki Cancel Order butonunun görünür oldugu ve Select cancel reason penceresine yönlendirme yaptigi dogrulanmali.
    Then Login butonuna tiklar
    Then Dashboard linkine tiklanir sayfaya yönlendirilir
    Then MyOrder linkine tiklanir
    Then  My Order sayfasindaki urun boardindan Order Details butonuna tiklanir
    Then (Eger tamamlanmamis bir siparis ise) My Order sayfasindaki Cancel Order butonunun görünür oldugu ve Select cancel reason penceresine yönlendirme yaptigi dogrulanmali.


  Scenario:US_018--->TC_01806 Açılan pencerede Reason dropbox'ından seçim yapılıp send butonuna tiklaninca girilen order'in iptal edildigi dogrulanmali.
    Then Login butonuna tiklar
    Then Dashboard linkine tiklanir sayfaya yönlendirilir
    Then MyOrder linkine tiklanir
    Then My Order sayfasindaki urun boardindan Order Details butonuna tiklanir
    Then cancel order butonuna tiklanir
    Then  Açılan pencerede Reason dropboxından seçim yapılıp send butonuna tiklanir ve girilen order'in iptal edildigi dogrulanir

  Scenario:US_018--->TC_01807 Order Details sayfasinda ürünle ilgili Shipping Info, Billing Info, Payment Info bilgilerine erisilebilir oldugu dogrulanmali
    Then Login butonuna tiklar
    Then Dashboard linkine tiklanir sayfaya yönlendirilir
    Then MyOrder linkine tiklanir
    Then cancel order butonuna tiklanir
    Then  Order Details sayfasinda ürünle ilgili Shipping Info, Billing Info, Payment Info bilgilerine erisilebilir oldugu dogrulanmali
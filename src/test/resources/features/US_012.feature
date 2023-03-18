Feature: Bir kullanici olarak alisveris yaptigim site yöneticileri ile iletisim kurabilmek icin sitede bir contact sayfasinin olmasini istiyorum.


  Scenario: Contact sayfasinda Call or WhatsApp, Get in touch,Social Media, Head office yazılarınin görünür oldugu doğrulanmali.

    Given kullanici "url" sayfasina git
    Then  subscribe popupu kapatilir
    Then Anasayfada Header kisminda Contact "contact_link"   linkine tiklanir.
    Then Contact sayfasinda Call or WhatsApp gorunur oldugunu dogrula
    Then Get in touch,Social Media, Head office yazilarinin gorunur oldugunu dogrula


    Scenario: Get in Touch bölümündeki Text Box'lara Name, E-mail,
    Messages ve Customer/Installation/Product Returns kısımları kriterlere uygun olarak doldurulduktan
    sonra Send Message butonuna tiklandiginda emailin başarılı bir şekilde gönderildiği doğrulanmalı.

      Given kullanici "url" sayfasina git
      Then  subscribe popupu kapatilir
      Then Anasayfada Header kisminda Contact "contact_link"   linkine tiklanir.
      And Get in Touch bolumundeki Text Box'lara Name, E-mail, Messages ve Customer,Installation,Product Returns kısımları kriterlere uygun  doldurulur
      Then Send Message butonuna tiklanir
      Then Emailin başarili bir şekilde gönderildigi dogrulanir


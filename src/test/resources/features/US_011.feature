Feature: US_011 Bir kullanici olarak alisveris yaptigim sitede ürünler veya alisveris ile ilgili farkli bilgi ve görüslerden faydalanabilecegim bir blog sayfasi olmasini istiyorum.





  Scenario: US_011--> TC_01101 Blog baslikalarina tiklandiginda blog yazisinin oldugu sayfaya gidildigi dogrulanmali.


    Given kullanici "url" sayfasina git
    Then  subscribe popupu kapatilir
    Given Anasayfada Header kisminda "header_blog_link"   linkine tiklanir.
    Then Blog sayfasinda oldugu dogrulanir


    Scenario:  US_011-->TC_01102 Read more linkine tıklandığında ilgili sayfaya yönlendirdigi dogrulanmali.

      Given kullanici "url" sayfasina git
      Then  subscribe popupu kapatilir
      Given Anasayfada Header kisminda "header_blog_link"   linkine tiklanir.
      Given sayfada asagi yonde inilir
      Then Read More linkine tiklandiginda ilgili sayfaya yonlendirildigi dogrulanir

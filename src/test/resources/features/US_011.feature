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


  Scenario: US_011-->TC_01103 Search Post Box'dan Bloglar icinde arama yapilabildigi dogrulanmali.

    Given kullanici "url" sayfasina git
    Then  subscribe popupu kapatilir

    Given Anasayfada Header kisminda "header_blog_link"   linkine tiklanir.

    Then SearchPostBox kutusunda blog araması icin blog ismi girilir
    Then Searchboxa girilen blogun arandigi dogru blog un geldigi dogrulanir

  Scenario: US_011-->TC_01104 Category bölümündeki başlıklara göre ilgili bloglarin görüntülendigi dogrulanmali.

    Given kullanici "url" sayfasina git
    Then  subscribe popupu kapatilir
    Given Anasayfada Header kisminda "header_blog_link"   linkine tiklanir.
    Then Category bölümündeki baslıklara tiklanir ilgili bloglarin goruntulendigi kontrol edilir dogrulanir


  Scenario:  US_011-->TC_01105 Keyword bolumundeki basliklara gore ilgili bloglar goruntulendigi dogrulanmali.

    Given kullanici "url" sayfasina git
    Then  subscribe popupu kapatilir
    Given Anasayfada Header kisminda "header_blog_link"   linkine tiklanir.
    Then Keyword bolumundeki basliklara tiklanir  da ilgili bloglarin goruntulendigi kontrol edilir dogrulanir

  Scenario: US_011-->TC_01106  Popular Posts bölümünde ilgili bloglarin görüntülendigi dogrulanmali.


    Given kullanici "url" sayfasina git
    Then  subscribe popupu kapatilir
    Given Anasayfada Header kisminda "header_blog_link"   linkine tiklanir.
    Then  Popular Posts bolumundeki basliklar da ilgili bloglarin goruntulendigi kontrol edilir dogrulanir


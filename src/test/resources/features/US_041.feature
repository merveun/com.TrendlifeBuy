Feature: US_041 - US_041 - Bir yönetici olarak acilan support ticketleri ile ilgili
  islemleri yapabilmek icin support ticket sayfasinin olamsini istiyorum.

  Scenario: US_041 --> TC_001 - Support Ticket linki ile Support Ticket sayfasina gidildigi dogrulanir

    Given kullanici "adminLogin" sayfasina git
    Given kullanici bilgilerini gir
    Given sign in butonuna tiklar
    Then supportTicket dropdownuna tiklar
    Then support ticket butonuna tiklar
    And "adminTicketPage" sayfasina gittigi dogrulanir
    And sayfayi kapat


  Scenario: US_041 --> TC_002 - Support Ticket sayfasinda Add New butonuna tiklaninca Open a Ticket sayfasina yönlendirdigi dogrulanmali

    Given kullanici "adminLogin" sayfasina git
    Given kullanici bilgilerini gir
    Given sign in butonuna tiklar
    Then supportTicket dropdownuna tiklar
    Then support ticket butonuna tiklar
    Then add new butonuna tiklar
    And "adminOpenaTicket" sayfasina gittigi dogrulanir
    And sayfayi kapat

  Scenario: US_041 --> TC_003 - Yeni bir ticket acma sayfasinda Subject, User List,
  Assign to, Description, Category List, Priority, Status, Attach File bilgilerinin girilmesinin istendigi dogrulanmali

    Given kullanici "adminLogin" sayfasina git
    Given kullanici bilgilerini gir
    Given sign in butonuna tiklar
    Then supportTicket dropdownuna tiklar
    Then support ticket butonuna tiklar
    Then add new butonuna tiklar
    Then create ticket butonuna tiklar
    And gerekli yazilarin gorunur oldugunu dogrular
    And sayfayi kapat

  Scenario: US_041 --> TC_004 - Browser butonunun yanindaki plus (+) butonu ile yeni Browser butonlarinin olusturuldugu dogrulanmali

    Given kullanici "adminLogin" sayfasina git
    Given kullanici bilgilerini gir
    Given sign in butonuna tiklar
    Then supportTicket dropdownuna tiklar
    Then support ticket butonuna tiklar
    Then add new butonuna tiklar
    Then new browser add butonuna tiklar
    And yeni browserBox olustugunu dogrular
    And sayfayi kapat

  Scenario: US_041 --> TC_005 - Sonradan olusturulan Browser butonunun yanindaki delete ikonu ile browser butonlarinin silindigi dogrulanmali

    Given kullanici "adminLogin" sayfasina git
    Given kullanici bilgilerini gir
    Given sign in butonuna tiklar
    Then supportTicket dropdownuna tiklar
    Then support ticket butonuna tiklar
    Then add new butonuna tiklar
    Then new browser add butonuna tiklar
    Then delete browser butonuna tiklar
    And browserBox silindigini dogrular
    And sayfayi kapat


  Scenario: US_041 --> TC_006 - Create Ticket butonuna tiklanarak sayfada girilen bilgilerle bir ticket acildigi dogrulanmali

      Given kullanici "adminLogin" sayfasina git
      Given kullanici bilgilerini gir
      Given sign in butonuna tiklar
      Then supportTicket dropdownuna tiklar
      Then support ticket butonuna tiklar
      Then add new butonuna tiklar
      Then ticket bilgilerini doldurur
      And create ticket butonuna tiklar
      Then ticket listte yeni ticket olusturuldugunu dogrular
      And sayfayi kapat

  @41
  Scenario: US_041 --> TC_007 - Support Ticket sayfasinda Category dropbox'indaki seceneklerinin görünür ve secilebilir oldugu dogrulanmali

    Given kullanici "adminLogin" sayfasina git
    Given kullanici bilgilerini gir
    Given sign in butonuna tiklar
    Then supportTicket dropdownuna tiklar
    Then support ticket butonuna tiklar
    Then category dropbox seceneklerinin gorunu ve secilebilir oldugunu dogrular
    And sayfayi kapat


    Scenario: US_041 --> TC_008 - Support Ticket sayfasinda Priority dropdown'dan Select One,
    High, Medium, Low seceneklerinin görünür ve secilebilir oldugu dogrulanmali

      Given kullanici "adminLogin" sayfasina git
      Given kullanici bilgilerini gir
      Given sign in butonuna tiklar
      Then supportTicket dropdownuna tiklar
      Then support ticket butonuna tiklar
      Then priority dropbox seceneklerinin gorunur ve secilebilir oldugunu dogrular
      And sayfayi kapat

#BUG
  @demo
  Scenario: US_041 --> TC_009 - Support Ticket sayfasinda User List dropdown'dan
      herhangi bir kullanıcının görünür ve secilebilir oldugu dogrulanmali

    Given kullanici "adminLogin" sayfasina git
    Given kullanici bilgilerini gir
    Given sign in butonuna tiklar
    Then supportTicket dropdownuna tiklar
    Then support ticket butonuna tiklar
    Then user dropbox seceneklerinin gorunur ve secilebilir oldugunu dogrular
    And sayfayi kapat

  Scenario: US_041 --> TC_010 - Support Ticket sayfasinda Status dropdown'dan Select One,
  Pending, On Going, Completed, Closed seceneklerinin görünür ve secilebilir oldugu dogrulanmali

    Given kullanici "adminLogin" sayfasina git
    Given kullanici bilgilerini gir
    Given sign in butonuna tiklar
    Then supportTicket dropdownuna tiklar
    Then support ticket butonuna tiklar
    Then status dropbox seceneklerinin gorunur ve secilebilir oldugunu dogrular
    And sayfayi kapat

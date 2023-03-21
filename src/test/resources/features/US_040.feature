Feature:bir yönetici olarak support ticket acabilmem icin bir sayfanin olmasini istiyorum.

  Background:
    Given Kullanici "urlAdmin" sayfasina giris yaparak login sayfasini acar.
    Then  Gecerli email adresini mail textboxina girer
    Then  Gecerli Passwordu password textboxina  girer
    Then  Sign in butonu tiklaniry.
    Then  Support Ticket butonu tiklaniry
    And   My ticket butonu tiklaniry.




  Scenario: US_040 ---> TC_001 My ticket linkinin ilgili sayfaya giittigi dogrulanmali
    Then Ticket List alaninin oldugu dogrulaniry.

  Scenario: US_040 ---> TC_002 My Ticket sayfasinda Category sekmesinden Select One, Installation,
  Technical, Others seceneklerinin görünür ve secilebilir oldugu dogrulanmali

    Then Category dropdown i tiklanir.
    And Select One, Installation,Technical, Others seceneklerinin gorunur oldugu dogrulanir
    And Select One, Installation,Technical, Others secilebilir oldugu dogrulanmali


  Scenario: US_040 ---> TC_003 My Ticketupport Ticket sayfasinda Priority sekmesinden
  Select One, High, Medium, Low seceneklerinin görünür ve secilebilir oldugu dogrulanmali

    Then Priority dropdown i tiklanir.
    And Select One, High, Medium, Low seceneklerinin gorunur oldugu dogrulanir
    And Select One, High, Medium, Low secilebilir oldugu dogrulanmali


  Scenario: US_040 ---> TC_004 My Ticket sayfasinda Status sekmesinden Select One, Pending, On Going, Completed, Closed
  seceneklerinin görünür ve secilebilir oldugu dogrulanmali

    Then Status dropdown i tiklanir.
    And Select One, Pending, On Going, Completed, Closed seceneklerinin gorunur oldugu dogrulanir
    And Select One, Pending, On Going, Completed, Closed secilebilir oldugu dogrulanmali


  Scenario: US_040 ---> TC_005  Category, Priority ve Status sekmelerinden yapilan filtrelemeye
  göre Ticket List'in olustugu dogrulanmali

    Then Category dropdown i tiklanir.
    Then Installation secenegi secilir
    Then Priority dropdown i tiklanir.
    Then High secenegi secilir
    Then Status dropdown i tiklanir.
    Then Pending secenegi secilir
    And Search butonu tiklanir.
    Then Ticket list de ticket goruldugu dogrulanir.

  Scenario: US_040 ---> TC_006  Ticket List de Ticketlar Subject, Category, User Name, priority, User Agent,
  Status, Agent Asign, Action basliklari altinda listelendigi dogrulanmali

    Then Category dropdown i tiklanir.
    Then Installation secenegi secilir
    Then Priority dropdown i tiklanir.
    Then High secenegi secilir
    Then Status dropdown i tiklanir.
    Then Pending secenegi secilir
    And Search butonu tiklanir.
    Then Subject, Category, User Name, priority, User Agent, Status, Agent Asign, Action basliklari altinda listelendigi dogrulanir



